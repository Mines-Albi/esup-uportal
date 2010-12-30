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

package org.jasig.portal.portlet.dao.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Index;
import org.hibernate.annotations.Parameter;
import org.jasig.portal.portlet.om.IPortletType;

/**
 * JPA implementation of the IPortletType interface.
 * 
 * @author Ken Weiner, kweiner@unicon.net
 * @author Jen Bourey, jennifer.bourey@gmail.com
 * @version $Revision$
 */
@Entity
@Table(name = "UP_PORTLET_TYPE")
@GenericGenerator(name = "UP_PORTLET_TYPE_DEF_GEN", strategy = "native", parameters = {
		@Parameter(name = "sequence", value = "UP_PORTLET_TYPE_DEF_SEQ"),
		@Parameter(name = "table", value = "UP_JPA_UNIQUE_KEY"),
		@Parameter(name = "column", value = "NEXT_UP_PORTLET_TYPE_DEF_HI") })
public class PortletTypeImpl implements Serializable, IPortletType {
    private static final long serialVersionUID = 1L;

    @Id
	@GeneratedValue(generator = "UP_PORTLET_TYPE_DEF_GEN")
	@Column(name = "TYPE_ID")
	private final int internalId;

    @Column(name = "TYPE_NAME", length = 70, unique = true, nullable = false)
    @Index(name = "IDX_PORTLET_TYPE__NAME")
    private final String name;

	@Column(name = "TYPE_DESCR", length = 2000)
	private String descr;

	@Column(name = "TYPE_DEF_URI", length = 255, nullable = false)
	private String cpdUri;
	
	/**
	 * Default constructor used by hibernate
	 */
	@SuppressWarnings("unused")
    private PortletTypeImpl() {
	    this.internalId = -1;
        this.name = null;
	}
	

    public PortletTypeImpl(String name, String cpdUri) {
        this.internalId = -1;
        this.name = name;
        this.cpdUri = cpdUri;
    }




    // Getter methods
	
	/*
	 * (non-Javadoc)
	 * @see org.jasig.portal.IPortletType#getId()
	 */
	public int getId() {
		return this.internalId;
	}

	/*
	 * (non-Javadoc)
	 * @see org.jasig.portal.IPortletType#getName()
	 */
	public String getName() {
		return name;
	}

	/*
	 * (non-Javadoc)
	 * @see org.jasig.portal.IPortletType#getDescription()
	 */
	public String getDescription() {
		return descr;
	}

	/*
	 * (non-Javadoc)
	 * @see org.jasig.portal.IPortletType#getCpdUri()
	 */
	public String getCpdUri() {
		return cpdUri;
	}

	// Setter methods

	/*
	 * (non-Javadoc)
	 * @see org.jasig.portal.IPortletType#setDescription(java.lang.String)
	 */
	public void setDescription(String descr) {
		this.descr = descr;
	}

    /* (non-Javadoc)
     * @see org.jasig.portal.channel.IPortletType#setCpdUri(java.lang.String)
     */
    public void setCpdUri(String cpdUri) {
        this.cpdUri = cpdUri;
    }



    /**
     * @see java.lang.Object#equals(Object)
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof IPortletType)) {
            return false;
        }
        IPortletType rhs = (IPortletType) object;
        return new EqualsBuilder()
            .append(this.name, rhs.getName())
            .append(this.cpdUri, rhs.getCpdUri())
            .isEquals();
    }


    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        return new HashCodeBuilder(-1497407419, 1799845985)
            .append(this.cpdUri)
            .append(this.name)
            .toHashCode();
    }


    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
            .append("internalId", this.internalId)
            .append("name", this.name)
            .append("cpdUri", this.cpdUri)
            .append("descr", this.descr)
            .toString();
    }
	
	
}