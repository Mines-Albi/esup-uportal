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
 * <p>Java class for EffectiveRightsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EffectiveRightsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateAssociated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CreateContents" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CreateHierarchy" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Delete" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Modify" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="Read" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EffectiveRightsType", propOrder = {
    "createAssociated",
    "createContents",
    "createHierarchy",
    "delete",
    "modify",
    "read"
})
public class EffectiveRightsType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "CreateAssociated")
    protected boolean createAssociated;
    @XmlElement(name = "CreateContents")
    protected boolean createContents;
    @XmlElement(name = "CreateHierarchy")
    protected boolean createHierarchy;
    @XmlElement(name = "Delete")
    protected boolean delete;
    @XmlElement(name = "Modify")
    protected boolean modify;
    @XmlElement(name = "Read")
    protected boolean read;

    /**
     * Gets the value of the createAssociated property.
     * 
     */
    public boolean isCreateAssociated() {
        return createAssociated;
    }

    /**
     * Sets the value of the createAssociated property.
     * 
     */
    public void setCreateAssociated(boolean value) {
        this.createAssociated = value;
    }

    /**
     * Gets the value of the createContents property.
     * 
     */
    public boolean isCreateContents() {
        return createContents;
    }

    /**
     * Sets the value of the createContents property.
     * 
     */
    public void setCreateContents(boolean value) {
        this.createContents = value;
    }

    /**
     * Gets the value of the createHierarchy property.
     * 
     */
    public boolean isCreateHierarchy() {
        return createHierarchy;
    }

    /**
     * Sets the value of the createHierarchy property.
     * 
     */
    public void setCreateHierarchy(boolean value) {
        this.createHierarchy = value;
    }

    /**
     * Gets the value of the delete property.
     * 
     */
    public boolean isDelete() {
        return delete;
    }

    /**
     * Sets the value of the delete property.
     * 
     */
    public void setDelete(boolean value) {
        this.delete = value;
    }

    /**
     * Gets the value of the modify property.
     * 
     */
    public boolean isModify() {
        return modify;
    }

    /**
     * Sets the value of the modify property.
     * 
     */
    public void setModify(boolean value) {
        this.modify = value;
    }

    /**
     * Gets the value of the read property.
     * 
     */
    public boolean isRead() {
        return read;
    }

    /**
     * Sets the value of the read property.
     * 
     */
    public void setRead(boolean value) {
        this.read = value;
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
            boolean theCreateAssociated;
            theCreateAssociated = this.isCreateAssociated();
            strategy.appendField(locator, this, "createAssociated", buffer, theCreateAssociated);
        }
        {
            boolean theCreateContents;
            theCreateContents = this.isCreateContents();
            strategy.appendField(locator, this, "createContents", buffer, theCreateContents);
        }
        {
            boolean theCreateHierarchy;
            theCreateHierarchy = this.isCreateHierarchy();
            strategy.appendField(locator, this, "createHierarchy", buffer, theCreateHierarchy);
        }
        {
            boolean theDelete;
            theDelete = this.isDelete();
            strategy.appendField(locator, this, "delete", buffer, theDelete);
        }
        {
            boolean theModify;
            theModify = this.isModify();
            strategy.appendField(locator, this, "modify", buffer, theModify);
        }
        {
            boolean theRead;
            theRead = this.isRead();
            strategy.appendField(locator, this, "read", buffer, theRead);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof EffectiveRightsType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final EffectiveRightsType that = ((EffectiveRightsType) object);
        {
            boolean lhsCreateAssociated;
            lhsCreateAssociated = this.isCreateAssociated();
            boolean rhsCreateAssociated;
            rhsCreateAssociated = that.isCreateAssociated();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createAssociated", lhsCreateAssociated), LocatorUtils.property(thatLocator, "createAssociated", rhsCreateAssociated), lhsCreateAssociated, rhsCreateAssociated)) {
                return false;
            }
        }
        {
            boolean lhsCreateContents;
            lhsCreateContents = this.isCreateContents();
            boolean rhsCreateContents;
            rhsCreateContents = that.isCreateContents();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createContents", lhsCreateContents), LocatorUtils.property(thatLocator, "createContents", rhsCreateContents), lhsCreateContents, rhsCreateContents)) {
                return false;
            }
        }
        {
            boolean lhsCreateHierarchy;
            lhsCreateHierarchy = this.isCreateHierarchy();
            boolean rhsCreateHierarchy;
            rhsCreateHierarchy = that.isCreateHierarchy();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "createHierarchy", lhsCreateHierarchy), LocatorUtils.property(thatLocator, "createHierarchy", rhsCreateHierarchy), lhsCreateHierarchy, rhsCreateHierarchy)) {
                return false;
            }
        }
        {
            boolean lhsDelete;
            lhsDelete = this.isDelete();
            boolean rhsDelete;
            rhsDelete = that.isDelete();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "delete", lhsDelete), LocatorUtils.property(thatLocator, "delete", rhsDelete), lhsDelete, rhsDelete)) {
                return false;
            }
        }
        {
            boolean lhsModify;
            lhsModify = this.isModify();
            boolean rhsModify;
            rhsModify = that.isModify();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "modify", lhsModify), LocatorUtils.property(thatLocator, "modify", rhsModify), lhsModify, rhsModify)) {
                return false;
            }
        }
        {
            boolean lhsRead;
            lhsRead = this.isRead();
            boolean rhsRead;
            rhsRead = that.isRead();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "read", lhsRead), LocatorUtils.property(thatLocator, "read", rhsRead), lhsRead, rhsRead)) {
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
            boolean theCreateAssociated;
            theCreateAssociated = this.isCreateAssociated();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createAssociated", theCreateAssociated), currentHashCode, theCreateAssociated);
        }
        {
            boolean theCreateContents;
            theCreateContents = this.isCreateContents();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createContents", theCreateContents), currentHashCode, theCreateContents);
        }
        {
            boolean theCreateHierarchy;
            theCreateHierarchy = this.isCreateHierarchy();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "createHierarchy", theCreateHierarchy), currentHashCode, theCreateHierarchy);
        }
        {
            boolean theDelete;
            theDelete = this.isDelete();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "delete", theDelete), currentHashCode, theDelete);
        }
        {
            boolean theModify;
            theModify = this.isModify();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "modify", theModify), currentHashCode, theModify);
        }
        {
            boolean theRead;
            theRead = this.isRead();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "read", theRead), currentHashCode, theRead);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
