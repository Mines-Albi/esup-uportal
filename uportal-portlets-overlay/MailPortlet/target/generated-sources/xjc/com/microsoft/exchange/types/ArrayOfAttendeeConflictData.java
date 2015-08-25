//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.20 at 01:37:20 PM CEST 
//


package com.microsoft.exchange.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 * <p>Java class for ArrayOfAttendeeConflictData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAttendeeConflictData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="UnknownAttendeeConflictData" type="{http://schemas.microsoft.com/exchange/services/2006/types}UnknownAttendeeConflictData"/>
 *         &lt;element name="IndividualAttendeeConflictData" type="{http://schemas.microsoft.com/exchange/services/2006/types}IndividualAttendeeConflictData"/>
 *         &lt;element name="TooBigGroupAttendeeConflictData" type="{http://schemas.microsoft.com/exchange/services/2006/types}TooBigGroupAttendeeConflictData"/>
 *         &lt;element name="GroupAttendeeConflictData" type="{http://schemas.microsoft.com/exchange/services/2006/types}GroupAttendeeConflictData"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAttendeeConflictData", propOrder = {
    "unknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas"
})
public class ArrayOfAttendeeConflictData
    implements Equals, HashCode, ToString
{

    @XmlElements({
        @XmlElement(name = "UnknownAttendeeConflictData", type = UnknownAttendeeConflictData.class, nillable = true),
        @XmlElement(name = "IndividualAttendeeConflictData", type = IndividualAttendeeConflictData.class, nillable = true),
        @XmlElement(name = "TooBigGroupAttendeeConflictData", type = TooBigGroupAttendeeConflictData.class, nillable = true),
        @XmlElement(name = "GroupAttendeeConflictData", type = GroupAttendeeConflictData.class, nillable = true)
    })
    protected List<AttendeeConflictData> unknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas;

    /**
     * Gets the value of the unknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnknownAttendeeConflictData }
     * {@link IndividualAttendeeConflictData }
     * {@link TooBigGroupAttendeeConflictData }
     * {@link GroupAttendeeConflictData }
     * 
     * 
     */
    public List<AttendeeConflictData> getUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas() {
        if (unknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas == null) {
            unknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas = new ArrayList<AttendeeConflictData>();
        }
        return this.unknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas;
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
            List<AttendeeConflictData> theUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas;
            theUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas = this.getUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas();
            strategy.appendField(locator, this, "unknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas", buffer, theUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ArrayOfAttendeeConflictData)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ArrayOfAttendeeConflictData that = ((ArrayOfAttendeeConflictData) object);
        {
            List<AttendeeConflictData> lhsUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas;
            lhsUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas = this.getUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas();
            List<AttendeeConflictData> rhsUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas;
            rhsUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas = that.getUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas", lhsUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas), LocatorUtils.property(thatLocator, "unknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas", rhsUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas), lhsUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas, rhsUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas)) {
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
            List<AttendeeConflictData> theUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas;
            theUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas = this.getUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas", theUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas), currentHashCode, theUnknownAttendeeConflictDatasAndIndividualAttendeeConflictDatasAndTooBigGroupAttendeeConflictDatas);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
