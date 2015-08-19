//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.18 at 02:30:12 PM CEST 
//


package com.microsoft.exchange.messages;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.exchange.types.NonEmptyArrayOfFoldersType;
import com.microsoft.exchange.types.TargetFolderIdType;
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
 * <p>Java class for CreateFolderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateFolderType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.microsoft.com/exchange/services/2006/messages}BaseRequestType">
 *       &lt;sequence>
 *         &lt;element name="ParentFolderId" type="{http://schemas.microsoft.com/exchange/services/2006/types}TargetFolderIdType"/>
 *         &lt;element name="Folders" type="{http://schemas.microsoft.com/exchange/services/2006/types}NonEmptyArrayOfFoldersType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateFolderType", propOrder = {
    "parentFolderId",
    "folders"
})
@XmlRootElement(name = "CreateFolder")
public class CreateFolder
    extends BaseRequestType
    implements Equals, HashCode, ToString
{

    @XmlElement(name = "ParentFolderId", required = true)
    protected TargetFolderIdType parentFolderId;
    @XmlElement(name = "Folders", required = true)
    protected NonEmptyArrayOfFoldersType folders;

    /**
     * Gets the value of the parentFolderId property.
     * 
     * @return
     *     possible object is
     *     {@link TargetFolderIdType }
     *     
     */
    public TargetFolderIdType getParentFolderId() {
        return parentFolderId;
    }

    /**
     * Sets the value of the parentFolderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetFolderIdType }
     *     
     */
    public void setParentFolderId(TargetFolderIdType value) {
        this.parentFolderId = value;
    }

    /**
     * Gets the value of the folders property.
     * 
     * @return
     *     possible object is
     *     {@link NonEmptyArrayOfFoldersType }
     *     
     */
    public NonEmptyArrayOfFoldersType getFolders() {
        return folders;
    }

    /**
     * Sets the value of the folders property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonEmptyArrayOfFoldersType }
     *     
     */
    public void setFolders(NonEmptyArrayOfFoldersType value) {
        this.folders = value;
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
            TargetFolderIdType theParentFolderId;
            theParentFolderId = this.getParentFolderId();
            strategy.appendField(locator, this, "parentFolderId", buffer, theParentFolderId);
        }
        {
            NonEmptyArrayOfFoldersType theFolders;
            theFolders = this.getFolders();
            strategy.appendField(locator, this, "folders", buffer, theFolders);
        }
        return buffer;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy strategy) {
        if (!(object instanceof CreateFolder)) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final CreateFolder that = ((CreateFolder) object);
        {
            TargetFolderIdType lhsParentFolderId;
            lhsParentFolderId = this.getParentFolderId();
            TargetFolderIdType rhsParentFolderId;
            rhsParentFolderId = that.getParentFolderId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "parentFolderId", lhsParentFolderId), LocatorUtils.property(thatLocator, "parentFolderId", rhsParentFolderId), lhsParentFolderId, rhsParentFolderId)) {
                return false;
            }
        }
        {
            NonEmptyArrayOfFoldersType lhsFolders;
            lhsFolders = this.getFolders();
            NonEmptyArrayOfFoldersType rhsFolders;
            rhsFolders = that.getFolders();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "folders", lhsFolders), LocatorUtils.property(thatLocator, "folders", rhsFolders), lhsFolders, rhsFolders)) {
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
            TargetFolderIdType theParentFolderId;
            theParentFolderId = this.getParentFolderId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "parentFolderId", theParentFolderId), currentHashCode, theParentFolderId);
        }
        {
            NonEmptyArrayOfFoldersType theFolders;
            theFolders = this.getFolders();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "folders", theFolders), currentHashCode, theFolders);
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

}
