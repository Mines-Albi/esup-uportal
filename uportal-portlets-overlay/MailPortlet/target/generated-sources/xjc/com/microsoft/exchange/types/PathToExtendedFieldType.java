//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.18 at 02:30:12 PM CEST 
//


package com.microsoft.exchange.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 * 
 *         Represents an extended property.  Note that there are only a couple of valid attribute
 *         combinations.  Note that all occurances require the PropertyType attribute.
 * 
 *         1.  (DistinguishedPropertySetId || PropertySetId) + (PropertyName || Property Id)
 *         2.  PropertyTag
 * 
 *       
 * 
 * <p>Java class for PathToExtendedFieldType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PathToExtendedFieldType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BasePathToElementType">
 *       &lt;attribute name="DistinguishedPropertySetId" type="{http://schemas.microsoft.com/exchange/services/2006/types}DistinguishedPropertySetType" />
 *       &lt;attribute name="PropertySetId" type="{http://schemas.microsoft.com/exchange/services/2006/types}GuidType" />
 *       &lt;attribute name="PropertyTag" type="{http://schemas.microsoft.com/exchange/services/2006/types}PropertyTagType" />
 *       &lt;attribute name="PropertyName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PropertyId" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PropertyType" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}MapiPropertyTypeType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PathToExtendedFieldType")
public class PathToExtendedFieldType
    extends BasePathToElementType
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "DistinguishedPropertySetId")
    protected DistinguishedPropertySetType distinguishedPropertySetId;
    @XmlAttribute(name = "PropertySetId")
    protected String propertySetId;
    @XmlAttribute(name = "PropertyTag")
    protected String propertyTag;
    @XmlAttribute(name = "PropertyName")
    protected String propertyName;
    @XmlAttribute(name = "PropertyId")
    protected Integer propertyId;
    @XmlAttribute(name = "PropertyType", required = true)
    protected MapiPropertyTypeType propertyType;

    /**
     * Gets the value of the distinguishedPropertySetId property.
     * 
     * @return
     *     possible object is
     *     {@link DistinguishedPropertySetType }
     *     
     */
    public DistinguishedPropertySetType getDistinguishedPropertySetId() {
        return distinguishedPropertySetId;
    }

    /**
     * Sets the value of the distinguishedPropertySetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistinguishedPropertySetType }
     *     
     */
    public void setDistinguishedPropertySetId(DistinguishedPropertySetType value) {
        this.distinguishedPropertySetId = value;
    }

    /**
     * Gets the value of the propertySetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertySetId() {
        return propertySetId;
    }

    /**
     * Sets the value of the propertySetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertySetId(String value) {
        this.propertySetId = value;
    }

    /**
     * Gets the value of the propertyTag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyTag() {
        return propertyTag;
    }

    /**
     * Sets the value of the propertyTag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyTag(String value) {
        this.propertyTag = value;
    }

    /**
     * Gets the value of the propertyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPropertyName() {
        return propertyName;
    }

    /**
     * Sets the value of the propertyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPropertyName(String value) {
        this.propertyName = value;
    }

    /**
     * Gets the value of the propertyId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPropertyId() {
        return propertyId;
    }

    /**
     * Sets the value of the propertyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPropertyId(Integer value) {
        this.propertyId = value;
    }

    /**
     * Gets the value of the propertyType property.
     * 
     * @return
     *     possible object is
     *     {@link MapiPropertyTypeType }
     *     
     */
    public MapiPropertyTypeType getPropertyType() {
        return propertyType;
    }

    /**
     * Sets the value of the propertyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MapiPropertyTypeType }
     *     
     */
    public void setPropertyType(MapiPropertyTypeType value) {
        this.propertyType = value;
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
            DistinguishedPropertySetType theDistinguishedPropertySetId;
            theDistinguishedPropertySetId = this.getDistinguishedPropertySetId();
            strategy.appendField(locator, this, "distinguishedPropertySetId", buffer, theDistinguishedPropertySetId);
        }
        {
            String thePropertySetId;
            thePropertySetId = this.getPropertySetId();
            strategy.appendField(locator, this, "propertySetId", buffer, thePropertySetId);
        }
        {
            String thePropertyTag;
            thePropertyTag = this.getPropertyTag();
            strategy.appendField(locator, this, "propertyTag", buffer, thePropertyTag);
        }
        {
            String thePropertyName;
            thePropertyName = this.getPropertyName();
            strategy.appendField(locator, this, "propertyName", buffer, thePropertyName);
        }
        {
            Integer thePropertyId;
            thePropertyId = this.getPropertyId();
            strategy.appendField(locator, this, "propertyId", buffer, thePropertyId);
        }
        {
            MapiPropertyTypeType thePropertyType;
            thePropertyType = this.getPropertyType();
            strategy.appendField(locator, this, "propertyType", buffer, thePropertyType);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof PathToExtendedFieldType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final PathToExtendedFieldType that = ((PathToExtendedFieldType) object);
        {
            DistinguishedPropertySetType lhsDistinguishedPropertySetId;
            lhsDistinguishedPropertySetId = this.getDistinguishedPropertySetId();
            DistinguishedPropertySetType rhsDistinguishedPropertySetId;
            rhsDistinguishedPropertySetId = that.getDistinguishedPropertySetId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "distinguishedPropertySetId", lhsDistinguishedPropertySetId), LocatorUtils.property(thatLocator, "distinguishedPropertySetId", rhsDistinguishedPropertySetId), lhsDistinguishedPropertySetId, rhsDistinguishedPropertySetId)) {
                return false;
            }
        }
        {
            String lhsPropertySetId;
            lhsPropertySetId = this.getPropertySetId();
            String rhsPropertySetId;
            rhsPropertySetId = that.getPropertySetId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertySetId", lhsPropertySetId), LocatorUtils.property(thatLocator, "propertySetId", rhsPropertySetId), lhsPropertySetId, rhsPropertySetId)) {
                return false;
            }
        }
        {
            String lhsPropertyTag;
            lhsPropertyTag = this.getPropertyTag();
            String rhsPropertyTag;
            rhsPropertyTag = that.getPropertyTag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyTag", lhsPropertyTag), LocatorUtils.property(thatLocator, "propertyTag", rhsPropertyTag), lhsPropertyTag, rhsPropertyTag)) {
                return false;
            }
        }
        {
            String lhsPropertyName;
            lhsPropertyName = this.getPropertyName();
            String rhsPropertyName;
            rhsPropertyName = that.getPropertyName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyName", lhsPropertyName), LocatorUtils.property(thatLocator, "propertyName", rhsPropertyName), lhsPropertyName, rhsPropertyName)) {
                return false;
            }
        }
        {
            Integer lhsPropertyId;
            lhsPropertyId = this.getPropertyId();
            Integer rhsPropertyId;
            rhsPropertyId = that.getPropertyId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyId", lhsPropertyId), LocatorUtils.property(thatLocator, "propertyId", rhsPropertyId), lhsPropertyId, rhsPropertyId)) {
                return false;
            }
        }
        {
            MapiPropertyTypeType lhsPropertyType;
            lhsPropertyType = this.getPropertyType();
            MapiPropertyTypeType rhsPropertyType;
            rhsPropertyType = that.getPropertyType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "propertyType", lhsPropertyType), LocatorUtils.property(thatLocator, "propertyType", rhsPropertyType), lhsPropertyType, rhsPropertyType)) {
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
            DistinguishedPropertySetType theDistinguishedPropertySetId;
            theDistinguishedPropertySetId = this.getDistinguishedPropertySetId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "distinguishedPropertySetId", theDistinguishedPropertySetId), currentHashCode, theDistinguishedPropertySetId);
        }
        {
            String thePropertySetId;
            thePropertySetId = this.getPropertySetId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "propertySetId", thePropertySetId), currentHashCode, thePropertySetId);
        }
        {
            String thePropertyTag;
            thePropertyTag = this.getPropertyTag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "propertyTag", thePropertyTag), currentHashCode, thePropertyTag);
        }
        {
            String thePropertyName;
            thePropertyName = this.getPropertyName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "propertyName", thePropertyName), currentHashCode, thePropertyName);
        }
        {
            Integer thePropertyId;
            thePropertyId = this.getPropertyId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "propertyId", thePropertyId), currentHashCode, thePropertyId);
        }
        {
            MapiPropertyTypeType thePropertyType;
            thePropertyType = this.getPropertyType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "propertyType", thePropertyType), currentHashCode, thePropertyType);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
