
package com.woolpert.safe.webservices;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for platform complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="platform">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="platformID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="platformDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="platformName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="platformFixed" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "platform", propOrder = {
    "platformID",
    "platformDescription",
    "platformName",
    "platformFixed"
})
public class Platform {

    protected int platformID;
    protected String platformDescription;
    protected String platformName;
    protected int platformFixed;

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
     * Gets the value of the platformDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformDescription() {
        return platformDescription;
    }

    /**
     * Sets the value of the platformDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformDescription(String value) {
        this.platformDescription = value;
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
     * Gets the value of the platformFixed property.
     * 
     */
    public int getPlatformFixed() {
        return platformFixed;
    }

    /**
     * Sets the value of the platformFixed property.
     * 
     */
    public void setPlatformFixed(int value) {
        this.platformFixed = value;
    }

}
