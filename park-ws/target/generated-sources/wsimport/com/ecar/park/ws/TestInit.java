
package com.ecar.park.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for testInit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="testInit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xy" type="{http://ws.park.ecar.com/}xy" minOccurs="0"/>
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="returnBonus" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testInit", propOrder = {
    "xy",
    "capacity",
    "returnBonus"
})
public class TestInit {

    protected Xy xy;
    protected int capacity;
    protected int returnBonus;

    /**
     * Gets the value of the xy property.
     * 
     * @return
     *     possible object is
     *     {@link Xy }
     *     
     */
    public Xy getXy() {
        return xy;
    }

    /**
     * Sets the value of the xy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Xy }
     *     
     */
    public void setXy(Xy value) {
        this.xy = value;
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

}
