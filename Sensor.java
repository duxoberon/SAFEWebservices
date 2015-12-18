
package com.woolpert.safe.webservices;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sensor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sensor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sensorID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sensorDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sensorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="positionGeom" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="time" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="mfg_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="mfg_make" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mfg_model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spectrum_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="spectrum_desc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="spectrum_name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="metatdata_ID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sensorCalibrationParams" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sensorGeoParams" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sensor", propOrder = {
    "sensorID",
    "sensorDesc",
    "sensorName",
    "positionGeom",
    "time",
    "mfgID",
    "mfgMake",
    "mfgModel",
    "spectrumID",
    "spectrumDesc",
    "spectrumName",
    "metatdataID",
    "sensorCalibrationParams",
    "sensorGeoParams"
})
public class Sensor {

    protected int sensorID;
    protected String sensorDesc;
    protected String sensorName;
    @XmlMimeType("application/octet-stream")
    protected DataHandler positionGeom;
    protected long time;
    @XmlElement(name = "mfg_ID")
    protected int mfgID;
    @XmlElement(name = "mfg_make")
    protected String mfgMake;
    @XmlElement(name = "mfg_model")
    protected String mfgModel;
    @XmlElement(name = "spectrum_ID")
    protected int spectrumID;
    @XmlElement(name = "spectrum_desc")
    protected String spectrumDesc;
    @XmlElement(name = "spectrum_name")
    protected String spectrumName;
    @XmlElement(name = "metatdata_ID")
    protected int metatdataID;
    protected String sensorCalibrationParams;
    protected String sensorGeoParams;

    /**
     * Gets the value of the sensorID property.
     * 
     */
    public int getSensorID() {
        return sensorID;
    }

    /**
     * Sets the value of the sensorID property.
     * 
     */
    public void setSensorID(int value) {
        this.sensorID = value;
    }

    /**
     * Gets the value of the sensorDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorDesc() {
        return sensorDesc;
    }

    /**
     * Sets the value of the sensorDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorDesc(String value) {
        this.sensorDesc = value;
    }

    /**
     * Gets the value of the sensorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorName() {
        return sensorName;
    }

    /**
     * Sets the value of the sensorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorName(String value) {
        this.sensorName = value;
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
     */
    public long getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     */
    public void setTime(long value) {
        this.time = value;
    }

    /**
     * Gets the value of the mfgID property.
     * 
     */
    public int getMfgID() {
        return mfgID;
    }

    /**
     * Sets the value of the mfgID property.
     * 
     */
    public void setMfgID(int value) {
        this.mfgID = value;
    }

    /**
     * Gets the value of the mfgMake property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfgMake() {
        return mfgMake;
    }

    /**
     * Sets the value of the mfgMake property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfgMake(String value) {
        this.mfgMake = value;
    }

    /**
     * Gets the value of the mfgModel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfgModel() {
        return mfgModel;
    }

    /**
     * Sets the value of the mfgModel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfgModel(String value) {
        this.mfgModel = value;
    }

    /**
     * Gets the value of the spectrumID property.
     * 
     */
    public int getSpectrumID() {
        return spectrumID;
    }

    /**
     * Sets the value of the spectrumID property.
     * 
     */
    public void setSpectrumID(int value) {
        this.spectrumID = value;
    }

    /**
     * Gets the value of the spectrumDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpectrumDesc() {
        return spectrumDesc;
    }

    /**
     * Sets the value of the spectrumDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpectrumDesc(String value) {
        this.spectrumDesc = value;
    }

    /**
     * Gets the value of the spectrumName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpectrumName() {
        return spectrumName;
    }

    /**
     * Sets the value of the spectrumName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpectrumName(String value) {
        this.spectrumName = value;
    }

    /**
     * Gets the value of the metatdataID property.
     * 
     */
    public int getMetatdataID() {
        return metatdataID;
    }

    /**
     * Sets the value of the metatdataID property.
     * 
     */
    public void setMetatdataID(int value) {
        this.metatdataID = value;
    }

    /**
     * Gets the value of the sensorCalibrationParams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorCalibrationParams() {
        return sensorCalibrationParams;
    }

    /**
     * Sets the value of the sensorCalibrationParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorCalibrationParams(String value) {
        this.sensorCalibrationParams = value;
    }

    /**
     * Gets the value of the sensorGeoParams property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSensorGeoParams() {
        return sensorGeoParams;
    }

    /**
     * Sets the value of the sensorGeoParams property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSensorGeoParams(String value) {
        this.sensorGeoParams = value;
    }

}
