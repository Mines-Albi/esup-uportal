//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.18 at 02:30:12 PM CEST 
//


package com.microsoft.exchange.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
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
 * <p>Java class for NotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NotificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubscriptionId" type="{http://schemas.microsoft.com/exchange/services/2006/types}SubscriptionIdType"/>
 *         &lt;element name="PreviousWatermark" type="{http://schemas.microsoft.com/exchange/services/2006/types}WatermarkType"/>
 *         &lt;element name="MoreEvents" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;choice maxOccurs="unbounded">
 *           &lt;element name="CopiedEvent" type="{http://schemas.microsoft.com/exchange/services/2006/types}MovedCopiedEventType"/>
 *           &lt;element name="CreatedEvent" type="{http://schemas.microsoft.com/exchange/services/2006/types}BaseObjectChangedEventType"/>
 *           &lt;element name="DeletedEvent" type="{http://schemas.microsoft.com/exchange/services/2006/types}BaseObjectChangedEventType"/>
 *           &lt;element name="ModifiedEvent" type="{http://schemas.microsoft.com/exchange/services/2006/types}ModifiedEventType"/>
 *           &lt;element name="MovedEvent" type="{http://schemas.microsoft.com/exchange/services/2006/types}MovedCopiedEventType"/>
 *           &lt;element name="NewMailEvent" type="{http://schemas.microsoft.com/exchange/services/2006/types}BaseObjectChangedEventType"/>
 *           &lt;element name="StatusEvent" type="{http://schemas.microsoft.com/exchange/services/2006/types}BaseNotificationEventType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificationType", propOrder = {
    "subscriptionId",
    "previousWatermark",
    "moreEvents",
    "copiedEventsAndCreatedEventsAndDeletedEvents"
})
public class NotificationType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "SubscriptionId", required = true)
    protected String subscriptionId;
    @XmlElement(name = "PreviousWatermark", required = true)
    protected String previousWatermark;
    @XmlElement(name = "MoreEvents")
    protected boolean moreEvents;
    @XmlElementRefs({
        @XmlElementRef(name = "CopiedEvent", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class),
        @XmlElementRef(name = "StatusEvent", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class),
        @XmlElementRef(name = "CreatedEvent", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class),
        @XmlElementRef(name = "MovedEvent", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class),
        @XmlElementRef(name = "NewMailEvent", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class),
        @XmlElementRef(name = "DeletedEvent", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class),
        @XmlElementRef(name = "ModifiedEvent", namespace = "http://schemas.microsoft.com/exchange/services/2006/types", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends BaseNotificationEventType>> copiedEventsAndCreatedEventsAndDeletedEvents;

    /**
     * Gets the value of the subscriptionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Sets the value of the subscriptionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubscriptionId(String value) {
        this.subscriptionId = value;
    }

    /**
     * Gets the value of the previousWatermark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousWatermark() {
        return previousWatermark;
    }

    /**
     * Sets the value of the previousWatermark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousWatermark(String value) {
        this.previousWatermark = value;
    }

    /**
     * Gets the value of the moreEvents property.
     * 
     */
    public boolean isMoreEvents() {
        return moreEvents;
    }

    /**
     * Sets the value of the moreEvents property.
     * 
     */
    public void setMoreEvents(boolean value) {
        this.moreEvents = value;
    }

    /**
     * Gets the value of the copiedEventsAndCreatedEventsAndDeletedEvents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the copiedEventsAndCreatedEventsAndDeletedEvents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCopiedEventsAndCreatedEventsAndDeletedEvents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link MovedCopiedEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link MovedCopiedEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseObjectChangedEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseObjectChangedEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link ModifiedEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseNotificationEventType }{@code >}
     * {@link JAXBElement }{@code <}{@link BaseObjectChangedEventType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends BaseNotificationEventType>> getCopiedEventsAndCreatedEventsAndDeletedEvents() {
        if (copiedEventsAndCreatedEventsAndDeletedEvents == null) {
            copiedEventsAndCreatedEventsAndDeletedEvents = new ArrayList<JAXBElement<? extends BaseNotificationEventType>>();
        }
        return this.copiedEventsAndCreatedEventsAndDeletedEvents;
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
            String theSubscriptionId;
            theSubscriptionId = this.getSubscriptionId();
            strategy.appendField(locator, this, "subscriptionId", buffer, theSubscriptionId);
        }
        {
            String thePreviousWatermark;
            thePreviousWatermark = this.getPreviousWatermark();
            strategy.appendField(locator, this, "previousWatermark", buffer, thePreviousWatermark);
        }
        {
            boolean theMoreEvents;
            theMoreEvents = this.isMoreEvents();
            strategy.appendField(locator, this, "moreEvents", buffer, theMoreEvents);
        }
        {
            List<JAXBElement<? extends BaseNotificationEventType>> theCopiedEventsAndCreatedEventsAndDeletedEvents;
            theCopiedEventsAndCreatedEventsAndDeletedEvents = this.getCopiedEventsAndCreatedEventsAndDeletedEvents();
            strategy.appendField(locator, this, "copiedEventsAndCreatedEventsAndDeletedEvents", buffer, theCopiedEventsAndCreatedEventsAndDeletedEvents);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof NotificationType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final NotificationType that = ((NotificationType) object);
        {
            String lhsSubscriptionId;
            lhsSubscriptionId = this.getSubscriptionId();
            String rhsSubscriptionId;
            rhsSubscriptionId = that.getSubscriptionId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subscriptionId", lhsSubscriptionId), LocatorUtils.property(thatLocator, "subscriptionId", rhsSubscriptionId), lhsSubscriptionId, rhsSubscriptionId)) {
                return false;
            }
        }
        {
            String lhsPreviousWatermark;
            lhsPreviousWatermark = this.getPreviousWatermark();
            String rhsPreviousWatermark;
            rhsPreviousWatermark = that.getPreviousWatermark();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousWatermark", lhsPreviousWatermark), LocatorUtils.property(thatLocator, "previousWatermark", rhsPreviousWatermark), lhsPreviousWatermark, rhsPreviousWatermark)) {
                return false;
            }
        }
        {
            boolean lhsMoreEvents;
            lhsMoreEvents = this.isMoreEvents();
            boolean rhsMoreEvents;
            rhsMoreEvents = that.isMoreEvents();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "moreEvents", lhsMoreEvents), LocatorUtils.property(thatLocator, "moreEvents", rhsMoreEvents), lhsMoreEvents, rhsMoreEvents)) {
                return false;
            }
        }
        {
            List<JAXBElement<? extends BaseNotificationEventType>> lhsCopiedEventsAndCreatedEventsAndDeletedEvents;
            lhsCopiedEventsAndCreatedEventsAndDeletedEvents = this.getCopiedEventsAndCreatedEventsAndDeletedEvents();
            List<JAXBElement<? extends BaseNotificationEventType>> rhsCopiedEventsAndCreatedEventsAndDeletedEvents;
            rhsCopiedEventsAndCreatedEventsAndDeletedEvents = that.getCopiedEventsAndCreatedEventsAndDeletedEvents();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "copiedEventsAndCreatedEventsAndDeletedEvents", lhsCopiedEventsAndCreatedEventsAndDeletedEvents), LocatorUtils.property(thatLocator, "copiedEventsAndCreatedEventsAndDeletedEvents", rhsCopiedEventsAndCreatedEventsAndDeletedEvents), lhsCopiedEventsAndCreatedEventsAndDeletedEvents, rhsCopiedEventsAndCreatedEventsAndDeletedEvents)) {
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
            String theSubscriptionId;
            theSubscriptionId = this.getSubscriptionId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subscriptionId", theSubscriptionId), currentHashCode, theSubscriptionId);
        }
        {
            String thePreviousWatermark;
            thePreviousWatermark = this.getPreviousWatermark();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousWatermark", thePreviousWatermark), currentHashCode, thePreviousWatermark);
        }
        {
            boolean theMoreEvents;
            theMoreEvents = this.isMoreEvents();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "moreEvents", theMoreEvents), currentHashCode, theMoreEvents);
        }
        {
            List<JAXBElement<? extends BaseNotificationEventType>> theCopiedEventsAndCreatedEventsAndDeletedEvents;
            theCopiedEventsAndCreatedEventsAndDeletedEvents = this.getCopiedEventsAndCreatedEventsAndDeletedEvents();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "copiedEventsAndCreatedEventsAndDeletedEvents", theCopiedEventsAndCreatedEventsAndDeletedEvents), currentHashCode, theCopiedEventsAndCreatedEventsAndDeletedEvents);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
