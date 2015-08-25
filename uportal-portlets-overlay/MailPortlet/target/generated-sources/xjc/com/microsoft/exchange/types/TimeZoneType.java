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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
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
 * <p>Java class for TimeZoneType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeZoneType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="BaseOffset" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element name="Standard" type="{http://schemas.microsoft.com/exchange/services/2006/types}TimeChangeType"/>
 *           &lt;element name="Daylight" type="{http://schemas.microsoft.com/exchange/services/2006/types}TimeChangeType"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="TimeZoneName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeZoneType", propOrder = {
    "baseOffset",
    "standard",
    "daylight"
})
public class TimeZoneType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "BaseOffset")
    protected Duration baseOffset;
    @XmlElement(name = "Standard")
    protected TimeChangeType standard;
    @XmlElement(name = "Daylight")
    protected TimeChangeType daylight;
    @XmlAttribute(name = "TimeZoneName")
    protected String timeZoneName;

    /**
     * Gets the value of the baseOffset property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getBaseOffset() {
        return baseOffset;
    }

    /**
     * Sets the value of the baseOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setBaseOffset(Duration value) {
        this.baseOffset = value;
    }

    /**
     * Gets the value of the standard property.
     * 
     * @return
     *     possible object is
     *     {@link TimeChangeType }
     *     
     */
    public TimeChangeType getStandard() {
        return standard;
    }

    /**
     * Sets the value of the standard property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeChangeType }
     *     
     */
    public void setStandard(TimeChangeType value) {
        this.standard = value;
    }

    /**
     * Gets the value of the daylight property.
     * 
     * @return
     *     possible object is
     *     {@link TimeChangeType }
     *     
     */
    public TimeChangeType getDaylight() {
        return daylight;
    }

    /**
     * Sets the value of the daylight property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeChangeType }
     *     
     */
    public void setDaylight(TimeChangeType value) {
        this.daylight = value;
    }

    /**
     * Gets the value of the timeZoneName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneName() {
        return timeZoneName;
    }

    /**
     * Sets the value of the timeZoneName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneName(String value) {
        this.timeZoneName = value;
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
            Duration theBaseOffset;
            theBaseOffset = this.getBaseOffset();
            strategy.appendField(locator, this, "baseOffset", buffer, theBaseOffset);
        }
        {
            TimeChangeType theStandard;
            theStandard = this.getStandard();
            strategy.appendField(locator, this, "standard", buffer, theStandard);
        }
        {
            TimeChangeType theDaylight;
            theDaylight = this.getDaylight();
            strategy.appendField(locator, this, "daylight", buffer, theDaylight);
        }
        {
            String theTimeZoneName;
            theTimeZoneName = this.getTimeZoneName();
            strategy.appendField(locator, this, "timeZoneName", buffer, theTimeZoneName);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TimeZoneType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeZoneType that = ((TimeZoneType) object);
        {
            Duration lhsBaseOffset;
            lhsBaseOffset = this.getBaseOffset();
            Duration rhsBaseOffset;
            rhsBaseOffset = that.getBaseOffset();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "baseOffset", lhsBaseOffset), LocatorUtils.property(thatLocator, "baseOffset", rhsBaseOffset), lhsBaseOffset, rhsBaseOffset)) {
                return false;
            }
        }
        {
            TimeChangeType lhsStandard;
            lhsStandard = this.getStandard();
            TimeChangeType rhsStandard;
            rhsStandard = that.getStandard();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "standard", lhsStandard), LocatorUtils.property(thatLocator, "standard", rhsStandard), lhsStandard, rhsStandard)) {
                return false;
            }
        }
        {
            TimeChangeType lhsDaylight;
            lhsDaylight = this.getDaylight();
            TimeChangeType rhsDaylight;
            rhsDaylight = that.getDaylight();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "daylight", lhsDaylight), LocatorUtils.property(thatLocator, "daylight", rhsDaylight), lhsDaylight, rhsDaylight)) {
                return false;
            }
        }
        {
            String lhsTimeZoneName;
            lhsTimeZoneName = this.getTimeZoneName();
            String rhsTimeZoneName;
            rhsTimeZoneName = that.getTimeZoneName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeZoneName", lhsTimeZoneName), LocatorUtils.property(thatLocator, "timeZoneName", rhsTimeZoneName), lhsTimeZoneName, rhsTimeZoneName)) {
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
            Duration theBaseOffset;
            theBaseOffset = this.getBaseOffset();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "baseOffset", theBaseOffset), currentHashCode, theBaseOffset);
        }
        {
            TimeChangeType theStandard;
            theStandard = this.getStandard();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "standard", theStandard), currentHashCode, theStandard);
        }
        {
            TimeChangeType theDaylight;
            theDaylight = this.getDaylight();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "daylight", theDaylight), currentHashCode, theDaylight);
        }
        {
            String theTimeZoneName;
            theTimeZoneName = this.getTimeZoneName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeZoneName", theTimeZoneName), currentHashCode, theTimeZoneName);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
