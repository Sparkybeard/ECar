
package com.ecar.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testInitPark complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testInitPark">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="initialParkState" type="{http://ws.ecar.com/}parkView" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testInitPark", propOrder = {
    "initialParkState"
})
public class TestInitPark {

    protected ParkView initialParkState;

    /**
     * Gets the value of the initialParkState property.
     * 
     * @return
     *     possible object is
     *     {@link ParkView }
     *     
     */
    public ParkView getInitialParkState() {
        return initialParkState;
    }

    /**
     * Sets the value of the initialParkState property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParkView }
     *     
     */
    public void setInitialParkState(ParkView value) {
        this.initialParkState = value;
    }

}
