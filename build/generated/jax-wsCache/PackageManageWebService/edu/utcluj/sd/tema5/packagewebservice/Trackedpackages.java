
package edu.utcluj.sd.tema5.packagewebservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for trackedpackages complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="trackedpackages">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="userpackageId" type="{http://webservice.sd.utcluj.edu/}userpackage" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "trackedpackages", propOrder = {
    "date",
    "id",
    "location",
    "userpackageId"
})
public class Trackedpackages {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected Integer id;
    protected String location;
    protected Userpackage userpackageId;

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Gets the value of the userpackageId property.
     * 
     * @return
     *     possible object is
     *     {@link Userpackage }
     *     
     */
    public Userpackage getUserpackageId() {
        return userpackageId;
    }

    /**
     * Sets the value of the userpackageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Userpackage }
     *     
     */
    public void setUserpackageId(Userpackage value) {
        this.userpackageId = value;
    }

}
