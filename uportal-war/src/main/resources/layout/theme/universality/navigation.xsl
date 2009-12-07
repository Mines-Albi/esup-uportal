<?xml version="1.0" encoding="utf-8"?>
<!--

    Copyright (c) 2000-2009, Jasig, Inc.
    See license distributed with this file and available online at
    https://www.ja-sig.org/svn/jasig-parent/tags/rel-10/license-header.txt

-->
<!--
 | This file determines the presentation of the main navigation systems of the portal.
 | The file is imported by the base stylesheet universality.xsl.
 | Parameters and templates from other XSL files may be referenced; refer to universality.xsl for the list of parameters and imported XSL files.
 | For more information on XSL, refer to [http://www.w3.org/Style/XSL/].
-->

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:dlm="http://www.uportal.org/layout/dlm">
    
  
  <!-- ========== TEMPLATE: NAVIGATION ========== -->
  <!-- ========================================== -->
  <!--
   | This template renders the main navigation construct.
   | This template can be rendered into the header or the sidebar, determined by the parameters set in universality.xsl.
  -->
  <xsl:template match="navigation">
  	<xsl:param name="CONTEXT"/>  <!-- Catches the context parameter to know how to render the navigation. -->
    
    <xsl:choose>
    	<xsl:when test="$CONTEXT = 'header'">  <!-- When the context is 'header' render the main navigation as tabs. -->
      	
        <div id="portalNavigation">
        	<div id="portalNavigationInner" class="{$CONTEXT}">
          	<a name="mainNavigation" title="Reference anchor: main nagivation"><xsl:comment>Comment to keep from collapsing</xsl:comment></a>  <!-- Skip navigation target. -->
            <ul id="portalNavigationList" class="fl-tabs">
              <xsl:apply-templates select="tab">
                <xsl:with-param name="CONTEXT" select="$CONTEXT"/>
              </xsl:apply-templates>
            </ul>
          	<xsl:if test="$USE_SUBNAVIGATION_ROW='true'">
              <div id="portalNavigationSubrow" class="fl-tab-content">
                <xsl:call-template name="subnavigation">
                  <xsl:with-param name="CONTEXT" select="'subnav'"/>
                  <xsl:with-param name="TAB_POSITION" select="count(tab[@activeTab='true']/preceding-sibling::tab) + 1"/>
                </xsl:call-template>
              </div>
            </xsl:if>
          </div>
        </div>
      
      </xsl:when>
      <xsl:otherwise>  <!-- Otherwise, render the main navigation as a widget (generally assumes the context is the sidebar). -->
      
      	<div id="portalNavigation" class="fl-widget">
        	<div id="portalNavigationInner" class="fl-widget-inner {$CONTEXT}">
          	<div class="fl-widget-titlebar">
            	<h2>
              	<a name="mainNavigation" title="Reference anchor: main nagivation">  <!-- Skip navigation target. -->
                	<xsl:value-of select="$TOKEN[@name='MAIN_NAVIGATION_LABEL']"/>
                </a>
              </h2>
          	</div>
            <div class="fl-widget-content">
            	<ul id="portalNavigationList" class="fl-listmenu">
              	<xsl:apply-templates select="tab">
                	<xsl:with-param name="CONTEXT" select="$CONTEXT"/>
                </xsl:apply-templates>
              </ul>
            </div>
          </div>
        </div>
      
      </xsl:otherwise>
    </xsl:choose>
              
  </xsl:template>
  <!-- ========================================== -->
  
  
  <!-- ========== TEMPLATE: NAVIGATION TABS ========== -->
  <!-- ========================================== -->
  <!--
   | This template renders the contents of the main navigation.
  -->
  <xsl:template match="tab">
  	<xsl:param name="CONTEXT"/>  <!-- Catches the context parameter. -->
  
    <xsl:variable name="NAV_POSITION"> <!-- Determine the position of the navigation option within the whole navigation list and add css hooks for the first and last positions. -->
      <xsl:choose>
        <xsl:when test="position()=1 and position()=last()">single</xsl:when>
        <xsl:when test="position()=1">first</xsl:when>
        <xsl:when test="position()=last()">last</xsl:when>
        <xsl:otherwise></xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <xsl:variable name="NAV_ACTIVE"> <!-- Determine which navigation option is the active (current selection) and add a css hook. -->
      <xsl:choose>
        <xsl:when test="@activeTab='true' and $CONTEXT='header'">active fl-activeTab</xsl:when>
        <xsl:when test="@activeTab='true' and $CONTEXT='sidebar'">active fl-activemenu</xsl:when>
        <xsl:otherwise></xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    <xsl:variable name="NAV_MOVABLE"> <!-- Determine whether the navigation tab is movable and add a css hook. -->
      <xsl:choose>
        <xsl:when test="not(@dlm:moveAllowed='false')">movable-tab</xsl:when>
        <xsl:otherwise></xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
    
    <li id="portalNavigation_{@ID}" class="portal-navigation {$NAV_POSITION} {$NAV_ACTIVE} {$NAV_MOVABLE}"> <!-- Each navigation menu item.  The unique ID can be used in the CSS to give each menu item a unique icon, color, or presentation. -->
      <a id="tabLink_{@ID}" href="{$BASE_ACTION_URL}?uP_root=root&amp;uP_sparam=activeTab&amp;activeTab={position()}" title="{@name}" class="portal-navigation-link">  <!-- Navigation item link. -->
        <span class="portal-navigation-label"><xsl:value-of select="@name"/></span>
      </a>
      <xsl:if test="@activeTab='true' and $CONTEXT='sidebar'"> <!-- If navigation is being rendered in the sidebar rather than as tabs, call template for rendering active menu item's submenu. -->
        <xsl:call-template name="subnavigation">
          <xsl:with-param name="CONTEXT" select="'subnav'"/>
          <xsl:with-param name="TAB_POSITION" select="position()"/>
        </xsl:call-template>
      </xsl:if>
    </li>
  
  </xsl:template>
  <!-- ========================================== -->
  
    
  <!-- ========== TEMPLATE: PORTLET NAVIGATION ========== -->
  <!-- ================================================== -->
  <!--
   | This template renders portlet navigation when a portlet is focused.
  -->
  <xsl:template name="portlet.navigation">
    <div id="portletNavigation" class="fl-widget">
    	<div class="fl-widget-inner">
      	<div class="fl-widget-titlebar">
      		<h2><xsl:value-of select="$TOKEN[@name='PORTLET_NAVIGATION_TITLE']"/></h2>
        </div>
        <div class="fl-widget-content">
        	<ul class="fl-listmenu">
          	<li id="portletNavigationLinkHome">
            	<a href="{$HOME_ACTION_URL}" title="{$TOKEN[@name='HOME_LONG_LABEL']}">
              	<span>
                	<xsl:value-of select="$TOKEN[@name='HOME_LABEL']"/>
                </span>
              </a>
            </li>
          </ul>
          <xsl:for-each select="//navigation/tab">
            <xsl:variable name="TAB_POSITION" select="position()"/>
            <h3><xsl:value-of select="@name"/></h3>
            <ul class="fl-listmenu">
              <xsl:for-each select="tabChannel">
                <li>
                  <a href="{$BASE_ACTION_URL}?uP_root={@ID}&amp;uP_sparam=activeTab&amp;activeTab={$TAB_POSITION}" title="{@name}">  <!-- Navigation item link. -->
                    <span><xsl:value-of select="@name"/></span>
                  </a>
                </li>
              </xsl:for-each>
            </ul>
          </xsl:for-each>
    		</div>
      </div>  
    </div>
  </xsl:template>
  <!-- ================================================== -->


  <!-- ========== TEMPLATE: SUBNAVIGATION ========== -->
  <!-- ============================================= -->
  <!--
   | This template renders subnavigation which may appear in different contexts.
   | The context parameter is used to know whether the subnavigation is a flyout menu, the expanded display of the selected sidebar navigation menu item, or as a separate navigation list of the page contents when using tabs.
   | These options are determined by the parameters set in universality.xsl.
  -->
  <xsl:template name="subnavigation">
    <xsl:param name="CONTEXT"/>  <!-- Catches the context parameter to know how to render the subnavigation. -->
    <xsl:param name="TAB_POSITION"/> <!-- Provides the position of the tab -->
    
    <div> <!-- Unique ID is needed for the flyout menus javascript. -->
      <xsl:attribute name="id">
        <xsl:choose>
          <xsl:when test="$CONTEXT='flyout'">portalFlyoutNavigation_<xsl:value-of select="@ID"/></xsl:when>
          <xsl:otherwise>portalSubnavigation_<xsl:value-of select="@ID"/></xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
      <xsl:attribute name="class"> <!-- Write in CSS classes depending on context. -->
        <xsl:choose>
        	<xsl:when test="$CONTEXT='flyout'">portal-flyout-container</xsl:when>
        	<xsl:otherwise>portal-subnav-container</xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
      <xsl:attribute name="style"> <!-- Write in CSS classes for flyout menus, for the submenu contents to not be rendered on page load. -->
        <xsl:choose>
        	<xsl:when test="$CONTEXT='flyout'">display: none;</xsl:when>
        	<xsl:otherwise></xsl:otherwise>
        </xsl:choose>
      </xsl:attribute>
      
      <div>  <!-- Inner div for additional presentation/formatting options. -->
        <xsl:attribute name="id">
          <xsl:choose>
            <xsl:when test="$CONTEXT='flyout'">portalFlyoutNavigationInner_<xsl:value-of select="@ID"/></xsl:when>
            <xsl:otherwise>portalSubnavigationInner_<xsl:value-of select="@ID"/></xsl:otherwise>
          </xsl:choose>
        </xsl:attribute>
        <ul class="portal-subnav-list"> <!-- List of the subnavigation menu items. -->
        	<xsl:choose>
          	<xsl:when test="$CONTEXT='flyout'">
            
              <xsl:for-each select="tabChannel">
                <xsl:variable name="SUBNAV_POSITION"> <!-- Determine the position of the navigation option within the whole navigation list and add css hooks for the first and last positions. -->
                  <xsl:choose>
                    <xsl:when test="position()=1 and position()=last()">single</xsl:when>
                    <xsl:when test="position()=1">first</xsl:when>
                    <xsl:when test="position()=last()">last</xsl:when>
                    <xsl:otherwise></xsl:otherwise>
                  </xsl:choose>
                </xsl:variable>
                <li id="uPfname_{@fname}" class="portal-subnav {$SUBNAV_POSITION}"> <!-- Each subnavigation menu item.  The unique ID can be used in the CSS to give each menu item a unique icon, color, or presentation. -->
                  <a href="{$BASE_ACTION_URL}?uP_sparam=activeTab&amp;activeTab={$TAB_POSITION}&amp;uP_root={@ID}" title="{@name}" class="portal-subnav-link">  <!-- Navigation item link. -->
                      <span class="portal-subnav-label"><xsl:value-of select="@name"/></span>
                  </a>
                </li>
              </xsl:for-each>
              
            </xsl:when>
            <xsl:otherwise>
            	
              <xsl:for-each select="//navigation/tab[@activeTab='true']/tabChannel">
                <xsl:variable name="SUBNAV_POSITION"> <!-- Determine the position of the navigation option within the whole navigation list and add css hooks for the first and last positions. -->
                  <xsl:choose>
                    <xsl:when test="position()=1 and position()=last()">single</xsl:when>
                    <xsl:when test="position()=1">first</xsl:when>
                    <xsl:when test="position()=last()">last</xsl:when>
                    <xsl:otherwise></xsl:otherwise>
                  </xsl:choose>
                </xsl:variable>
                <li id="uPchannel_{@ID}" class="portal-subnav {$SUBNAV_POSITION}"> <!-- Each subnavigation menu item.  The unique ID can be used in the CSS to give each menu item a unique icon, color, or presentation. -->
                  <a href="{$BASE_ACTION_URL}?uP_sparam=activeTab&amp;activeTab={$TAB_POSITION}&amp;uP_root={@ID}" title="{@name}" class="portal-subnav-link">  <!-- Navigation item link. -->
                    <span class="portal-subnav-label">UP:CHANNEL_TITLE-{<xsl:value-of select="@ID" />}</span>
                  </a>
                </li>
              </xsl:for-each>
              
            </xsl:otherwise>
          </xsl:choose>
        </ul>
    	</div> 
    </div>
    
    <!-- ????? NEED TO PROVIDE A TARGET FOR THE IFRAME TO BE VALID WITH SSL ????? -->
    <xsl:if test="$USE_FLYOUT_MENUS='true' and $CONTEXT='flyout'">  <!-- IE fix. If using flyout menus, render an iframe behind the submenu to ensure the submenu renders on top of all other elements. -->
    	<iframe id="navFrame_{@ID}" src="javascript:false;" style="display: none;" class="portal-flyout-iframe" frameborder="0"></iframe>
    </xsl:if>
    
  </xsl:template>
  
  
  <!-- ========== TEMPLATE: PREFERENCES EDIT PAGE ========== -->
  <!-- =================================================== -->
  <!--
   | This template renders the tab preferences menu for the active tab when flyout menus are used.
  -->
  <xsl:template name="preferences.editpage">
      <div id="portalFlyoutNavigation_{@ID}" class="portal-flyout-container" style="display: none;"> <!-- Unique ID is needed for the flyout menus javascript. -->
        
        <div id="portalFlyoutNavigationInner_{@ID}">  <!-- Inner div for additional presentation/formatting options. -->
          <ul class="portal-subnav-list"> <!-- List of the subnavigation menu items. -->
            <li id="editPageLink" class="portal-subnav">
              <a href="javascript:;" class="portal-subnav-link" title="{$TOKEN[@name='PREFERENCES_LINK_LAYOUT_LONG_LABEL']}">
                <span class="portal-subnav-label"><xsl:value-of select="$TOKEN[@name='PREFERENCES_LINK_LAYOUT_LABEL']"/></span>
              </a>
            </li>
            <xsl:if test="not(@dlm:moveAllowed='false')">
              <li id="movePageLeftLink" class="portal-subnav">
                <xsl:if test="position()=1">
                  <xsl:attribute name="style">display: none;</xsl:attribute>
                </xsl:if>
                <a href="javascript:;" class="portal-subnav-link" title="{$TOKEN[@name='PREFERENCES_LINK_MOVE_TAB_LEFT_LONG_LABEL']}">
                  <span class="portal-subnav-label"><xsl:value-of select="$TOKEN[@name='PREFERENCES_LINK_MOVE_TAB_LEFT_LABEL']"/></span>
                </a>
              </li>
              <li id="movePageRightLink" class="portal-subnav">
                <xsl:if test="position()=last()">
                  <xsl:attribute name="style">display: none;</xsl:attribute>
                </xsl:if>
                <a href="javascript:;" class="portal-subnav-link" title="{$TOKEN[@name='PREFERENCES_LINK_MOVE_TAB_RIGHT_LONG_LABEL']}">
                  <span class="portal-subnav-label"><xsl:value-of select="$TOKEN[@name='PREFERENCES_LINK_MOVE_TAB_RIGHT_LABEL']"/></span>
                </a>
              </li>
            </xsl:if>
            <xsl:if test="not(@dlm:deleteAllowed='false')">
              <li id="deletePageLink" class="portal-subnav">
              <a href="javascript:;" class="portal-subnav-link" title="{$TOKEN[@name='PREFERENCES_LINK_DELETE_TAB_LONG_LABEL']}">
                <span class="portal-subnav-label"><xsl:value-of select="$TOKEN[@name='PREFERENCES_LINK_DELETE_TAB_LABEL']"/></span>
              </a>
              </li>
            </xsl:if>
          </ul>
        </div> 
      </div>
      
      <iframe id="navFrame_{@ID}" src="javascript:false;" style="display: none;" class="portal-flyout-iframe" frameborder="0"></iframe>
  </xsl:template>
  <!-- ============================================= -->
	
  
  <!-- ========== TEMPLATE: FLYOUT MENU SCRIPTS ========== -->
  <!-- =================================================== -->
  <!--
   | This template renders scripts specific to the flyout menus.
  -->
  <xsl:template name="flyout.menu.scripts">
    <div id="portalFlyoutNavigation" class="portal-navigation">
      <xsl:for-each select="/layout/navigation/tab">
        <xsl:if test="@activeTab='false' and $USE_FLYOUT_MENUS='true'"> <!-- If using flyout menus, call template for rendering submenus. -->
          <xsl:call-template name="subnavigation">
            <xsl:with-param name="CONTEXT" select="'flyout'"/>
            <xsl:with-param name="TAB_POSITION" select="position()"/>
          </xsl:call-template>
        </xsl:if>
        <xsl:if test="$USE_AJAX='true' and $AUTHENTICATED='true' and @activeTab='true' and not($PORTAL_VIEW='focused')"> <!-- If navigation is being rendered in the sidebar rather than as tabs, call template for rendering active menu item's submenu. -->
          <xsl:call-template name="preferences.editpage"/>
        </xsl:if>
      </xsl:for-each>
    </div>
    <script type="text/javascript">
      up.jQuery(document).ready(function(){
        // initialize the flyout menus and add onmouseover and onmouseout events to 
        // all the navigation elements with subnavigation flyouts
        startFlyouts();
      });
    </script>
  </xsl:template>
  <!-- =================================================== -->
	
		
</xsl:stylesheet>