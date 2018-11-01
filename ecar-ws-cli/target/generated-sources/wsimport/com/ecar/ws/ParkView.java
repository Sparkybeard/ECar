
package com.ecar.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for parkView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="parkView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="coords" type="{http://ws.ecar.com/}coordinatesView" minOccurs="0"/>
 *         &lt;element name="returnBonus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="availableCars" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="freeSpaces" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
@XmlType(name = "parkView", propOrder = {
    "id",
    "coords",
    "returnBonus",
    "capacity",
    "availableCars",
    "freeSpaces",
    "countRents",
    "countReturns"
})
public class ParkView {

    protected String id;
    protected CoordinatesView coords;
    protected int returnBonus;
    protected int capacity;
    protected int availableCars;
    protected int freeSpaces;
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
     * Gets the value of the coords property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesView }
     *     
     */
    public CoordinatesView getCoords() {
        return coords;
    }

    /**
     * Sets the value of the coords property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesView }
     *     
     */
    public void setCoords(CoordinatesView value) {
        this.coords = value;
    }

    /**
     * Gets the value of the returnBonus property.
     * 
     */
    public int getReturnBonus() {
        return returnBonus;
    }

    /**
     * Sets the value of the returnBonus property.
     * 
     */
    public void setReturnBonus(int value) {
        this.returnBonus = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     */
    public void setCapacity(int value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the availableCars property.
     * 
     */
    public int getAvailableCars() {
        return availableCars;
    }

    /**
     * Sets the value of the availableCars property.
     * 
     */
    public void setAvailableCars(int value) {
        this.availableCars = value;
    }

    /**
     * Gets the value of the freeSpaces property.
     * 
     */
    public int getFreeSpaces() {
        return freeSpaces;
    }

    /**
     * Sets the value of the freeSpaces property.
     * 
     */
    public void setFreeSpaces(int value) {
        this.freeSpaces = value;
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
