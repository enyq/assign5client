
package edu.utcluj.sd.tema5.packagewebservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for userpackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="userpackage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="packageId" type="{http://webservice.sd.utcluj.edu/}packages" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://webservice.sd.utcluj.edu/}appusers" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "userpackage", propOrder = {
    "id",
    "packageId",
    "status",
    "userId"
})
public class Userpackage {

    protected Integer id;
    protected Packages packageId;
    protected String status;
    protected Appusers userId;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the packageId property.
     * 
     * @return
     *     possible object is
     *     {@link Packages }
     *     
     */
    public Packages getPackageId() {
        return packageId;
    }

    /**
     * Sets the value of the packageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Packages }
     *     
     */
    public void setPackageId(Packages value) {
        this.packageId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link Appusers }
     *     
     */
    public Appusers getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Appusers }
     *     
     */
    public void setUserId(Appusers value) {
        this.userId = value;
    }

}
