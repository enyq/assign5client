
package edu.utcluj.sd.tema5.dotnetwebservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddPackageResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "addPackageResult"
})
@XmlRootElement(name = "AddPackageResponse")
public class AddPackageResponse {

    @XmlElement(name = "AddPackageResult")
    protected String addPackageResult;

    /**
     * Gets the value of the addPackageResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddPackageResult() {
        return addPackageResult;
    }

    /**
     * Sets the value of the addPackageResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddPackageResult(String value) {
        this.addPackageResult = value;
    }

}
