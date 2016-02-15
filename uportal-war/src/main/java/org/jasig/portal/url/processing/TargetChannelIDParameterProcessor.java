package org.jasig.portal.url.processing;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jasig.portal.layout.IStylesheetUserPreferencesService;
import org.jasig.portal.layout.IStylesheetUserPreferencesService.PreferencesScope;
import org.jasig.portal.portlet.om.IPortletEntity;
import org.jasig.portal.portlet.om.IPortletWindow;
import org.jasig.portal.portlet.om.IPortletWindowId;
import org.jasig.portal.portlet.registry.IPortletWindowRegistry;
import org.jasig.portal.url.IPortalRequestInfo;
import org.jasig.portal.url.IPortletRequestInfo;
import org.jasig.portal.url.IUrlSyntaxProvider;
import org.jasig.portal.user.IUserInstanceManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * A simple processor for injecting the current channel ID (ID of the channel the user is interacting with) to the structure and theme transformation stylesheet 
 * It is usefull for the canadianModeEmulation which use this parameter to find the channel to display (Structure transformation).
 * Also it is usefull to emulate the portlet anchoring mechanism via javascrip (jumping to the portlet the user is using)
 * @author ofranco
 *
 */
@Service("targetChannelIDRequestParameterProcessor")
public class TargetChannelIDParameterProcessor implements
		IRequestParameterProcessor {

	protected final Log logger = LogFactory.getLog(getClass());
	
	private IStylesheetUserPreferencesService stylesheetUserPreferencesService;
	private IUserInstanceManager userInstanceManager;
	private IUrlSyntaxProvider urlSyntaxProvider;
	private IPortletWindowRegistry portletWindowRegistry;
	
	 @Autowired
    public void setStylesheetUserPreferencesService(IStylesheetUserPreferencesService stylesheetUserPreferencesService) {
        this.stylesheetUserPreferencesService = stylesheetUserPreferencesService;
    }

    @Autowired
    public void setUserInstanceManager(IUserInstanceManager userInstanceManager) {
        this.userInstanceManager = userInstanceManager;
    }
    
    @Autowired
    public void setUrlSyntaxProvider(IUrlSyntaxProvider urlSyntaxProvider) {
        this.urlSyntaxProvider = urlSyntaxProvider;
    }

    @Autowired
    public void setPortletWindowRegistry(IPortletWindowRegistry portletWindowRegistry) {
        this.portletWindowRegistry = portletWindowRegistry;
    }
    
	@Override
	public boolean processParameters(HttpServletRequest request, HttpServletResponse response) {
		
		IPortalRequestInfo portalRequestInfo = urlSyntaxProvider.getPortalRequestInfo(request);
		String targetChannelID = "none";
		IPortletRequestInfo portletRequestInfo = portalRequestInfo.getTargetedPortletRequestInfo();
		if ( portletRequestInfo != null ) {
			  final IPortletWindowId targetWindowId = portletRequestInfo.getPortletWindowId();
              final IPortletWindow portletWindow = this.portletWindowRegistry.getPortletWindow(request, targetWindowId);
              if ( portletWindow != null ) {
            	  final IPortletEntity portletEntity = portletWindow.getPortletEntity();
            	  if ( portletEntity != null ) targetChannelID = portletEntity.getLayoutNodeId();
              }
              
		}
		if ( logger.isDebugEnabled() ) {
			logger.debug("Having targetNodeId = "+targetChannelID);
		}
		// inform theme for the current targeted channel
		stylesheetUserPreferencesService.setStylesheetParameter(request, PreferencesScope.THEME, "targetChannelID", targetChannelID);
		// inform structure for the current targeted channel
		stylesheetUserPreferencesService.setStylesheetParameter(request, PreferencesScope.STRUCTURE, "targetChannelID", targetChannelID);
		return true;
	}

}
