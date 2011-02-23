/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.portal.user;

import javax.servlet.http.HttpSession;

import org.jasig.portal.IUserPreferencesManager;
import org.jasig.portal.i18n.LocaleManager;
import org.jasig.portal.security.IPerson;

/**
 * Provides access to the layout and rendering related services for a portal user.
 * 
 * @author Eric Dalquist
 * @version $Revision$
 */
public interface IUserInstance {
    /**
     * @return The Person this UserInstance is for
     */
    public IPerson getPerson();

    /**
     * @return The user preferences manager for the user instance
     */
    public IUserPreferencesManager getPreferencesManager();

    /**
     * @return the localeManager for the user instance
     */
    public LocaleManager getLocaleManager();

    /**
     * @return the renderingLock for the user instance
     */
    public Object getRenderingLock();
    
    /**
     * Notify the instance and all its members that the user's session is being destroyed.
     * 
     * @param session The session that was just destroyed for this user instance.
     */
    public void destroySession(HttpSession session);
}