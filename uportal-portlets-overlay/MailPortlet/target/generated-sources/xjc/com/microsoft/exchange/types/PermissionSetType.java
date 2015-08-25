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
 * The set of permissions on a folder
 * 
 * <p>Java class for PermissionSetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermissionSetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Permissions" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfPermissionsType"/>
 *         &lt;element name="UnknownEntries" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfUnknownEntriesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionSetType", propOrder = {
    "permissions",
    "unknownEntries"
})
public class PermissionSetType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Permissions", required = true)
    protected ArrayOfPermissionsType permissions;
    @XmlElement(name = "UnknownEntries")
    protected ArrayOfUnknownEntriesType unknownEntries;

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPermissionsType }
     *     
     */
    public ArrayOfPermissionsType getPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPermissionsType }
     *     
     */
    public void setPermissions(ArrayOfPermissionsType value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the unknownEntries property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfUnknownEntriesType }
     *     
     */
    public ArrayOfUnknownEntriesType getUnknownEntries() {
        return unknownEntries;
    }

    /**
     * Sets the value of the unknownEntries property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfUnknownEntriesType }
     *     
     */
    public void setUnknownEntries(ArrayOfUnknownEntriesType value) {
        this.unknownEntries = value;
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
        {
            ArrayOfPermissionsType thePermissions;
            thePermissions = this.getPermissions();
            strategy.appendField(locator, this, "permissions", buffer, thePermissions);
        }
        {
            ArrayOfUnknownEntriesType theUnknownEntries;
            theUnknownEntries = this.getUnknownEntries();
            strategy.appendField(locator, this, "unknownEntries", buffer, theUnknownEntries);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PermissionSetType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final PermissionSetType that = ((PermissionSetType) object);
        {
            ArrayOfPermissionsType lhsPermissions;
            lhsPermissions = this.getPermissions();
            ArrayOfPermissionsType rhsPermissions;
            rhsPermissions = that.getPermissions();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "permissions", lhsPermissions), LocatorUtils.property(thatLocator, "permissions", rhsPermissions), lhsPermissions, rhsPermissions)) {
                return false;
            }
        }
        {
            ArrayOfUnknownEntriesType lhsUnknownEntries;
            lhsUnknownEntries = this.getUnknownEntries();
            ArrayOfUnknownEntriesType rhsUnknownEntries;
            rhsUnknownEntries = that.getUnknownEntries();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unknownEntries", lhsUnknownEntries), LocatorUtils.property(thatLocator, "unknownEntries", rhsUnknownEntries), lhsUnknownEntries, rhsUnknownEntries)) {
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
        int currentHashCode = 1;
        {
            ArrayOfPermissionsType thePermissions;
            thePermissions = this.getPermissions();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "permissions", thePermissions), currentHashCode, thePermissions);
        }
        {
            ArrayOfUnknownEntriesType theUnknownEntries;
            theUnknownEntries = this.getUnknownEntries();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unknownEntries", theUnknownEntries), currentHashCode, theUnknownEntries);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
