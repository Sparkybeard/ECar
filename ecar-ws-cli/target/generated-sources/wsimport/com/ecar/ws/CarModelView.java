
package com.ecar.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carModelView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carModelView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="manufacturer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="model" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nrSeats" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rangeKm" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="chargeTimeHrs" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carModelView", propOrder = {
    "manufacturer",
    "model",
    "nrSeats",
    "rangeKm",
    "chargeTimeHrs"
})
public class CarModelView {

    protected String manufacturer;
    protected String model;
    protected int nrSeats;
    protected int rangeKm;
    protected int chargeTimeHrs;

    /**
     * Gets the value of the manufacturer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturer() {
        return manufacturer;
    }

    /**
     * Sets the value of the manufacturer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturer(String value) {
        this.manufacturer = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModel(String value) {
        this.model = value;
    }

    /**
     * Gets the value of the nrSeats property.
     * 
     */
    public int getNrSeats() {
        return nrSeats;
    }

    /**
     * Sets the value of the nrSeats property.
     * 
     */
    public void setNrSeats(int value) {
        this.nrSeats = value;
    }

    /**
     * Gets the value of the rangeKm property.
     * 
     */
    public int getRangeKm() {
        return rangeKm;
    }

    /**
     * Sets the value of the rangeKm property.
     * 
     */
    public void setRangeKm(int value) {
        this.rangeKm = value;
    }

    /**
     * Gets the value of the chargeTimeHrs property.
     * 
     */
    public int getChargeTimeHrs() {
        return chargeTimeHrs;
    }

    /**
     * Sets the value of the chargeTimeHrs property.
     * 
     */
    public void setChargeTimeHrs(int value) {
        this.chargeTimeHrs = value;
    }

}
