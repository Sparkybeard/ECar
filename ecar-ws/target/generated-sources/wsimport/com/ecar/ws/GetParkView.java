
package com.ecar.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getParkView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getParkView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getParkView", propOrder = {
    "parkId"
})
public class GetParkView {

    protected String parkId;

    /**
     * Gets the value of the parkId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParkId() {
        return parkId;
    }

    /**
     * Sets the value of the parkId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParkId(String value) {
        this.parkId = value;
    }

}
