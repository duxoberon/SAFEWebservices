
package com.woolpert.safe.webservices;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for collection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="collection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="collection_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="collection_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="layer_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="min_x" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="min_y" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="max_x" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="max_y" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="min_time" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="max_time" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="geor_extent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="asset_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="asset_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asset_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="asset_platform_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="asset_position_geom" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="asset_position_time" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="org_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="org_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org_address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="org_description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "collection", propOrder = {
    "collectionID",
    "collectionName",
    "layerName",
    "minX",
    "minY",
    "maxX",
    "maxY",
    "minTime",
    "maxTime",
    "georExtent",
    "assetId",
    "assetName",
    "assetDescription",
    "assetPlatformID",
    "assetPositionGeom",
    "assetPositionTime",
    "orgId",
    "orgName",
    "orgAddress",
    "orgDescription"
})
public class Collection {

    @XmlElement(name = "collection_ID")
    protected int collectionID;
    @XmlElement(name = "collection_Name")
    protected String collectionName;
    @XmlElement(name = "layer_Name")
    protected String layerName;
    @XmlElement(name = "min_x")
    protected long minX;
    @XmlElement(name = "min_y")
    protected long minY;
    @XmlElement(name = "max_x")
    protected long maxX;
    @XmlElement(name = "max_y")
    protected long maxY;
    @XmlElement(name = "min_time")
    protected long minTime;
    @XmlElement(name = "max_time")
    protected long maxTime;
    @XmlElement(name = "geor_extent")
    @XmlMimeType("application/octet-stream")
    protected DataHandler georExtent;
    @XmlElement(name = "asset_id")
    protected int assetId;
    @XmlElement(name = "asset_name")
    protected String assetName;
    @XmlElement(name = "asset_description")
    protected String assetDescription;
    @XmlElement(name = "asset_platform_ID")
    protected int assetPlatformID;
    @XmlElement(name = "asset_position_geom")
    @XmlMimeType("application/octet-stream")
    protected DataHandler assetPositionGeom;
    @XmlElement(name = "asset_position_time")
    protected long assetPositionTime;
    @XmlElement(name = "org_id")
    protected int orgId;
    @XmlElement(name = "org_name")
    protected String orgName;
    @XmlElement(name = "org_address")
    protected String orgAddress;
    @XmlElement(name = "org_description")
    protected String orgDescription;

    /**
     * Gets the value of the collectionID property.
     * 
     */
    public int getCollectionID() {
        return collectionID;
    }

    /**
     * Sets the value of the collectionID property.
     * 
     */
    public void setCollectionID(int value) {
        this.collectionID = value;
    }

    /**
     * Gets the value of the collectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * Sets the value of the collectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionName(String value) {
        this.collectionName = value;
    }

    /**
     * Gets the value of the layerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayerName() {
        return layerName;
    }

    /**
     * Sets the value of the layerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayerName(String value) {
        this.layerName = value;
    }

    /**
     * Gets the value of the minX property.
     * 
     */
    public long getMinX() {
        return minX;
    }

    /**
     * Sets the value of the minX property.
     * 
     */
    public void setMinX(long value) {
        this.minX = value;
    }

    /**
     * Gets the value of the minY property.
     * 
     */
    public long getMinY() {
        return minY;
    }

    /**
     * Sets the value of the minY property.
     * 
     */
    public void setMinY(long value) {
        this.minY = value;
    }

    /**
     * Gets the value of the maxX property.
     * 
     */
    public long getMaxX() {
        return maxX;
    }

    /**
     * Sets the value of the maxX property.
     * 
     */
    public void setMaxX(long value) {
        this.maxX = value;
    }

    /**
     * Gets the value of the maxY property.
     * 
     */
    public long getMaxY() {
        return maxY;
    }

    /**
     * Sets the value of the maxY property.
     * 
     */
    public void setMaxY(long value) {
        this.maxY = value;
    }

    /**
     * Gets the value of the minTime property.
     * 
     */
    public long getMinTime() {
        return minTime;
    }

    /**
     * Sets the value of the minTime property.
     * 
     */
    public void setMinTime(long value) {
        this.minTime = value;
    }

    /**
     * Gets the value of the maxTime property.
     * 
     */
    public long getMaxTime() {
        return maxTime;
    }

    /**
     * Sets the value of the maxTime property.
     * 
     */
    public void setMaxTime(long value) {
        this.maxTime = value;
    }

    /**
     * Gets the value of the georExtent property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getGeorExtent() {
        return georExtent;
    }

    /**
     * Sets the value of the georExtent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setGeorExtent(DataHandler value) {
        this.georExtent = value;
    }

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
     * Gets the value of the assetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetName() {
        return assetName;
    }

    /**
     * Sets the value of the assetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetName(String value) {
        this.assetName = value;
    }

    /**
     * Gets the value of the assetDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetDescription() {
        return assetDescription;
    }

    /**
     * Sets the value of the assetDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetDescription(String value) {
        this.assetDescription = value;
    }

    /**
     * Gets the value of the assetPlatformID property.
     * 
     */
    public int getAssetPlatformID() {
        return assetPlatformID;
    }

    /**
     * Sets the value of the assetPlatformID property.
     * 
     */
    public void setAssetPlatformID(int value) {
        this.assetPlatformID = value;
    }

    /**
     * Gets the value of the assetPositionGeom property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getAssetPositionGeom() {
        return assetPositionGeom;
    }

    /**
     * Sets the value of the assetPositionGeom property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setAssetPositionGeom(DataHandler value) {
        this.assetPositionGeom = value;
    }

    /**
     * Gets the value of the assetPositionTime property.
     * 
     */
    public long getAssetPositionTime() {
        return assetPositionTime;
    }

    /**
     * Sets the value of the assetPositionTime property.
     * 
     */
    public void setAssetPositionTime(long value) {
        this.assetPositionTime = value;
    }

    /**
     * Gets the value of the orgId property.
     * 
     */
    public int getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     */
    public void setOrgId(int value) {
        this.orgId = value;
    }

    /**
     * Gets the value of the orgName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * Sets the value of the orgName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgName(String value) {
        this.orgName = value;
    }

    /**
     * Gets the value of the orgAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgAddress() {
        return orgAddress;
    }

    /**
     * Sets the value of the orgAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgAddress(String value) {
        this.orgAddress = value;
    }

    /**
     * Gets the value of the orgDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgDescription() {
        return orgDescription;
    }

    /**
     * Sets the value of the orgDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgDescription(String value) {
        this.orgDescription = value;
    }

}
