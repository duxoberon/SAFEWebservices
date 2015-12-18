
package com.woolpert.safe.webservices;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for asset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="asset">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="asset_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="platform_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="positionGeom" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="platform_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="platform_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fixed" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "asset", propOrder = {
    "assetId",
    "name",
    "desc",
    "platformID",
    "positionGeom",
    "time",
    "platformName",
    "platformDesc",
    "fixed"
})
public class Asset {

    @XmlElement(name = "asset_id")
    protected int assetId;
    protected String name;
    protected String desc;
    @XmlElement(name = "platform_ID")
    protected int platformID;
    @XmlMimeType("application/octet-stream")
    protected DataHandler positionGeom;
    protected Long time;
    @XmlElement(name = "platform_name")
    protected String platformName;
    @XmlElement(name = "platform_desc")
    protected String platformDesc;
    protected boolean fixed;

    /**
     * Gets the value of the assetId property.
     * 
     */
    public int getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     */
    public void setAssetId(int value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesc(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the platformID property.
     * 
     */
    public int getPlatformID() {
        return platformID;
    }

    /**
     * Sets the value of the platformID property.
     * 
     */
    public void setPlatformID(int value) {
        this.platformID = value;
    }

    /**
     * Gets the value of the positionGeom property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getPositionGeom() {
        return positionGeom;
    }

    /**
     * Sets the value of the positionGeom property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setPositionGeom(DataHandler value) {
        this.positionGeom = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTime(Long value) {
        this.time = value;
    }

    /**
     * Gets the value of the platformName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformName() {
        return platformName;
    }

    /**
     * Sets the value of the platformName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformName(String value) {
        this.platformName = value;
    }

    /**
     * Gets the value of the platformDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformDesc() {
        return platformDesc;
    }

    /**
     * Sets the value of the platformDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformDesc(String value) {
        this.platformDesc = value;
    }

    /**
     * Gets the value of the fixed property.
     * 
     */
    public boolean isFixed() {
        return fixed;
    }

    /**
     * Sets the value of the fixed property.
     * 
     */
    public void setFixed(boolean value) {
        this.fixed = value;
    }

}
