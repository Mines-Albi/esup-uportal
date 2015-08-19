//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.18 at 02:30:12 PM CEST 
//


package com.microsoft.exchange.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
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
 * <p>Java class for WorkingPeriod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkingPeriod">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DayOfWeek" type="{http://schemas.microsoft.com/exchange/services/2006/types}DaysOfWeekType"/>
 *         &lt;element name="StartTimeInMinutes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="EndTimeInMinutes" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WorkingPeriod", propOrder = {
    "dayOfWeek",
    "startTimeInMinutes",
    "endTimeInMinutes"
})
public class WorkingPeriod
    implements Equals, HashCode, ToString
{

    @XmlList
    @XmlElement(name = "DayOfWeek", required = true)
    protected List<DayOfWeekType> dayOfWeek;
    @XmlElement(name = "StartTimeInMinutes")
    protected int startTimeInMinutes;
    @XmlElement(name = "EndTimeInMinutes")
    protected int endTimeInMinutes;

    /**
     * Gets the value of the dayOfWeek property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayOfWeek property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayOfWeek().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayOfWeekType }
     * 
     * 
     */
    public List<DayOfWeekType> getDayOfWeek() {
        if (dayOfWeek == null) {
            dayOfWeek = new ArrayList<DayOfWeekType>();
        }
        return this.dayOfWeek;
    }

    /**
     * Gets the value of the startTimeInMinutes property.
     * 
     */
    public int getStartTimeInMinutes() {
        return startTimeInMinutes;
    }

    /**
     * Sets the value of the startTimeInMinutes property.
     * 
     */
    public void setStartTimeInMinutes(int value) {
        this.startTimeInMinutes = value;
    }

    /**
     * Gets the value of the endTimeInMinutes property.
     * 
     */
    public int getEndTimeInMinutes() {
        return endTimeInMinutes;
    }

    /**
     * Sets the value of the endTimeInMinutes property.
     * 
     */
    public void setEndTimeInMinutes(int value) {
        this.endTimeInMinutes = value;
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
            List<DayOfWeekType> theDayOfWeek;
            theDayOfWeek = this.getDayOfWeek();
            strategy.appendField(locator, this, "dayOfWeek", buffer, theDayOfWeek);
        }
        {
            int theStartTimeInMinutes;
            theStartTimeInMinutes = this.getStartTimeInMinutes();
            strategy.appendField(locator, this, "startTimeInMinutes", buffer, theStartTimeInMinutes);
        }
        {
            int theEndTimeInMinutes;
            theEndTimeInMinutes = this.getEndTimeInMinutes();
            strategy.appendField(locator, this, "endTimeInMinutes", buffer, theEndTimeInMinutes);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof WorkingPeriod)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final WorkingPeriod that = ((WorkingPeriod) object);
        {
            List<DayOfWeekType> lhsDayOfWeek;
            lhsDayOfWeek = this.getDayOfWeek();
            List<DayOfWeekType> rhsDayOfWeek;
            rhsDayOfWeek = that.getDayOfWeek();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dayOfWeek", lhsDayOfWeek), LocatorUtils.property(thatLocator, "dayOfWeek", rhsDayOfWeek), lhsDayOfWeek, rhsDayOfWeek)) {
                return false;
            }
        }
        {
            int lhsStartTimeInMinutes;
            lhsStartTimeInMinutes = this.getStartTimeInMinutes();
            int rhsStartTimeInMinutes;
            rhsStartTimeInMinutes = that.getStartTimeInMinutes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "startTimeInMinutes", lhsStartTimeInMinutes), LocatorUtils.property(thatLocator, "startTimeInMinutes", rhsStartTimeInMinutes), lhsStartTimeInMinutes, rhsStartTimeInMinutes)) {
                return false;
            }
        }
        {
            int lhsEndTimeInMinutes;
            lhsEndTimeInMinutes = this.getEndTimeInMinutes();
            int rhsEndTimeInMinutes;
            rhsEndTimeInMinutes = that.getEndTimeInMinutes();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endTimeInMinutes", lhsEndTimeInMinutes), LocatorUtils.property(thatLocator, "endTimeInMinutes", rhsEndTimeInMinutes), lhsEndTimeInMinutes, rhsEndTimeInMinutes)) {
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
            List<DayOfWeekType> theDayOfWeek;
            theDayOfWeek = this.getDayOfWeek();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dayOfWeek", theDayOfWeek), currentHashCode, theDayOfWeek);
        }
        {
            int theStartTimeInMinutes;
            theStartTimeInMinutes = this.getStartTimeInMinutes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "startTimeInMinutes", theStartTimeInMinutes), currentHashCode, theStartTimeInMinutes);
        }
        {
            int theEndTimeInMinutes;
            theEndTimeInMinutes = this.getEndTimeInMinutes();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endTimeInMinutes", theEndTimeInMinutes), currentHashCode, theEndTimeInMinutes);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
