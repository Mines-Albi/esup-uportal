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
 * <p>Java class for FolderResponseShapeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FolderResponseShapeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BaseShape" type="{http://schemas.microsoft.com/exchange/services/2006/types}DefaultShapeNamesType"/>
 *         &lt;element name="AdditionalProperties" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfPathsToElementType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderResponseShapeType", propOrder = {
    "baseShape",
    "additionalProperties"
})
public class FolderResponseShapeType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "BaseShape", required = true)
    protected DefaultShapeNamesType baseShape;
    @XmlElement(name = "AdditionalProperties")
    protected NonEmptyArrayOfPathsToElementType additionalProperties;

    /**
     * Gets the value of the baseShape property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultShapeNamesType }
     *     
     */
    public DefaultShapeNamesType getBaseShape() {
        return baseShape;
    }

    /**
     * Sets the value of the baseShape property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultShapeNamesType }
     *     
     */
    public void setBaseShape(DefaultShapeNamesType value) {
        this.baseShape = value;
    }

    /**
     * Gets the value of the additionalProperties property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfPathsToElementType }
     *     
     */
    public NonEmptyArrayOfPathsToElementType getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Sets the value of the additionalProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfPathsToElementType }
     *     
     */
    public void setAdditionalProperties(NonEmptyArrayOfPathsToElementType value) {
        this.additionalProperties = value;
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
            DefaultShapeNamesType theBaseShape;
            theBaseShape = this.getBaseShape();
            strategy.appendField(locator, this, "baseShape", buffer, theBaseShape);
        }
        {
            NonEmptyArrayOfPathsToElementType theAdditionalProperties;
            theAdditionalProperties = this.getAdditionalProperties();
            strategy.appendField(locator, this, "additionalProperties", buffer, theAdditionalProperties);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof FolderResponseShapeType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final FolderResponseShapeType that = ((FolderResponseShapeType) object);
        {
            DefaultShapeNamesType lhsBaseShape;
            lhsBaseShape = this.getBaseShape();
            DefaultShapeNamesType rhsBaseShape;
            rhsBaseShape = that.getBaseShape();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baseShape", lhsBaseShape), LocatorUtils.property(thatLocator, "baseShape", rhsBaseShape), lhsBaseShape, rhsBaseShape)) {
                return false;
            }
        }
        {
            NonEmptyArrayOfPathsToElementType lhsAdditionalProperties;
            lhsAdditionalProperties = this.getAdditionalProperties();
            NonEmptyArrayOfPathsToElementType rhsAdditionalProperties;
            rhsAdditionalProperties = that.getAdditionalProperties();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "additionalProperties", lhsAdditionalProperties), LocatorUtils.property(thatLocator, "additionalProperties", rhsAdditionalProperties), lhsAdditionalProperties, rhsAdditionalProperties)) {
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
            DefaultShapeNamesType theBaseShape;
            theBaseShape = this.getBaseShape();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baseShape", theBaseShape), currentHashCode, theBaseShape);
        }
        {
            NonEmptyArrayOfPathsToElementType theAdditionalProperties;
            theAdditionalProperties = this.getAdditionalProperties();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "additionalProperties", theAdditionalProperties), currentHashCode, theAdditionalProperties);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
