//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.20 at 01:37:20 PM CEST 
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
 * <p>Java class for RecurringMasterItemIdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurringMasterItemIdType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}BaseItemIdType">
 *       &lt;attribute name="OccurrenceId" use="required" type="{http://schemas.microsoft.com/exchange/services/2006/types}DerivedItemIdType" />
 *       &lt;attribute name="ChangeKey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurringMasterItemIdType")
public class RecurringMasterItemIdType
    extends BaseItemIdType
    implements Equals, HashCode, ToString
{

    @XmlAttribute(name = "OccurrenceId", required = true)
    protected String occurrenceId;
    @XmlAttribute(name = "ChangeKey")
    protected String changeKey;

    /**
     * Gets the value of the occurrenceId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccurrenceId() {
        return occurrenceId;
    }

    /**
     * Sets the value of the occurrenceId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccurrenceId(String value) {
        this.occurrenceId = value;
    }

    /**
     * Gets the value of the changeKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeKey() {
        return changeKey;
    }

    /**
     * Sets the value of the changeKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeKey(String value) {
        this.changeKey = value;
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
            String theOccurrenceId;
            theOccurrenceId = this.getOccurrenceId();
            strategy.appendField(locator, this, "occurrenceId", buffer, theOccurrenceId);
        }
        {
            String theChangeKey;
            theChangeKey = this.getChangeKey();
            strategy.appendField(locator, this, "changeKey", buffer, theChangeKey);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RecurringMasterItemIdType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RecurringMasterItemIdType that = ((RecurringMasterItemIdType) object);
        {
            String lhsOccurrenceId;
            lhsOccurrenceId = this.getOccurrenceId();
            String rhsOccurrenceId;
            rhsOccurrenceId = that.getOccurrenceId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "occurrenceId", lhsOccurrenceId), LocatorUtils.property(thatLocator, "occurrenceId", rhsOccurrenceId), lhsOccurrenceId, rhsOccurrenceId)) {
                return false;
            }
        }
        {
            String lhsChangeKey;
            lhsChangeKey = this.getChangeKey();
            String rhsChangeKey;
            rhsChangeKey = that.getChangeKey();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "changeKey", lhsChangeKey), LocatorUtils.property(thatLocator, "changeKey", rhsChangeKey), lhsChangeKey, rhsChangeKey)) {
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
            String theOccurrenceId;
            theOccurrenceId = this.getOccurrenceId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "occurrenceId", theOccurrenceId), currentHashCode, theOccurrenceId);
        }
        {
            String theChangeKey;
            theChangeKey = this.getChangeKey();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "changeKey", theChangeKey), currentHashCode, theChangeKey);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
