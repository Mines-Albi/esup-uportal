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
 * <p>Java class for MessageDispositionType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageDispositionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SaveOnly"/>
 *     &lt;enumeration value="SendOnly"/>
 *     &lt;enumeration value="SendAndSaveCopy"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageDispositionType")
@XmlEnum
public enum MessageDispositionType {

    @XmlEnumValue("SaveOnly")
    SAVE_ONLY("SaveOnly"),
    @XmlEnumValue("SendOnly")
    SEND_ONLY("SendOnly"),
    @XmlEnumValue("SendAndSaveCopy")
    SEND_AND_SAVE_COPY("SendAndSaveCopy");
    private final String value;

    MessageDispositionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageDispositionType fromValue(String v) {
        for (MessageDispositionType c: MessageDispositionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
