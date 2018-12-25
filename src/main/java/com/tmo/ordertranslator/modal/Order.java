
package com.tmo.ordertranslator.modal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "customer",
    "shipments",
    "addresses",
    "payments",
    "bundleLineItems"
})
@XmlRootElement(name = "Order")
public class Order {

    @XmlElement(name = "Header", required = true)
    protected Header header;
    @XmlElement(name = "Customer", required = true)
    protected Customer customer;
    @XmlElement(name = "Shipments", required = true)
    protected Shipments shipments;
    @XmlElement(name = "Addresses", required = true)
    protected Addresses addresses;
    @XmlElement(name = "Payments", required = true)
    protected Payments payments;
    @XmlElement(name = "BundleLineItems", required = true)
    protected Object bundleLineItems;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Order.Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Order.Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    public void setCustomer(Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the shipments property.
     * 
     * @return
     *     possible object is
     *     {@link Shipments }
     *     
     */
    public Shipments getShipments() {
        return shipments;
    }

    /**
     * Sets the value of the shipments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Shipments }
     *     
     */
    public void setShipments(Shipments value) {
        this.shipments = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * @return
     *     possible object is
     *     {@link Addresses }
     *     
     */
    public Addresses getAddresses() {
        return addresses;
    }

    /**
     * Sets the value of the addresses property.
     * 
     * @param value
     *     allowed object is
     *     {@link Addresses }
     *     
     */
    public void setAddresses(Addresses value) {
        this.addresses = value;
    }

    /**
     * Gets the value of the payments property.
     * 
     * @return
     *     possible object is
     *     {@link Payments }
     *     
     */
    public Payments getPayments() {
        return payments;
    }

    /**
     * Sets the value of the payments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payments }
     *     
     */
    public void setPayments(Payments value) {
        this.payments = value;
    }

    /**
     * Gets the value of the bundleLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getBundleLineItems() {
        return bundleLineItems;
    }

    /**
     * Sets the value of the bundleLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setBundleLineItems(Object value) {
        this.bundleLineItems = value;
    }
      
        }

    

