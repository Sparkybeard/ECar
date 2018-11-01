
package com.ecar.park.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parkStats complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parkStats">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="countRents" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="countReturns" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "parkStats", propOrder = {
    "id",
    "countRents",
    "countReturns"
})
public class ParkStats {

    protected String id;
    protected int countRents;
    protected int countReturns;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the countRents property.
     * 
     */
    public int getCountRents() {
        return countRents;
    }

    /**
     * Sets the value of the countRents property.
     * 
     */
    public void setCountRents(int value) {
        this.countRents = value;
    }

    /**
     * Gets the value of the countReturns property.
     * 
     */
    public int getCountReturns() {
        return countReturns;
    }

    /**
     * Sets the value of the countReturns property.
     * 
     */
    public void setCountReturns(int value) {
        this.countReturns = value;
    }

}
