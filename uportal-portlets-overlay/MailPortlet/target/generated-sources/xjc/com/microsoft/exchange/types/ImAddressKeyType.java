//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.20 at 01:37:20 PM CEST 
//


package com.microsoft.exchange.types;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImAddressKeyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ImAddressKeyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ImAddress1"/>
 *     &lt;enumeration value="ImAddress2"/>
 *     &lt;enumeration value="ImAddress3"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ImAddressKeyType")
@XmlEnum
public enum ImAddressKeyType {

    @XmlEnumValue("ImAddress1")
    IM_ADDRESS_1("ImAddress1"),
    @XmlEnumValue("ImAddress2")
    IM_ADDRESS_2("ImAddress2"),
    @XmlEnumValue("ImAddress3")
    IM_ADDRESS_3("ImAddress3");
    private final String value;

    ImAddressKeyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ImAddressKeyType fromValue(String v) {
        for (ImAddressKeyType c: ImAddressKeyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
