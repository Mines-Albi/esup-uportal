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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
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
 * <p>Java class for TimeChangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeChangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Offset" type="{http://www.w3.org/2001/XMLSchema}duration"/>
 *         &lt;group ref="{http://schemas.microsoft.com/exchange/services/2006/types}TimeChangePatternTypes" minOccurs="0"/>
 *         &lt;element name="Time" type="{http://www.w3.org/2001/XMLSchema}time"/>
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
@XmlType(name = "TimeChangeType", propOrder = {
    "offset",
    "absoluteDate",
    "relativeYearlyRecurrence",
    "time"
})
public class TimeChangeType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "Offset", required = true)
    protected Duration offset;
    @XmlElement(name = "AbsoluteDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar absoluteDate;
    @XmlElement(name = "RelativeYearlyRecurrence")
    protected RelativeYearlyRecurrencePatternType relativeYearlyRecurrence;
    @XmlElement(name = "Time", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar time;
    @XmlAttribute(name = "TimeZoneName")
    protected String timeZoneName;

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOffset(Duration value) {
        this.offset = value;
    }

    /**
     * Gets the value of the absoluteDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAbsoluteDate() {
        return absoluteDate;
    }

    /**
     * Sets the value of the absoluteDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAbsoluteDate(XMLGregorianCalendar value) {
        this.absoluteDate = value;
    }

    /**
     * Gets the value of the relativeYearlyRecurrence property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeYearlyRecurrencePatternType }
     *     
     */
    public RelativeYearlyRecurrencePatternType getRelativeYearlyRecurrence() {
        return relativeYearlyRecurrence;
    }

    /**
     * Sets the value of the relativeYearlyRecurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeYearlyRecurrencePatternType }
     *     
     */
    public void setRelativeYearlyRecurrence(RelativeYearlyRecurrencePatternType value) {
        this.relativeYearlyRecurrence = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTime(XMLGregorianCalendar value) {
        this.time = value;
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
            Duration theOffset;
            theOffset = this.getOffset();
            strategy.appendField(locator, this, "offset", buffer, theOffset);
        }
        {
            XMLGregorianCalendar theAbsoluteDate;
            theAbsoluteDate = this.getAbsoluteDate();
            strategy.appendField(locator, this, "absoluteDate", buffer, theAbsoluteDate);
        }
        {
            RelativeYearlyRecurrencePatternType theRelativeYearlyRecurrence;
            theRelativeYearlyRecurrence = this.getRelativeYearlyRecurrence();
            strategy.appendField(locator, this, "relativeYearlyRecurrence", buffer, theRelativeYearlyRecurrence);
        }
        {
            XMLGregorianCalendar theTime;
            theTime = this.getTime();
            strategy.appendField(locator, this, "time", buffer, theTime);
        }
        {
            String theTimeZoneName;
            theTimeZoneName = this.getTimeZoneName();
            strategy.appendField(locator, this, "timeZoneName", buffer, theTimeZoneName);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof TimeChangeType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TimeChangeType that = ((TimeChangeType) object);
        {
            Duration lhsOffset;
            lhsOffset = this.getOffset();
            Duration rhsOffset;
            rhsOffset = that.getOffset();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "offset", lhsOffset), LocatorUtils.property(thatLocator, "offset", rhsOffset), lhsOffset, rhsOffset)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsAbsoluteDate;
            lhsAbsoluteDate = this.getAbsoluteDate();
            XMLGregorianCalendar rhsAbsoluteDate;
            rhsAbsoluteDate = that.getAbsoluteDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "absoluteDate", lhsAbsoluteDate), LocatorUtils.property(thatLocator, "absoluteDate", rhsAbsoluteDate), lhsAbsoluteDate, rhsAbsoluteDate)) {
                return false;
            }
        }
        {
            RelativeYearlyRecurrencePatternType lhsRelativeYearlyRecurrence;
            lhsRelativeYearlyRecurrence = this.getRelativeYearlyRecurrence();
            RelativeYearlyRecurrencePatternType rhsRelativeYearlyRecurrence;
            rhsRelativeYearlyRecurrence = that.getRelativeYearlyRecurrence();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "relativeYearlyRecurrence", lhsRelativeYearlyRecurrence), LocatorUtils.property(thatLocator, "relativeYearlyRecurrence", rhsRelativeYearlyRecurrence), lhsRelativeYearlyRecurrence, rhsRelativeYearlyRecurrence)) {
                return false;
            }
        }
        {
            XMLGregorianCalendar lhsTime;
            lhsTime = this.getTime();
            XMLGregorianCalendar rhsTime;
            rhsTime = that.getTime();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "time", lhsTime), LocatorUtils.property(thatLocator, "time", rhsTime), lhsTime, rhsTime)) {
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
            Duration theOffset;
            theOffset = this.getOffset();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "offset", theOffset), currentHashCode, theOffset);
        }
        {
            XMLGregorianCalendar theAbsoluteDate;
            theAbsoluteDate = this.getAbsoluteDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "absoluteDate", theAbsoluteDate), currentHashCode, theAbsoluteDate);
        }
        {
            RelativeYearlyRecurrencePatternType theRelativeYearlyRecurrence;
            theRelativeYearlyRecurrence = this.getRelativeYearlyRecurrence();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "relativeYearlyRecurrence", theRelativeYearlyRecurrence), currentHashCode, theRelativeYearlyRecurrence);
        }
        {
            XMLGregorianCalendar theTime;
            theTime = this.getTime();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "time", theTime), currentHashCode, theTime);
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
