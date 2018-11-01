
package com.ecar.ws;

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
 *         &lt;element name="initialUserCredit" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "initialUserCredit"
})
public class TestInit {

    protected int initialUserCredit;

    /**
     * Gets the value of the initialUserCredit property.
     * 
     */
    public int getInitialUserCredit() {
        return initialUserCredit;
    }

    /**
     * Sets the value of the initialUserCredit property.
     * 
     */
    public void setInitialUserCredit(int value) {
        this.initialUserCredit = value;
    }

}
