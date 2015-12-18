
package com.woolpert.safe.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sensorMetadata complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sensorMetadata">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metadata_id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="calibration_Params" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="geo_Params" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sensorMetadata", propOrder = {
    "metadataId",
    "calibrationParams",
    "geoParams"
})
public class SensorMetadata {

    @XmlElement(name = "metadata_id")
    protected int metadataId;
    @XmlElement(name = "calibration_Params")
    protected String calibrationParams;
    @XmlElement(name = "geo_Params")
    protected String geoParams;

    /**
     * Gets the value of the metadataId property.
     * 
     */
    public int getMetadataId() {
        return metadataId;
    }

    /**
     * Sets the value of the metadataId property.
     * 
     */
    public void setMetadataId(int value) {
        this.metadataId = value;
    }

    /**
     * Gets the value of the calibrationParams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalibrationParams() {
        return calibrationParams;
    }

    /**
     * Sets the value of the calibrationParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalibrationParams(String value) {
        this.calibrationParams = value;
    }

    /**
     * Gets the value of the geoParams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeoParams() {
        return geoParams;
    }

    /**
     * Sets the value of the geoParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeoParams(String value) {
        this.geoParams = value;
    }

}
