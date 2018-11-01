
package com.ecar.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getNearbyParks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getNearbyParks">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maxNrParks" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="userCoords" type="{http://ws.ecar.com/}coordinatesView" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getNearbyParks", propOrder = {
    "maxNrParks",
    "userCoords"
})
public class GetNearbyParks {

    protected Integer maxNrParks;
    protected CoordinatesView userCoords;

    /**
     * Gets the value of the maxNrParks property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNrParks() {
        return maxNrParks;
    }

    /**
     * Sets the value of the maxNrParks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNrParks(Integer value) {
        this.maxNrParks = value;
    }

    /**
     * Gets the value of the userCoords property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinatesView }
     *     
     */
    public CoordinatesView getUserCoords() {
        return userCoords;
    }

    /**
     * Sets the value of the userCoords property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinatesView }
     *     
     */
    public void setUserCoords(CoordinatesView value) {
        this.userCoords = value;
    }

}
