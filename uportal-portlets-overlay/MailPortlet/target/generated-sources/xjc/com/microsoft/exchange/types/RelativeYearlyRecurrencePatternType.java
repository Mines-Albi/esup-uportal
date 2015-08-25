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
 * <p>Java class for RelativeYearlyRecurrencePatternType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelativeYearlyRecurrencePatternType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}RecurrencePatternBaseType">
 *       &lt;sequence>
 *         &lt;element name="DaysOfWeek" type="{http://schemas.microsoft.com/exchange/services/2006/types}DayOfWeekType"/>
 *         &lt;element name="DayOfWeekIndex" type="{http://schemas.microsoft.com/exchange/services/2006/types}DayOfWeekIndexType"/>
 *         &lt;element name="Month" type="{http://schemas.microsoft.com/exchange/services/2006/types}MonthNamesType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelativeYearlyRecurrencePatternType", propOrder = {
    "daysOfWeek",
    "dayOfWeekIndex",
    "month"
})
public class RelativeYearlyRecurrencePatternType
    extends RecurrencePatternBaseType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "DaysOfWeek", required = true)
    protected DayOfWeekType daysOfWeek;
    @XmlElement(name = "DayOfWeekIndex", required = true)
    protected DayOfWeekIndexType dayOfWeekIndex;
    @XmlElement(name = "Month", required = true)
    protected MonthNamesType month;

    /**
     * Gets the value of the daysOfWeek property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getDaysOfWeek() {
        return daysOfWeek;
    }

    /**
     * Sets the value of the daysOfWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setDaysOfWeek(DayOfWeekType value) {
        this.daysOfWeek = value;
    }

    /**
     * Gets the value of the dayOfWeekIndex property.
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekIndexType }
     *     
     */
    public DayOfWeekIndexType getDayOfWeekIndex() {
        return dayOfWeekIndex;
    }

    /**
     * Sets the value of the dayOfWeekIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekIndexType }
     *     
     */
    public void setDayOfWeekIndex(DayOfWeekIndexType value) {
        this.dayOfWeekIndex = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link MonthNamesType }
     *     
     */
    public MonthNamesType getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonthNamesType }
     *     
     */
    public void setMonth(MonthNamesType value) {
        this.month = value;
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
            DayOfWeekType theDaysOfWeek;
            theDaysOfWeek = this.getDaysOfWeek();
            strategy.appendField(locator, this, "daysOfWeek", buffer, theDaysOfWeek);
        }
        {
            DayOfWeekIndexType theDayOfWeekIndex;
            theDayOfWeekIndex = this.getDayOfWeekIndex();
            strategy.appendField(locator, this, "dayOfWeekIndex", buffer, theDayOfWeekIndex);
        }
        {
            MonthNamesType theMonth;
            theMonth = this.getMonth();
            strategy.appendField(locator, this, "month", buffer, theMonth);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof RelativeYearlyRecurrencePatternType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final RelativeYearlyRecurrencePatternType that = ((RelativeYearlyRecurrencePatternType) object);
        {
            DayOfWeekType lhsDaysOfWeek;
            lhsDaysOfWeek = this.getDaysOfWeek();
            DayOfWeekType rhsDaysOfWeek;
            rhsDaysOfWeek = that.getDaysOfWeek();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "daysOfWeek", lhsDaysOfWeek), LocatorUtils.property(thatLocator, "daysOfWeek", rhsDaysOfWeek), lhsDaysOfWeek, rhsDaysOfWeek)) {
                return false;
            }
        }
        {
            DayOfWeekIndexType lhsDayOfWeekIndex;
            lhsDayOfWeekIndex = this.getDayOfWeekIndex();
            DayOfWeekIndexType rhsDayOfWeekIndex;
            rhsDayOfWeekIndex = that.getDayOfWeekIndex();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dayOfWeekIndex", lhsDayOfWeekIndex), LocatorUtils.property(thatLocator, "dayOfWeekIndex", rhsDayOfWeekIndex), lhsDayOfWeekIndex, rhsDayOfWeekIndex)) {
                return false;
            }
        }
        {
            MonthNamesType lhsMonth;
            lhsMonth = this.getMonth();
            MonthNamesType rhsMonth;
            rhsMonth = that.getMonth();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "month", lhsMonth), LocatorUtils.property(thatLocator, "month", rhsMonth), lhsMonth, rhsMonth)) {
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
            DayOfWeekType theDaysOfWeek;
            theDaysOfWeek = this.getDaysOfWeek();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "daysOfWeek", theDaysOfWeek), currentHashCode, theDaysOfWeek);
        }
        {
            DayOfWeekIndexType theDayOfWeekIndex;
            theDayOfWeekIndex = this.getDayOfWeekIndex();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dayOfWeekIndex", theDayOfWeekIndex), currentHashCode, theDayOfWeekIndex);
        }
        {
            MonthNamesType theMonth;
            theMonth = this.getMonth();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "month", theMonth), currentHashCode, theMonth);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
