//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.18 at 02:30:12 PM CEST 
//


package com.microsoft.exchange.autodiscover;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for DomainSettingErrors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DomainSettingErrors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DomainSettingError" type="{http://schemas.microsoft.com/exchange/2010/Autodiscover}DomainSettingError" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DomainSettingErrors", propOrder = {
    "domainSettingErrors"
})
public class DomainSettingErrors
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "DomainSettingError", nillable = true)
    protected List<DomainSettingError> domainSettingErrors;

    /**
     * Gets the value of the domainSettingErrors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domainSettingErrors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomainSettingErrors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DomainSettingError }
     * 
     * 
     */
    public List<DomainSettingError> getDomainSettingErrors() {
        if (domainSettingErrors == null) {
            domainSettingErrors = new ArrayList<DomainSettingError>();
        }
        return this.domainSettingErrors;
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
            List<DomainSettingError> theDomainSettingErrors;
            theDomainSettingErrors = this.getDomainSettingErrors();
            strategy.appendField(locator, this, "domainSettingErrors", buffer, theDomainSettingErrors);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof DomainSettingErrors)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DomainSettingErrors that = ((DomainSettingErrors) object);
        {
            List<DomainSettingError> lhsDomainSettingErrors;
            lhsDomainSettingErrors = this.getDomainSettingErrors();
            List<DomainSettingError> rhsDomainSettingErrors;
            rhsDomainSettingErrors = that.getDomainSettingErrors();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "domainSettingErrors", lhsDomainSettingErrors), LocatorUtils.property(thatLocator, "domainSettingErrors", rhsDomainSettingErrors), lhsDomainSettingErrors, rhsDomainSettingErrors)) {
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
            List<DomainSettingError> theDomainSettingErrors;
            theDomainSettingErrors = this.getDomainSettingErrors();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "domainSettingErrors", theDomainSettingErrors), currentHashCode, theDomainSettingErrors);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
