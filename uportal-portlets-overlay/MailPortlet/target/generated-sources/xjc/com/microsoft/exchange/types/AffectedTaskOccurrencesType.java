//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.18 at 02:30:12 PM CEST 
//


package com.microsoft.exchange.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AffectedTaskOccurrencesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AffectedTaskOccurrencesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AllOccurrences"/>
 *     &lt;enumeration value="SpecifiedOccurrenceOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AffectedTaskOccurrencesType")
@XmlEnum
public enum AffectedTaskOccurrencesType {

    @XmlEnumValue("AllOccurrences")
    ALL_OCCURRENCES("AllOccurrences"),
    @XmlEnumValue("SpecifiedOccurrenceOnly")
    SPECIFIED_OCCURRENCE_ONLY("SpecifiedOccurrenceOnly");
    private final String value;

    AffectedTaskOccurrencesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AffectedTaskOccurrencesType fromValue(String v) {
        for (AffectedTaskOccurrencesType c: AffectedTaskOccurrencesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
