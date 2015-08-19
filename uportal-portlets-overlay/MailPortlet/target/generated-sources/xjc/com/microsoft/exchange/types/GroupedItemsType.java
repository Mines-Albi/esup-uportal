//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.18 at 02:30:12 PM CEST 
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
 * <p>Java class for GroupedItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GroupedItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GroupIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Items" type="{http://schemas.microsoft.com/exchange/services/2006/types}ArrayOfRealItemsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroupedItemsType", propOrder = {
    "groupIndex",
    "items"
})
public class GroupedItemsType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "GroupIndex", required = true)
    protected String groupIndex;
    @XmlElement(name = "Items", required = true)
    protected ArrayOfRealItemsType items;

    /**
     * Gets the value of the groupIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupIndex() {
        return groupIndex;
    }

    /**
     * Sets the value of the groupIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupIndex(String value) {
        this.groupIndex = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRealItemsType }
     *     
     */
    public ArrayOfRealItemsType getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRealItemsType }
     *     
     */
    public void setItems(ArrayOfRealItemsType value) {
        this.items = value;
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
            String theGroupIndex;
            theGroupIndex = this.getGroupIndex();
            strategy.appendField(locator, this, "groupIndex", buffer, theGroupIndex);
        }
        {
            ArrayOfRealItemsType theItems;
            theItems = this.getItems();
            strategy.appendField(locator, this, "items", buffer, theItems);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof GroupedItemsType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final GroupedItemsType that = ((GroupedItemsType) object);
        {
            String lhsGroupIndex;
            lhsGroupIndex = this.getGroupIndex();
            String rhsGroupIndex;
            rhsGroupIndex = that.getGroupIndex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "groupIndex", lhsGroupIndex), LocatorUtils.property(thatLocator, "groupIndex", rhsGroupIndex), lhsGroupIndex, rhsGroupIndex)) {
                return false;
            }
        }
        {
            ArrayOfRealItemsType lhsItems;
            lhsItems = this.getItems();
            ArrayOfRealItemsType rhsItems;
            rhsItems = that.getItems();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "items", lhsItems), LocatorUtils.property(thatLocator, "items", rhsItems), lhsItems, rhsItems)) {
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
            String theGroupIndex;
            theGroupIndex = this.getGroupIndex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "groupIndex", theGroupIndex), currentHashCode, theGroupIndex);
        }
        {
            ArrayOfRealItemsType theItems;
            theItems = this.getItems();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "items", theItems), currentHashCode, theItems);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
