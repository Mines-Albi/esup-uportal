/**
 * Copyright 2007 The JA-SIG Collaborative.  All rights reserved.
 * See license distributed with this file and
 * available online at http://www.uportal.org/license.html
 */
package org.jasig.portal.channels.portlet;

import java.io.PrintWriter;
import java.util.Collections;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import junit.framework.TestCase;

import org.apache.commons.io.output.NullOutputStream;
import org.apache.pluto.OptionalContainerServices;
import org.apache.pluto.PortletContainer;
import org.apache.pluto.descriptors.portlet.PortletDD;
import org.apache.pluto.spi.optional.PortletRegistryService;
import org.easymock.EasyMock;
import org.easymock.IAnswer;
import org.jasig.portal.ChannelCacheKey;
import org.jasig.portal.ChannelRuntimeData;
import org.jasig.portal.ChannelStaticData;
import org.jasig.portal.PortalControlStructures;
import org.jasig.portal.mock.portlet.om.MockPortletDefinition;
import org.jasig.portal.mock.portlet.om.MockPortletDefinitionId;
import org.jasig.portal.mock.portlet.om.MockPortletEntityId;
import org.jasig.portal.mock.portlet.om.MockPortletWindowId;
import org.jasig.portal.portlet.om.IPortletDefinition;
import org.jasig.portal.portlet.om.IPortletDefinitionId;
import org.jasig.portal.portlet.om.IPortletEntity;
import org.jasig.portal.portlet.om.IPortletEntityId;
import org.jasig.portal.portlet.om.IPortletWindow;
import org.jasig.portal.portlet.om.IPortletWindowId;
import org.jasig.portal.portlet.registry.IPortletDefinitionRegistry;
import org.jasig.portal.portlet.registry.IPortletEntityRegistry;
import org.jasig.portal.portlet.registry.IPortletWindowRegistry;
import org.jasig.portal.portlet.url.IPortletRequestParameterManager;
import org.jasig.portal.portlet.url.PortletRequestInfo;
import org.jasig.portal.portlet.url.RequestType;
import org.jasig.portal.security.IPerson;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

/**
 * @author Eric Dalquist
 * @version $Revision$
 */
public class SpringPortletChannelImplTest extends TestCase {
    private SpringPortletChannelImpl springPortletChannel;
    
    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    @Override
    protected void setUp() throws Exception {
        this.springPortletChannel = new SpringPortletChannelImpl();
    }

    /* (non-Javadoc)
     * @see junit.framework.TestCase#tearDown()
     */
    @Override
    protected void tearDown() throws Exception {
        this.springPortletChannel = null;
    }

    public void testInitSession() throws Exception {
        final ChannelStaticData channelStaticData = new ChannelStaticData();
        channelStaticData.setChannelPublishId("1");
        channelStaticData.setChannelSubscribeId("sub1");
        
        final IPerson person = EasyMock.createMock(IPerson.class);
        channelStaticData.setPerson(person);

        
        final MockHttpServletRequest request = new MockHttpServletRequest();
        final MockHttpServletResponse response = new MockHttpServletResponse();
        
        final PortalControlStructures portalControlStructures = new PortalControlStructures(request, response);
        final HttpServletRequest pcsRequest = portalControlStructures.getHttpServletRequest();
        
        
        final IPortletDefinitionId portDef1 = new MockPortletDefinitionId("portDef1");
        
        final IPortletDefinitionRegistry portletDefinitionRegistry = EasyMock.createMock(IPortletDefinitionRegistry.class);
        EasyMock.expect(portletDefinitionRegistry.getPortletDefinition(1)).andReturn(new MockPortletDefinition(portDef1, 1, "portApp1", "port1"));
        
        
        final IPortletEntityId portletEntityId = new MockPortletEntityId("ent1");
        
        
        final IPortletEntity portletEntity = EasyMock.createMock(IPortletEntity.class);
        EasyMock.expect(portletEntity.getPortletEntityId()).andReturn(portletEntityId);

        
        final IPortletEntityRegistry portletEntityRegistry = EasyMock.createMock(IPortletEntityRegistry.class);
        EasyMock.expect(portletEntityRegistry.getOrCreatePortletEntity(portDef1, "sub1", person)).andReturn(portletEntity);

        
        final IPortletWindowId portletWindowId = new MockPortletWindowId("win1");

        
        final IPortletWindow portletWindow = EasyMock.createMock(IPortletWindow.class);
        EasyMock.expect(portletWindow.getPortletWindowId()).andReturn(portletWindowId);
        

        final IPortletWindowRegistry portletWindowRegistry = EasyMock.createMock(IPortletWindowRegistry.class);
        EasyMock.expect(portletWindowRegistry.getOrCreatePortletWindow(pcsRequest, "sub1", portletEntityId)).andReturn(portletWindow);
        
        
        final PortletContainer portletContainer = EasyMock.createMock(PortletContainer.class);
        portletContainer.doLoad(portletWindow, pcsRequest, response);
        EasyMock.expectLastCall();
        
        
        this.springPortletChannel.setPortletDefinitionRegistry(portletDefinitionRegistry);
        this.springPortletChannel.setPortletEntityRegistry(portletEntityRegistry);
        this.springPortletChannel.setPortletWindowRegistry(portletWindowRegistry);
        this.springPortletChannel.setPortletContainer(portletContainer);
        
        EasyMock.replay(portletDefinitionRegistry, portletContainer, portletWindow, portletWindowRegistry, portletEntity, portletEntityRegistry, person);
        
        this.springPortletChannel.initSession(channelStaticData, portalControlStructures);
        
        EasyMock.verify(portletDefinitionRegistry, portletContainer, portletWindow, portletWindowRegistry, portletEntity, portletEntityRegistry, person);
    }

    public void testAction() throws Exception {
        final IPerson person = EasyMock.createMock(IPerson.class);

        
        final ChannelStaticData channelStaticData = new ChannelStaticData();
        channelStaticData.setChannelPublishId("pub1");
        channelStaticData.setChannelSubscribeId("sub1");
        channelStaticData.setPerson(person);

        
        final MockHttpServletRequest request = new MockHttpServletRequest();
        final MockHttpServletResponse response = new MockHttpServletResponse();
        
        final PortalControlStructures portalControlStructures = new PortalControlStructures(request, response);
        final HttpServletRequest pcsRequest = portalControlStructures.getHttpServletRequest();
        
        
        final ChannelRuntimeData channelRuntimeData = new ChannelRuntimeData();
        
        
        final IPortletWindowId portletWindowId = new MockPortletWindowId("win1");
        this.springPortletChannel.setPortletWidnowId(channelStaticData, portletWindowId);

        
        final IPortletWindow portletWindow = EasyMock.createMock(IPortletWindow.class);
        

        final IPortletWindowRegistry portletWindowRegistry = EasyMock.createMock(IPortletWindowRegistry.class);
        EasyMock.expect(portletWindowRegistry.getPortletWindow(pcsRequest, portletWindowId)).andReturn(portletWindow);
        
        
        final PortletContainer portletContainer = EasyMock.createMock(PortletContainer.class);
        portletContainer.doAction(portletWindow, new PortletParameterRequestWrapper(pcsRequest, Collections.EMPTY_MAP), response);
        EasyMock.expectLastCall();
        
        
        final PortletRequestInfo portletRequestInfo = new PortletRequestInfo(RequestType.RENDER);
        
        final IPortletRequestParameterManager portletRequestParameterManager = EasyMock.createMock(IPortletRequestParameterManager.class);
        EasyMock.expect(portletRequestParameterManager.getPortletRequestInfo(pcsRequest, portletWindowId)).andReturn(portletRequestInfo);
        
        
        this.springPortletChannel.setPortletRequestParameterManager(portletRequestParameterManager);
        this.springPortletChannel.setPortletWindowRegistry(portletWindowRegistry);
        this.springPortletChannel.setPortletContainer(portletContainer);
        
        EasyMock.replay(portletRequestParameterManager, portletContainer, portletWindow, portletWindowRegistry, person);
        
        this.springPortletChannel.action(channelStaticData, portalControlStructures, channelRuntimeData);
        
        EasyMock.verify(portletRequestParameterManager, portletContainer, portletWindow, portletWindowRegistry, person);
    }

    public void testGenerateCacheKey() throws Exception {
        final ChannelStaticData channelStaticData = new ChannelStaticData();

        final PortalControlStructures portalControlStructures = new PortalControlStructures(new MockHttpServletRequest(), null);
        
        final ChannelRuntimeData channelRuntimeData = new ChannelRuntimeData();
        
        
        final ChannelCacheKey key = this.springPortletChannel.generateKey(channelStaticData, portalControlStructures, channelRuntimeData);
        
        assertEquals(ChannelCacheKey.INSTANCE_KEY_SCOPE, key.getKeyScope());
        assertEquals("INSTANCE_EXPIRATION_CACHE_KEY", key.getKey());
        assertTrue("Expected validity object to be of type Long", key.getKeyValidity() instanceof Long);
    }

    public void testIsCacheValidTargetedPorlet() throws Exception {
        final ChannelStaticData channelStaticData = new ChannelStaticData();
        channelStaticData.setChannelPublishId("pub1");
        channelStaticData.setChannelSubscribeId("sub1");
        
        final IPerson person = EasyMock.createMock(IPerson.class);
        channelStaticData.setPerson(person);


        final MockHttpServletRequest request = new MockHttpServletRequest();
        final MockHttpServletResponse response = new MockHttpServletResponse();
        
        final PortalControlStructures portalControlStructures = new PortalControlStructures(request, response);
        final HttpServletRequest pcsRequest = portalControlStructures.getHttpServletRequest();
        
        
        final ChannelRuntimeData channelRuntimeData = new ChannelRuntimeData();
        
        
        final IPortletWindowId portletWindowId = new MockPortletWindowId("win1");
        this.springPortletChannel.setPortletWidnowId(channelStaticData, portletWindowId);

        
        final IPortletWindow portletWindow = EasyMock.createMock(IPortletWindow.class);
        

        final IPortletWindowRegistry portletWindowRegistry = EasyMock.createMock(IPortletWindowRegistry.class);
        EasyMock.expect(portletWindowRegistry.getPortletWindow(pcsRequest, portletWindowId)).andReturn(portletWindow);
        
        
        final IPortletRequestParameterManager portletRequestParameterManager = EasyMock.createMock(IPortletRequestParameterManager.class);
        EasyMock.expect(portletRequestParameterManager.getTargetedPortletWindowIds(pcsRequest)).andReturn(Collections.singleton(portletWindowId));
        
        
        this.springPortletChannel.setPortletWindowRegistry(portletWindowRegistry);
        this.springPortletChannel.setPortletRequestParameterManager(portletRequestParameterManager);
        
        //Test targeted portlet
        EasyMock.replay(portletRequestParameterManager, portletWindow, portletWindowRegistry, person);
        
        final boolean valid = this.springPortletChannel.isCacheValid(channelStaticData, portalControlStructures, channelRuntimeData, null);
        assertFalse(valid);
        
        EasyMock.verify(portletRequestParameterManager, portletWindow, portletWindowRegistry, person);
    }


    public void testIsCacheValidNotConfigured() throws Exception {
        final ChannelStaticData channelStaticData = new ChannelStaticData();
        channelStaticData.setChannelPublishId("pub1");
        channelStaticData.setChannelSubscribeId("sub1");
        
        final IPerson person = EasyMock.createMock(IPerson.class);
        channelStaticData.setPerson(person);


        final MockHttpServletRequest request = new MockHttpServletRequest();
        final MockHttpServletResponse response = new MockHttpServletResponse();
        
        final PortalControlStructures portalControlStructures = new PortalControlStructures(request, response);
        final HttpServletRequest pcsRequest = portalControlStructures.getHttpServletRequest();
        
        
        final ChannelRuntimeData channelRuntimeData = new ChannelRuntimeData();
        
        
        final IPortletWindowId portletWindowId = new MockPortletWindowId("win1");
        this.springPortletChannel.setPortletWidnowId(channelStaticData, portletWindowId);

        
        final IPortletDefinition portletDefinition = EasyMock.createMock(IPortletDefinition.class);
        EasyMock.expect(portletDefinition.getPortletApplicationId()).andReturn("app1");
        EasyMock.expect(portletDefinition.getPortletName()).andReturn("port1");
        
        
        final IPortletEntityId portletEntityId = new MockPortletEntityId("ent1");
        
        
        final IPortletEntity portletEntity = EasyMock.createMock(IPortletEntity.class);
        EasyMock.expect(portletEntity.getPortletEntityId()).andReturn(portletEntityId);
        
        
        final IPortletEntityRegistry portletEntityRegistry = EasyMock.createMock(IPortletEntityRegistry.class);
        EasyMock.expect(portletEntityRegistry.getParentPortletDefinition(portletEntityId)).andReturn(portletDefinition);

        
        final IPortletWindow portletWindow = EasyMock.createMock(IPortletWindow.class);
        

        final IPortletWindowRegistry portletWindowRegistry = EasyMock.createMock(IPortletWindowRegistry.class);
        EasyMock.expect(portletWindowRegistry.getPortletWindow(pcsRequest, portletWindowId)).andReturn(portletWindow);
        EasyMock.expect(portletWindowRegistry.getParentPortletEntity(pcsRequest, portletWindowId)).andReturn(portletEntity);
        
        
        final IPortletRequestParameterManager portletRequestParameterManager = EasyMock.createMock(IPortletRequestParameterManager.class);
        EasyMock.expect(portletRequestParameterManager.getTargetedPortletWindowIds(pcsRequest)).andReturn(Collections.EMPTY_SET);
        
        
        final PortletDD portletDD = new PortletDD();
        
        
        final PortletRegistryService portletRegistryService = EasyMock.createMock(PortletRegistryService.class);
        EasyMock.expect(portletRegistryService.getPortletDescriptor("app1", "port1")).andReturn(portletDD);
        
        final OptionalContainerServices optionalContainerServices = EasyMock.createMock(OptionalContainerServices.class);
        EasyMock.expect(optionalContainerServices.getPortletRegistryService()).andReturn(portletRegistryService);

        
        this.springPortletChannel.setPortletWindowRegistry(portletWindowRegistry);
        this.springPortletChannel.setPortletRequestParameterManager(portletRequestParameterManager);
        this.springPortletChannel.setPortletEntityRegistry(portletEntityRegistry);
        this.springPortletChannel.setOptionalContainerServices(optionalContainerServices);
        
        EasyMock.replay(portletRegistryService, optionalContainerServices, portletDefinition, portletRequestParameterManager, portletEntity, portletEntityRegistry, portletWindow, portletWindowRegistry, person);
        
        final boolean valid = this.springPortletChannel.isCacheValid(channelStaticData, portalControlStructures, channelRuntimeData, null);
        assertFalse(valid);
        
        EasyMock.verify(portletRegistryService, optionalContainerServices, portletDefinition, portletRequestParameterManager, portletEntity, portletEntityRegistry, portletWindow, portletWindowRegistry, person);
    }


    public void testIsCacheValidNeverCache() throws Exception {
        final ChannelStaticData channelStaticData = new ChannelStaticData();
        channelStaticData.setChannelPublishId("pub1");
        channelStaticData.setChannelSubscribeId("sub1");
        
        final IPerson person = EasyMock.createMock(IPerson.class);
        channelStaticData.setPerson(person);


        final MockHttpServletRequest request = new MockHttpServletRequest();
        final MockHttpServletResponse response = new MockHttpServletResponse();
        
        final PortalControlStructures portalControlStructures = new PortalControlStructures(request, response);
        final HttpServletRequest pcsRequest = portalControlStructures.getHttpServletRequest();
        
        
        final ChannelRuntimeData channelRuntimeData = new ChannelRuntimeData();
        
        
        final IPortletWindowId portletWindowId = new MockPortletWindowId("win1");
        this.springPortletChannel.setPortletWidnowId(channelStaticData, portletWindowId);

        
        final IPortletDefinition portletDefinition = EasyMock.createMock(IPortletDefinition.class);
        EasyMock.expect(portletDefinition.getPortletApplicationId()).andReturn("app1");
        EasyMock.expect(portletDefinition.getPortletName()).andReturn("port1");
        
        
        final IPortletEntityId portletEntityId = new MockPortletEntityId("ent1");
        
        
        final IPortletEntity portletEntity = EasyMock.createMock(IPortletEntity.class);
        EasyMock.expect(portletEntity.getPortletEntityId()).andReturn(portletEntityId);
        
        
        final IPortletEntityRegistry portletEntityRegistry = EasyMock.createMock(IPortletEntityRegistry.class);
        EasyMock.expect(portletEntityRegistry.getParentPortletDefinition(portletEntityId)).andReturn(portletDefinition);

        
        final IPortletWindow portletWindow = EasyMock.createMock(IPortletWindow.class);
        EasyMock.expect(portletWindow.getExpirationCache()).andReturn(null);
        

        final IPortletWindowRegistry portletWindowRegistry = EasyMock.createMock(IPortletWindowRegistry.class);
        EasyMock.expect(portletWindowRegistry.getPortletWindow(pcsRequest, portletWindowId)).andReturn(portletWindow);
        EasyMock.expect(portletWindowRegistry.getParentPortletEntity(pcsRequest, portletWindowId)).andReturn(portletEntity);
        
        
        final IPortletRequestParameterManager portletRequestParameterManager = EasyMock.createMock(IPortletRequestParameterManager.class);
        EasyMock.expect(portletRequestParameterManager.getTargetedPortletWindowIds(pcsRequest)).andReturn(Collections.EMPTY_SET);
        
        
        final PortletDD portletDD = new PortletDD();
        portletDD.setExpirationCache(0);
        
        
        final PortletRegistryService portletRegistryService = EasyMock.createMock(PortletRegistryService.class);
        EasyMock.expect(portletRegistryService.getPortletDescriptor("app1", "port1")).andReturn(portletDD);
        
        final OptionalContainerServices optionalContainerServices = EasyMock.createMock(OptionalContainerServices.class);
        EasyMock.expect(optionalContainerServices.getPortletRegistryService()).andReturn(portletRegistryService);

        
        this.springPortletChannel.setPortletWindowRegistry(portletWindowRegistry);
        this.springPortletChannel.setPortletRequestParameterManager(portletRequestParameterManager);
        this.springPortletChannel.setPortletEntityRegistry(portletEntityRegistry);
        this.springPortletChannel.setOptionalContainerServices(optionalContainerServices);
        
        EasyMock.replay(portletRegistryService, optionalContainerServices, portletDefinition, portletRequestParameterManager, portletEntity, portletEntityRegistry, portletWindow, portletWindowRegistry, person);
        
        final boolean valid = this.springPortletChannel.isCacheValid(channelStaticData, portalControlStructures, channelRuntimeData, null);
        assertFalse(valid);
        
        EasyMock.verify(portletRegistryService, optionalContainerServices, portletDefinition, portletRequestParameterManager, portletEntity, portletEntityRegistry, portletWindow, portletWindowRegistry, person);
    }


    public void testIsCacheValidAlwaysCache() throws Exception {
        final ChannelStaticData channelStaticData = new ChannelStaticData();
        channelStaticData.setChannelPublishId("pub1");
        channelStaticData.setChannelSubscribeId("sub1");
        
        final IPerson person = EasyMock.createMock(IPerson.class);
        channelStaticData.setPerson(person);


        final MockHttpServletRequest request = new MockHttpServletRequest();
        final MockHttpServletResponse response = new MockHttpServletResponse();
        
        final PortalControlStructures portalControlStructures = new PortalControlStructures(request, response);
        final HttpServletRequest pcsRequest = portalControlStructures.getHttpServletRequest();
        
        
        final ChannelRuntimeData channelRuntimeData = new ChannelRuntimeData();
        
        
        final IPortletWindowId portletWindowId = new MockPortletWindowId("win1");
        this.springPortletChannel.setPortletWidnowId(channelStaticData, portletWindowId);

        
        final IPortletDefinition portletDefinition = EasyMock.createMock(IPortletDefinition.class);
        EasyMock.expect(portletDefinition.getPortletApplicationId()).andReturn("app1");
        EasyMock.expect(portletDefinition.getPortletName()).andReturn("port1");
        
        
        final IPortletEntityId portletEntityId = new MockPortletEntityId("ent1");
        
        
        final IPortletEntity portletEntity = EasyMock.createMock(IPortletEntity.class);
        EasyMock.expect(portletEntity.getPortletEntityId()).andReturn(portletEntityId);
        
        
        final IPortletEntityRegistry portletEntityRegistry = EasyMock.createMock(IPortletEntityRegistry.class);
        EasyMock.expect(portletEntityRegistry.getParentPortletDefinition(portletEntityId)).andReturn(portletDefinition);

        
        final IPortletWindow portletWindow = EasyMock.createMock(IPortletWindow.class);
        EasyMock.expect(portletWindow.getExpirationCache()).andReturn(null);
        

        final IPortletWindowRegistry portletWindowRegistry = EasyMock.createMock(IPortletWindowRegistry.class);
        EasyMock.expect(portletWindowRegistry.getPortletWindow(pcsRequest, portletWindowId)).andReturn(portletWindow);
        EasyMock.expect(portletWindowRegistry.getParentPortletEntity(pcsRequest, portletWindowId)).andReturn(portletEntity);
        
        
        final IPortletRequestParameterManager portletRequestParameterManager = EasyMock.createMock(IPortletRequestParameterManager.class);
        EasyMock.expect(portletRequestParameterManager.getTargetedPortletWindowIds(pcsRequest)).andReturn(Collections.EMPTY_SET);
        
        
        final PortletDD portletDD = new PortletDD();
        portletDD.setExpirationCache(-1);
        
        
        final PortletRegistryService portletRegistryService = EasyMock.createMock(PortletRegistryService.class);
        EasyMock.expect(portletRegistryService.getPortletDescriptor("app1", "port1")).andReturn(portletDD);
        
        final OptionalContainerServices optionalContainerServices = EasyMock.createMock(OptionalContainerServices.class);
        EasyMock.expect(optionalContainerServices.getPortletRegistryService()).andReturn(portletRegistryService);

        
        this.springPortletChannel.setPortletWindowRegistry(portletWindowRegistry);
        this.springPortletChannel.setPortletRequestParameterManager(portletRequestParameterManager);
        this.springPortletChannel.setPortletEntityRegistry(portletEntityRegistry);
        this.springPortletChannel.setOptionalContainerServices(optionalContainerServices);
        
        EasyMock.replay(portletRegistryService, optionalContainerServices, portletDefinition, portletRequestParameterManager, portletEntity, portletEntityRegistry, portletWindow, portletWindowRegistry, person);
        
        final boolean valid = this.springPortletChannel.isCacheValid(channelStaticData, portalControlStructures, channelRuntimeData, null);
        assertTrue(valid);
        
        EasyMock.verify(portletRegistryService, optionalContainerServices, portletDefinition, portletRequestParameterManager, portletEntity, portletEntityRegistry, portletWindow, portletWindowRegistry, person);
    }


    public void testIsCacheValidCacheWithNullValidity() throws Exception {
        final ChannelStaticData channelStaticData = new ChannelStaticData();
        channelStaticData.setChannelPublishId("pub1");
        channelStaticData.setChannelSubscribeId("sub1");
        
        final IPerson person = EasyMock.createMock(IPerson.class);
        channelStaticData.setPerson(person);


        final MockHttpServletRequest request = new MockHttpServletRequest();
        final MockHttpServletResponse response = new MockHttpServletResponse();
        
        final PortalControlStructures portalControlStructures = new PortalControlStructures(request, response);
        final HttpServletRequest pcsRequest = portalControlStructures.getHttpServletRequest();
        
        final ChannelRuntimeData channelRuntimeData = new ChannelRuntimeData();
        
        
        final IPortletWindowId portletWindowId = new MockPortletWindowId("win1");
        this.springPortletChannel.setPortletWidnowId(channelStaticData, portletWindowId);

        
        final IPortletDefinition portletDefinition = EasyMock.createMock(IPortletDefinition.class);
        EasyMock.expect(portletDefinition.getPortletApplicationId()).andReturn("app1");
        EasyMock.expect(portletDefinition.getPortletName()).andReturn("port1");
        
        
        final IPortletEntityId portletEntityId = new MockPortletEntityId("ent1");
        
        
        final IPortletEntity portletEntity = EasyMock.createMock(IPortletEntity.class);
        EasyMock.expect(portletEntity.getPortletEntityId()).andReturn(portletEntityId);
        
        
        final IPortletEntityRegistry portletEntityRegistry = EasyMock.createMock(IPortletEntityRegistry.class);
        EasyMock.expect(portletEntityRegistry.getParentPortletDefinition(portletEntityId)).andReturn(portletDefinition);

        
        final IPortletWindow portletWindow = EasyMock.createMock(IPortletWindow.class);
        EasyMock.expect(portletWindow.getExpirationCache()).andReturn(null);
        

        final IPortletWindowRegistry portletWindowRegistry = EasyMock.createMock(IPortletWindowRegistry.class);
        EasyMock.expect(portletWindowRegistry.getPortletWindow(pcsRequest, portletWindowId)).andReturn(portletWindow);
        EasyMock.expect(portletWindowRegistry.getParentPortletEntity(pcsRequest, portletWindowId)).andReturn(portletEntity);
        
        
        final IPortletRequestParameterManager portletRequestParameterManager = EasyMock.createMock(IPortletRequestParameterManager.class);
        EasyMock.expect(portletRequestParameterManager.getTargetedPortletWindowIds(pcsRequest)).andReturn(Collections.EMPTY_SET);
        
        
        final PortletDD portletDD = new PortletDD();
        portletDD.setExpirationCache(10);
        
        
        final PortletRegistryService portletRegistryService = EasyMock.createMock(PortletRegistryService.class);
        EasyMock.expect(portletRegistryService.getPortletDescriptor("app1", "port1")).andReturn(portletDD);
        
        final OptionalContainerServices optionalContainerServices = EasyMock.createMock(OptionalContainerServices.class);
        EasyMock.expect(optionalContainerServices.getPortletRegistryService()).andReturn(portletRegistryService);

        
        this.springPortletChannel.setPortletWindowRegistry(portletWindowRegistry);
        this.springPortletChannel.setPortletRequestParameterManager(portletRequestParameterManager);
        this.springPortletChannel.setPortletEntityRegistry(portletEntityRegistry);
        this.springPortletChannel.setOptionalContainerServices(optionalContainerServices);
        
        EasyMock.replay(portletRegistryService, optionalContainerServices, portletDefinition, portletRequestParameterManager, portletEntity, portletEntityRegistry, portletWindow, portletWindowRegistry, person);
        
        final boolean valid = this.springPortletChannel.isCacheValid(channelStaticData, portalControlStructures, channelRuntimeData, null);
        assertFalse(valid);
        
        EasyMock.verify(portletRegistryService, optionalContainerServices, portletDefinition, portletRequestParameterManager, portletEntity, portletEntityRegistry, portletWindow, portletWindowRegistry, person);
    }


    public void testIsCacheValidCacheStillGood() throws Exception {
        final ChannelStaticData channelStaticData = new ChannelStaticData();
        channelStaticData.setChannelPublishId("pub1");
        channelStaticData.setChannelSubscribeId("sub1");
        
        final IPerson person = EasyMock.createMock(IPerson.class);
        channelStaticData.setPerson(person);


        final MockHttpServletRequest request = new MockHttpServletRequest();
        final MockHttpServletResponse response = new MockHttpServletResponse();
        
        final PortalControlStructures portalControlStructures = new PortalControlStructures(request, response);
        final HttpServletRequest pcsRequest = portalControlStructures.getHttpServletRequest();
        
        
        final ChannelRuntimeData channelRuntimeData = new ChannelRuntimeData();
        
        
        final IPortletWindowId portletWindowId = new MockPortletWindowId("win1");
        this.springPortletChannel.setPortletWidnowId(channelStaticData, portletWindowId);

        
        final IPortletDefinition portletDefinition = EasyMock.createMock(IPortletDefinition.class);
        EasyMock.expect(portletDefinition.getPortletApplicationId()).andReturn("app1");
        EasyMock.expect(portletDefinition.getPortletName()).andReturn("port1");
        
        
        final IPortletEntityId portletEntityId = new MockPortletEntityId("ent1");
        
        
        final IPortletEntity portletEntity = EasyMock.createMock(IPortletEntity.class);
        EasyMock.expect(portletEntity.getPortletEntityId()).andReturn(portletEntityId);
        
        
        final IPortletEntityRegistry portletEntityRegistry = EasyMock.createMock(IPortletEntityRegistry.class);
        EasyMock.expect(portletEntityRegistry.getParentPortletDefinition(portletEntityId)).andReturn(portletDefinition);

        
        final IPortletWindow portletWindow = EasyMock.createMock(IPortletWindow.class);
        EasyMock.expect(portletWindow.getExpirationCache()).andReturn(null);
        

        final IPortletWindowRegistry portletWindowRegistry = EasyMock.createMock(IPortletWindowRegistry.class);
        EasyMock.expect(portletWindowRegistry.getPortletWindow(pcsRequest, portletWindowId)).andReturn(portletWindow);
        EasyMock.expect(portletWindowRegistry.getParentPortletEntity(pcsRequest, portletWindowId)).andReturn(portletEntity);
        
        
        final IPortletRequestParameterManager portletRequestParameterManager = EasyMock.createMock(IPortletRequestParameterManager.class);
        EasyMock.expect(portletRequestParameterManager.getTargetedPortletWindowIds(pcsRequest)).andReturn(Collections.EMPTY_SET);
        
        
        final PortletDD portletDD = new PortletDD();
        portletDD.setExpirationCache(10);
        
        
        final PortletRegistryService portletRegistryService = EasyMock.createMock(PortletRegistryService.class);
        EasyMock.expect(portletRegistryService.getPortletDescriptor("app1", "port1")).andReturn(portletDD);
        
        final OptionalContainerServices optionalContainerServices = EasyMock.createMock(OptionalContainerServices.class);
        EasyMock.expect(optionalContainerServices.getPortletRegistryService()).andReturn(portletRegistryService);

        
        this.springPortletChannel.setPortletWindowRegistry(portletWindowRegistry);
        this.springPortletChannel.setPortletRequestParameterManager(portletRequestParameterManager);
        this.springPortletChannel.setPortletEntityRegistry(portletEntityRegistry);
        this.springPortletChannel.setOptionalContainerServices(optionalContainerServices);
        
        EasyMock.replay(portletRegistryService, optionalContainerServices, portletDefinition, portletRequestParameterManager, portletEntity, portletEntityRegistry, portletWindow, portletWindowRegistry, person);
        
        //expirationCache is in secods, need to have a validity object that is less than 10 seconds ago
        final Long validity = System.currentTimeMillis() - 5000;
        final boolean valid = this.springPortletChannel.isCacheValid(channelStaticData, portalControlStructures, channelRuntimeData, validity);
        assertTrue(valid);
        
        EasyMock.verify(portletRegistryService, optionalContainerServices, portletDefinition, portletRequestParameterManager, portletEntity, portletEntityRegistry, portletWindow, portletWindowRegistry, person);
    }


    public void testIsCacheValidCacheExpired() throws Exception {
        final ChannelStaticData channelStaticData = new ChannelStaticData();
        channelStaticData.setChannelPublishId("pub1");
        channelStaticData.setChannelSubscribeId("sub1");
        
        final IPerson person = EasyMock.createMock(IPerson.class);
        channelStaticData.setPerson(person);


        final MockHttpServletRequest request = new MockHttpServletRequest();
        final MockHttpServletResponse response = new MockHttpServletResponse();
        
        final PortalControlStructures portalControlStructures = new PortalControlStructures(request, response);
        final HttpServletRequest pcsRequest = portalControlStructures.getHttpServletRequest();
        
        
        final ChannelRuntimeData channelRuntimeData = new ChannelRuntimeData();
        
        
        final IPortletWindowId portletWindowId = new MockPortletWindowId("win1");
        this.springPortletChannel.setPortletWidnowId(channelStaticData, portletWindowId);

        
        final IPortletDefinition portletDefinition = EasyMock.createMock(IPortletDefinition.class);
        EasyMock.expect(portletDefinition.getPortletApplicationId()).andReturn("app1");
        EasyMock.expect(portletDefinition.getPortletName()).andReturn("port1");
        
        
        final IPortletEntityId portletEntityId = new MockPortletEntityId("ent1");
        
        
        final IPortletEntity portletEntity = EasyMock.createMock(IPortletEntity.class);
        EasyMock.expect(portletEntity.getPortletEntityId()).andReturn(portletEntityId);
        
        
        final IPortletEntityRegistry portletEntityRegistry = EasyMock.createMock(IPortletEntityRegistry.class);
        EasyMock.expect(portletEntityRegistry.getParentPortletDefinition(portletEntityId)).andReturn(portletDefinition);

        
        final IPortletWindow portletWindow = EasyMock.createMock(IPortletWindow.class);
        EasyMock.expect(portletWindow.getExpirationCache()).andReturn(null);
        

        final IPortletWindowRegistry portletWindowRegistry = EasyMock.createMock(IPortletWindowRegistry.class);
        EasyMock.expect(portletWindowRegistry.getPortletWindow(pcsRequest, portletWindowId)).andReturn(portletWindow);
        EasyMock.expect(portletWindowRegistry.getParentPortletEntity(pcsRequest, portletWindowId)).andReturn(portletEntity);
        
        
        final IPortletRequestParameterManager portletRequestParameterManager = EasyMock.createMock(IPortletRequestParameterManager.class);
        EasyMock.expect(portletRequestParameterManager.getTargetedPortletWindowIds(pcsRequest)).andReturn(Collections.EMPTY_SET);
        
        
        final PortletDD portletDD = new PortletDD();
        portletDD.setExpirationCache(10);
        
        
        final PortletRegistryService portletRegistryService = EasyMock.createMock(PortletRegistryService.class);
        EasyMock.expect(portletRegistryService.getPortletDescriptor("app1", "port1")).andReturn(portletDD);
        
        final OptionalContainerServices optionalContainerServices = EasyMock.createMock(OptionalContainerServices.class);
        EasyMock.expect(optionalContainerServices.getPortletRegistryService()).andReturn(portletRegistryService);

        
        this.springPortletChannel.setPortletWindowRegistry(portletWindowRegistry);
        this.springPortletChannel.setPortletRequestParameterManager(portletRequestParameterManager);
        this.springPortletChannel.setPortletEntityRegistry(portletEntityRegistry);
        this.springPortletChannel.setOptionalContainerServices(optionalContainerServices);
        
        EasyMock.replay(portletRegistryService, optionalContainerServices, portletDefinition, portletRequestParameterManager, portletEntity, portletEntityRegistry, portletWindow, portletWindowRegistry, person);
        
        //expirationCache is in seconds, need to have a validity object that is more than 10 seconds ago
        final Long validity = System.currentTimeMillis() - 10001;
        final boolean valid = this.springPortletChannel.isCacheValid(channelStaticData, portalControlStructures, channelRuntimeData, validity);
        assertFalse(valid);
        
        EasyMock.verify(portletRegistryService, optionalContainerServices, portletDefinition, portletRequestParameterManager, portletEntity, portletEntityRegistry, portletWindow, portletWindowRegistry, person);
    }


    public void testIsCacheValidWindowOverride() throws Exception {
        final ChannelStaticData channelStaticData = new ChannelStaticData();
        channelStaticData.setChannelPublishId("pub1");
        channelStaticData.setChannelSubscribeId("sub1");
        
        final IPerson person = EasyMock.createMock(IPerson.class);
        channelStaticData.setPerson(person);


        final MockHttpServletRequest request = new MockHttpServletRequest();
        final MockHttpServletResponse response = new MockHttpServletResponse();
        
        final PortalControlStructures portalControlStructures = new PortalControlStructures(request, response);
        final HttpServletRequest pcsRequest = portalControlStructures.getHttpServletRequest();
        
        
        final ChannelRuntimeData channelRuntimeData = new ChannelRuntimeData();
        
        
        final IPortletWindowId portletWindowId = new MockPortletWindowId("win1");
        this.springPortletChannel.setPortletWidnowId(channelStaticData, portletWindowId);

        
        final IPortletDefinition portletDefinition = EasyMock.createMock(IPortletDefinition.class);
        EasyMock.expect(portletDefinition.getPortletApplicationId()).andReturn("app1");
        EasyMock.expect(portletDefinition.getPortletName()).andReturn("port1");
        
        
        final IPortletEntityId portletEntityId = new MockPortletEntityId("ent1");
        
        
        final IPortletEntity portletEntity = EasyMock.createMock(IPortletEntity.class);
        EasyMock.expect(portletEntity.getPortletEntityId()).andReturn(portletEntityId);
        
        
        final IPortletEntityRegistry portletEntityRegistry = EasyMock.createMock(IPortletEntityRegistry.class);
        EasyMock.expect(portletEntityRegistry.getParentPortletDefinition(portletEntityId)).andReturn(portletDefinition);

        
        final IPortletWindow portletWindow = EasyMock.createMock(IPortletWindow.class);
        EasyMock.expect(portletWindow.getExpirationCache()).andReturn(30);
        

        final IPortletWindowRegistry portletWindowRegistry = EasyMock.createMock(IPortletWindowRegistry.class);
        EasyMock.expect(portletWindowRegistry.getPortletWindow(pcsRequest, portletWindowId)).andReturn(portletWindow);
        EasyMock.expect(portletWindowRegistry.getParentPortletEntity(pcsRequest, portletWindowId)).andReturn(portletEntity);
        
        
        final IPortletRequestParameterManager portletRequestParameterManager = EasyMock.createMock(IPortletRequestParameterManager.class);
        EasyMock.expect(portletRequestParameterManager.getTargetedPortletWindowIds(pcsRequest)).andReturn(Collections.EMPTY_SET);
        
        
        final PortletDD portletDD = new PortletDD();
        portletDD.setExpirationCache(10);
        
        
        final PortletRegistryService portletRegistryService = EasyMock.createMock(PortletRegistryService.class);
        EasyMock.expect(portletRegistryService.getPortletDescriptor("app1", "port1")).andReturn(portletDD);
        
        final OptionalContainerServices optionalContainerServices = EasyMock.createMock(OptionalContainerServices.class);
        EasyMock.expect(optionalContainerServices.getPortletRegistryService()).andReturn(portletRegistryService);

        
        this.springPortletChannel.setPortletWindowRegistry(portletWindowRegistry);
        this.springPortletChannel.setPortletRequestParameterManager(portletRequestParameterManager);
        this.springPortletChannel.setPortletEntityRegistry(portletEntityRegistry);
        this.springPortletChannel.setOptionalContainerServices(optionalContainerServices);
        
        EasyMock.replay(portletRegistryService, optionalContainerServices, portletDefinition, portletRequestParameterManager, portletEntity, portletEntityRegistry, portletWindow, portletWindowRegistry, person);
        
        //expirationCache is in secods, need to have a validity object that is more than 10 seconds ago
        final Long validity = System.currentTimeMillis() - 10001;
        final boolean valid = this.springPortletChannel.isCacheValid(channelStaticData, portalControlStructures, channelRuntimeData, validity);
        assertTrue(valid);
        
        EasyMock.verify(portletRegistryService, optionalContainerServices, portletDefinition, portletRequestParameterManager, portletEntity, portletEntityRegistry, portletWindow, portletWindowRegistry, person);
    }
    
    public void testRender() throws Exception {
        final IPerson person = EasyMock.createMock(IPerson.class);

        
        final ChannelStaticData channelStaticData = new ChannelStaticData();
        channelStaticData.setChannelPublishId("pub1");
        channelStaticData.setChannelSubscribeId("sub1");
        channelStaticData.setPerson(person);

        
        final MockHttpServletRequest request = new MockHttpServletRequest();
        final MockHttpServletResponse response = new MockHttpServletResponse();
        
        final PortalControlStructures portalControlStructures = new PortalControlStructures(request, response);
        final HttpServletRequest pcsRequest = portalControlStructures.getHttpServletRequest();
        
        
        final ChannelRuntimeData channelRuntimeData = new ChannelRuntimeData();
        
        
        final IPortletWindowId portletWindowId = new MockPortletWindowId("win1");
        this.springPortletChannel.setPortletWidnowId(channelStaticData, portletWindowId);

        
        final IPortletWindow portletWindow = EasyMock.createMock(IPortletWindow.class);
        EasyMock.expect(portletWindow.getRequestParameers()).andReturn(null);
        

        final IPortletWindowRegistry portletWindowRegistry = EasyMock.createMock(IPortletWindowRegistry.class);
        EasyMock.expect(portletWindowRegistry.getPortletWindow(pcsRequest, portletWindowId)).andReturn(portletWindow);
        
        final PrintWriter printWriter = new PrintWriter(new NullOutputStream());
        
        final PortletContainer portletContainer = EasyMock.createMock(PortletContainer.class);
        portletContainer.doRender(portletWindow, new PortletParameterRequestWrapper(pcsRequest, Collections.EMPTY_MAP), new ContentRedirectingHttpServletResponse(response, printWriter));
        EasyMock.expectLastCall().andAnswer(new IAnswer<Object>() {
            public Object answer() throws Throwable {
                final Object[] currentArguments = EasyMock.getCurrentArguments();

                final HttpServletResponse currentResponse = ((HttpServletResponse)currentArguments[2]);
                currentResponse.getWriter();
                
                return null;
            }
        });
        
        
        final PortletRequestInfo portletRequestInfo = new PortletRequestInfo(RequestType.RENDER);
        
        final IPortletRequestParameterManager portletRequestParameterManager = EasyMock.createMock(IPortletRequestParameterManager.class);
        EasyMock.expect(portletRequestParameterManager.getPortletRequestInfo(pcsRequest, portletWindowId)).andReturn(portletRequestInfo);
        
        
        this.springPortletChannel.setPortletRequestParameterManager(portletRequestParameterManager);
        this.springPortletChannel.setPortletWindowRegistry(portletWindowRegistry);
        this.springPortletChannel.setPortletContainer(portletContainer);
        
        EasyMock.replay(portletRequestParameterManager, portletContainer, portletWindow, portletWindowRegistry, person);
        
        this.springPortletChannel.render(channelStaticData, portalControlStructures, channelRuntimeData, printWriter);
        
        EasyMock.verify(portletRequestParameterManager, portletContainer, portletWindow, portletWindowRegistry, person);
    }
    
    public void testGetTitle() throws Exception {
        final ChannelStaticData channelStaticData = new ChannelStaticData();
        
        final MockHttpServletRequest httpServletRequest = new MockHttpServletRequest();
        httpServletRequest.setAttribute(IPortletAdaptor.ATTRIBUTE__PORTLET_TITLE, "theTitle");

        final PortalControlStructures portalControlStructures = new PortalControlStructures(httpServletRequest, null);
        
        final ChannelRuntimeData channelRuntimeData = new ChannelRuntimeData();
        
        
        final String title = this.springPortletChannel.getTitle(channelStaticData, portalControlStructures, channelRuntimeData);
        
        assertEquals("theTitle", title);
    }
}
