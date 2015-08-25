//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.20 at 01:37:20 PM CEST 
//


package com.microsoft.exchange.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy;
import org.jvnet.jaxb2_commons.lang.HashCode;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for FolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FolderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseFolderType">
 *       &lt;sequence>
 *         &lt;element name="PermissionSet" type="{http://schemas.microsoft.com/exchange/services/2006/types}PermissionSetType" minOccurs="0"/>
 *         &lt;element name="UnreadCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderType", propOrder = {
    "permissionSet",
    "unreadCount"
})
@XmlSeeAlso({
    TasksFolderType.class,
    SearchFolderType.class
})
public class FolderType
    extends BaseFolderType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "PermissionSet")
    protected PermissionSetType permissionSet;
    @XmlElement(name = "UnreadCount")
    protected Integer unreadCount;

    /**
     * Gets the value of the permissionSet property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionSetType }
     *     
     */
    public PermissionSetType getPermissionSet() {
        return permissionSet;
    }

    /**
     * Sets the value of the permissionSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionSetType }
     *     
     */
    public void setPermissionSet(PermissionSetType value) {
        this.permissionSet = value;
    }

    /**
     * Gets the value of the unreadCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getUnreadCount() {
        return unreadCount;
    }

    /**
     * Sets the value of the unreadCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setUnreadCount(Integer value) {
        this.unreadCount = value;
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            PermissionSetType thePermissionSet;
            thePermissionSet = this.getPermissionSet();
            strategy.appendField(locator, this, "permissionSet", buffer, thePermissionSet);
        }
        {
            Integer theUnreadCount;
            theUnreadCount = this.getUnreadCount();
            strategy.appendField(locator, this, "unreadCount", buffer, theUnreadCount);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FolderType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final FolderType that = ((FolderType) object);
        {
            PermissionSetType lhsPermissionSet;
            lhsPermissionSet = this.getPermissionSet();
            PermissionSetType rhsPermissionSet;
            rhsPermissionSet = that.getPermissionSet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "permissionSet", lhsPermissionSet), LocatorUtils.property(thatLocator, "permissionSet", rhsPermissionSet), lhsPermissionSet, rhsPermissionSet)) {
                return false;
            }
        }
        {
            Integer lhsUnreadCount;
            lhsUnreadCount = this.getUnreadCount();
            Integer rhsUnreadCount;
            rhsUnreadCount = that.getUnreadCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unreadCount", lhsUnreadCount), LocatorUtils.property(thatLocator, "unreadCount", rhsUnreadCount), lhsUnreadCount, rhsUnreadCount)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy strategy) {
        int currentHashCode = super.hashCode(locator, strategy);
        {
            PermissionSetType thePermissionSet;
            thePermissionSet = this.getPermissionSet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "permissionSet", thePermissionSet), currentHashCode, thePermissionSet);
        }
        {
            Integer theUnreadCount;
            theUnreadCount = this.getUnreadCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unreadCount", theUnreadCount), currentHashCode, theUnreadCount);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
