//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.18 at 02:30:12 PM CEST 
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
 * <p>Java class for ItemAttachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItemAttachmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/types}AttachmentType">
 *       &lt;choice minOccurs="0">
 *         &lt;element name="Item" type="{http://schemas.microsoft.com/exchange/services/2006/types}ItemType"/>
 *         &lt;element name="Message" type="{http://schemas.microsoft.com/exchange/services/2006/types}MessageType"/>
 *         &lt;element name="CalendarItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}CalendarItemType"/>
 *         &lt;element name="Contact" type="{http://schemas.microsoft.com/exchange/services/2006/types}ContactItemType"/>
 *         &lt;element name="MeetingMessage" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingMessageType"/>
 *         &lt;element name="MeetingRequest" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingRequestMessageType"/>
 *         &lt;element name="MeetingResponse" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingResponseMessageType"/>
 *         &lt;element name="MeetingCancellation" type="{http://schemas.microsoft.com/exchange/services/2006/types}MeetingCancellationMessageType"/>
 *         &lt;element name="Task" type="{http://schemas.microsoft.com/exchange/services/2006/types}TaskType"/>
 *         &lt;element name="PostItem" type="{http://schemas.microsoft.com/exchange/services/2006/types}PostItemType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItemAttachmentType", propOrder = {
    "postItem",
    "task",
    "meetingCancellation",
    "meetingResponse",
    "meetingRequest",
    "meetingMessage",
    "contact",
    "calendarItem",
    "message",
    "item"
})
public class ItemAttachmentType
    extends AttachmentType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "PostItem")
    protected PostItemType postItem;
    @XmlElement(name = "Task")
    protected TaskType task;
    @XmlElement(name = "MeetingCancellation")
    protected MeetingCancellationMessageType meetingCancellation;
    @XmlElement(name = "MeetingResponse")
    protected MeetingResponseMessageType meetingResponse;
    @XmlElement(name = "MeetingRequest")
    protected MeetingRequestMessageType meetingRequest;
    @XmlElement(name = "MeetingMessage")
    protected MeetingMessageType meetingMessage;
    @XmlElement(name = "Contact")
    protected ContactItemType contact;
    @XmlElement(name = "CalendarItem")
    protected CalendarItemType calendarItem;
    @XmlElement(name = "Message")
    protected MessageType message;
    @XmlElement(name = "Item")
    protected ItemType item;

    /**
     * Gets the value of the postItem property.
     * 
     * @return
     *     possible object is
     *     {@link PostItemType }
     *     
     */
    public PostItemType getPostItem() {
        return postItem;
    }

    /**
     * Sets the value of the postItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostItemType }
     *     
     */
    public void setPostItem(PostItemType value) {
        this.postItem = value;
    }

    /**
     * Gets the value of the task property.
     * 
     * @return
     *     possible object is
     *     {@link TaskType }
     *     
     */
    public TaskType getTask() {
        return task;
    }

    /**
     * Sets the value of the task property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaskType }
     *     
     */
    public void setTask(TaskType value) {
        this.task = value;
    }

    /**
     * Gets the value of the meetingCancellation property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingCancellationMessageType }
     *     
     */
    public MeetingCancellationMessageType getMeetingCancellation() {
        return meetingCancellation;
    }

    /**
     * Sets the value of the meetingCancellation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingCancellationMessageType }
     *     
     */
    public void setMeetingCancellation(MeetingCancellationMessageType value) {
        this.meetingCancellation = value;
    }

    /**
     * Gets the value of the meetingResponse property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingResponseMessageType }
     *     
     */
    public MeetingResponseMessageType getMeetingResponse() {
        return meetingResponse;
    }

    /**
     * Sets the value of the meetingResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingResponseMessageType }
     *     
     */
    public void setMeetingResponse(MeetingResponseMessageType value) {
        this.meetingResponse = value;
    }

    /**
     * Gets the value of the meetingRequest property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingRequestMessageType }
     *     
     */
    public MeetingRequestMessageType getMeetingRequest() {
        return meetingRequest;
    }

    /**
     * Sets the value of the meetingRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingRequestMessageType }
     *     
     */
    public void setMeetingRequest(MeetingRequestMessageType value) {
        this.meetingRequest = value;
    }

    /**
     * Gets the value of the meetingMessage property.
     * 
     * @return
     *     possible object is
     *     {@link MeetingMessageType }
     *     
     */
    public MeetingMessageType getMeetingMessage() {
        return meetingMessage;
    }

    /**
     * Sets the value of the meetingMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingMessageType }
     *     
     */
    public void setMeetingMessage(MeetingMessageType value) {
        this.meetingMessage = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactItemType }
     *     
     */
    public ContactItemType getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactItemType }
     *     
     */
    public void setContact(ContactItemType value) {
        this.contact = value;
    }

    /**
     * Gets the value of the calendarItem property.
     * 
     * @return
     *     possible object is
     *     {@link CalendarItemType }
     *     
     */
    public CalendarItemType getCalendarItem() {
        return calendarItem;
    }

    /**
     * Sets the value of the calendarItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalendarItemType }
     *     
     */
    public void setCalendarItem(CalendarItemType value) {
        this.calendarItem = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link MessageType }
     *     
     */
    public MessageType getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType }
     *     
     */
    public void setMessage(MessageType value) {
        this.message = value;
    }

    /**
     * Gets the value of the item property.
     * 
     * @return
     *     possible object is
     *     {@link ItemType }
     *     
     */
    public ItemType getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemType }
     *     
     */
    public void setItem(ItemType value) {
        this.item = value;
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
            PostItemType thePostItem;
            thePostItem = this.getPostItem();
            strategy.appendField(locator, this, "postItem", buffer, thePostItem);
        }
        {
            TaskType theTask;
            theTask = this.getTask();
            strategy.appendField(locator, this, "task", buffer, theTask);
        }
        {
            MeetingCancellationMessageType theMeetingCancellation;
            theMeetingCancellation = this.getMeetingCancellation();
            strategy.appendField(locator, this, "meetingCancellation", buffer, theMeetingCancellation);
        }
        {
            MeetingResponseMessageType theMeetingResponse;
            theMeetingResponse = this.getMeetingResponse();
            strategy.appendField(locator, this, "meetingResponse", buffer, theMeetingResponse);
        }
        {
            MeetingRequestMessageType theMeetingRequest;
            theMeetingRequest = this.getMeetingRequest();
            strategy.appendField(locator, this, "meetingRequest", buffer, theMeetingRequest);
        }
        {
            MeetingMessageType theMeetingMessage;
            theMeetingMessage = this.getMeetingMessage();
            strategy.appendField(locator, this, "meetingMessage", buffer, theMeetingMessage);
        }
        {
            ContactItemType theContact;
            theContact = this.getContact();
            strategy.appendField(locator, this, "contact", buffer, theContact);
        }
        {
            CalendarItemType theCalendarItem;
            theCalendarItem = this.getCalendarItem();
            strategy.appendField(locator, this, "calendarItem", buffer, theCalendarItem);
        }
        {
            MessageType theMessage;
            theMessage = this.getMessage();
            strategy.appendField(locator, this, "message", buffer, theMessage);
        }
        {
            ItemType theItem;
            theItem = this.getItem();
            strategy.appendField(locator, this, "item", buffer, theItem);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof ItemAttachmentType)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final ItemAttachmentType that = ((ItemAttachmentType) object);
        {
            PostItemType lhsPostItem;
            lhsPostItem = this.getPostItem();
            PostItemType rhsPostItem;
            rhsPostItem = that.getPostItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postItem", lhsPostItem), LocatorUtils.property(thatLocator, "postItem", rhsPostItem), lhsPostItem, rhsPostItem)) {
                return false;
            }
        }
        {
            TaskType lhsTask;
            lhsTask = this.getTask();
            TaskType rhsTask;
            rhsTask = that.getTask();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "task", lhsTask), LocatorUtils.property(thatLocator, "task", rhsTask), lhsTask, rhsTask)) {
                return false;
            }
        }
        {
            MeetingCancellationMessageType lhsMeetingCancellation;
            lhsMeetingCancellation = this.getMeetingCancellation();
            MeetingCancellationMessageType rhsMeetingCancellation;
            rhsMeetingCancellation = that.getMeetingCancellation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meetingCancellation", lhsMeetingCancellation), LocatorUtils.property(thatLocator, "meetingCancellation", rhsMeetingCancellation), lhsMeetingCancellation, rhsMeetingCancellation)) {
                return false;
            }
        }
        {
            MeetingResponseMessageType lhsMeetingResponse;
            lhsMeetingResponse = this.getMeetingResponse();
            MeetingResponseMessageType rhsMeetingResponse;
            rhsMeetingResponse = that.getMeetingResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meetingResponse", lhsMeetingResponse), LocatorUtils.property(thatLocator, "meetingResponse", rhsMeetingResponse), lhsMeetingResponse, rhsMeetingResponse)) {
                return false;
            }
        }
        {
            MeetingRequestMessageType lhsMeetingRequest;
            lhsMeetingRequest = this.getMeetingRequest();
            MeetingRequestMessageType rhsMeetingRequest;
            rhsMeetingRequest = that.getMeetingRequest();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meetingRequest", lhsMeetingRequest), LocatorUtils.property(thatLocator, "meetingRequest", rhsMeetingRequest), lhsMeetingRequest, rhsMeetingRequest)) {
                return false;
            }
        }
        {
            MeetingMessageType lhsMeetingMessage;
            lhsMeetingMessage = this.getMeetingMessage();
            MeetingMessageType rhsMeetingMessage;
            rhsMeetingMessage = that.getMeetingMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "meetingMessage", lhsMeetingMessage), LocatorUtils.property(thatLocator, "meetingMessage", rhsMeetingMessage), lhsMeetingMessage, rhsMeetingMessage)) {
                return false;
            }
        }
        {
            ContactItemType lhsContact;
            lhsContact = this.getContact();
            ContactItemType rhsContact;
            rhsContact = that.getContact();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contact", lhsContact), LocatorUtils.property(thatLocator, "contact", rhsContact), lhsContact, rhsContact)) {
                return false;
            }
        }
        {
            CalendarItemType lhsCalendarItem;
            lhsCalendarItem = this.getCalendarItem();
            CalendarItemType rhsCalendarItem;
            rhsCalendarItem = that.getCalendarItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "calendarItem", lhsCalendarItem), LocatorUtils.property(thatLocator, "calendarItem", rhsCalendarItem), lhsCalendarItem, rhsCalendarItem)) {
                return false;
            }
        }
        {
            MessageType lhsMessage;
            lhsMessage = this.getMessage();
            MessageType rhsMessage;
            rhsMessage = that.getMessage();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "message", lhsMessage), LocatorUtils.property(thatLocator, "message", rhsMessage), lhsMessage, rhsMessage)) {
                return false;
            }
        }
        {
            ItemType lhsItem;
            lhsItem = this.getItem();
            ItemType rhsItem;
            rhsItem = that.getItem();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "item", lhsItem), LocatorUtils.property(thatLocator, "item", rhsItem), lhsItem, rhsItem)) {
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
            PostItemType thePostItem;
            thePostItem = this.getPostItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postItem", thePostItem), currentHashCode, thePostItem);
        }
        {
            TaskType theTask;
            theTask = this.getTask();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "task", theTask), currentHashCode, theTask);
        }
        {
            MeetingCancellationMessageType theMeetingCancellation;
            theMeetingCancellation = this.getMeetingCancellation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meetingCancellation", theMeetingCancellation), currentHashCode, theMeetingCancellation);
        }
        {
            MeetingResponseMessageType theMeetingResponse;
            theMeetingResponse = this.getMeetingResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meetingResponse", theMeetingResponse), currentHashCode, theMeetingResponse);
        }
        {
            MeetingRequestMessageType theMeetingRequest;
            theMeetingRequest = this.getMeetingRequest();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meetingRequest", theMeetingRequest), currentHashCode, theMeetingRequest);
        }
        {
            MeetingMessageType theMeetingMessage;
            theMeetingMessage = this.getMeetingMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "meetingMessage", theMeetingMessage), currentHashCode, theMeetingMessage);
        }
        {
            ContactItemType theContact;
            theContact = this.getContact();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contact", theContact), currentHashCode, theContact);
        }
        {
            CalendarItemType theCalendarItem;
            theCalendarItem = this.getCalendarItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "calendarItem", theCalendarItem), currentHashCode, theCalendarItem);
        }
        {
            MessageType theMessage;
            theMessage = this.getMessage();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "message", theMessage), currentHashCode, theMessage);
        }
        {
            ItemType theItem;
            theItem = this.getItem();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "item", theItem), currentHashCode, theItem);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
