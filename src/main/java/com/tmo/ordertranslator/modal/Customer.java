package com.tmo.ordertranslator.modal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "customerId",
    "customerUserName",
    "firstName",
    "middleName",
    "lastName",
    "dobMonth",
    "dobDay",
    "dobYear",
    "ssn",
    "creditCheckIDType",
    "creditCheckIDState",
    "creditCheckIDNumber",
    "creditCheckIDExpDateMonth",
    "creditCheckIDExpDateYear",
    "email",
    "creditLevel",
    "tel",
    "pin"
})
public class Customer {

    @XmlElement(name = "CustomerId", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String customerId;
    @XmlElement(name = "CustomerUserName", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String customerUserName;
    @XmlElement(name = "FirstName", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String firstName;
    @XmlElement(name = "MiddleName", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String middleName;
    @XmlElement(name = "LastName", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String lastName;
    @XmlElement(name = "DOBMonth", namespace = "http://com.elasticpath/repo/common")
    @XmlSchemaType(name = "unsignedByte")
    protected short dobMonth;
    @XmlElement(name = "DOBDay", namespace = "http://com.elasticpath/repo/common")
    @XmlSchemaType(name = "unsignedByte")
    protected short dobDay;
    @XmlElement(name = "DOBYear", namespace = "http://com.elasticpath/repo/common")
    @XmlSchemaType(name = "unsignedShort")
    protected int dobYear;
    @XmlElement(name = "SSN", namespace = "http://com.elasticpath/repo/common")
    @XmlSchemaType(name = "unsignedInt")
    protected long ssn;
    @XmlElement(name = "CreditCheckIDType", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String creditCheckIDType;
    @XmlElement(name = "CreditCheckIDState", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String creditCheckIDState;
    @XmlElement(name = "CreditCheckIDNumber", namespace = "http://com.elasticpath/repo/common")
    @XmlSchemaType(name = "unsignedInt")
    protected long creditCheckIDNumber;
    @XmlElement(name = "CreditCheckIDExpDateMonth", namespace = "http://com.elasticpath/repo/common")
    @XmlSchemaType(name = "unsignedByte")
    protected short creditCheckIDExpDateMonth;
    @XmlElement(name = "CreditCheckIDExpDateYear", namespace = "http://com.elasticpath/repo/common")
    @XmlSchemaType(name = "unsignedShort")
    protected int creditCheckIDExpDateYear;
    @XmlElement(name = "Email", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String email;
    @XmlElement(name = "CreditLevel", namespace = "http://com.elasticpath/repo/common", required = true)
    protected String creditLevel;
    @XmlElement(name = "Tel", namespace = "http://com.elasticpath/repo/common")
    @XmlSchemaType(name = "unsignedInt")
    protected long tel;
    @XmlElement(name = "PIN", namespace = "http://com.elasticpath/repo/common")
    @XmlSchemaType(name = "unsignedInt")
    protected long pin;

    /**
     * Gets the value of the customerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * Gets the value of the customerUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerUserName() {
        return customerUserName;
    }

    /**
     * Sets the value of the customerUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerUserName(String value) {
        this.customerUserName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the dobMonth property.
     * 
     */
    public short getDOBMonth() {
        return dobMonth;
    }

    /**
     * Sets the value of the dobMonth property.
     * 
     */
    public void setDOBMonth(short value) {
        this.dobMonth = value;
    }

    /**
     * Gets the value of the dobDay property.
     * 
     */
    public short getDOBDay() {
        return dobDay;
    }

    /**
     * Sets the value of the dobDay property.
     * 
     */
    public void setDOBDay(short value) {
        this.dobDay = value;
    }

    /**
     * Gets the value of the dobYear property.
     * 
     */
    public int getDOBYear() {
        return dobYear;
    }

    /**
     * Sets the value of the dobYear property.
     * 
     */
    public void setDOBYear(int value) {
        this.dobYear = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     */
    public long getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     */
    public void setSSN(long value) {
        this.ssn = value;
    }

    /**
     * Gets the value of the creditCheckIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCheckIDType() {
        return creditCheckIDType;
    }

    /**
     * Sets the value of the creditCheckIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCheckIDType(String value) {
        this.creditCheckIDType = value;
    }

    /**
     * Gets the value of the creditCheckIDState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCheckIDState() {
        return creditCheckIDState;
    }

    /**
     * Sets the value of the creditCheckIDState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCheckIDState(String value) {
        this.creditCheckIDState = value;
    }

    /**
     * Gets the value of the creditCheckIDNumber property.
     * 
     */
    public long getCreditCheckIDNumber() {
        return creditCheckIDNumber;
    }

    /**
     * Sets the value of the creditCheckIDNumber property.
     * 
     */
    public void setCreditCheckIDNumber(long value) {
        this.creditCheckIDNumber = value;
    }

    /**
     * Gets the value of the creditCheckIDExpDateMonth property.
     * 
     */
    public short getCreditCheckIDExpDateMonth() {
        return creditCheckIDExpDateMonth;
    }

    /**
     * Sets the value of the creditCheckIDExpDateMonth property.
     * 
     */
    public void setCreditCheckIDExpDateMonth(short value) {
        this.creditCheckIDExpDateMonth = value;
    }

    /**
     * Gets the value of the creditCheckIDExpDateYear property.
     * 
     */
    public int getCreditCheckIDExpDateYear() {
        return creditCheckIDExpDateYear;
    }

    /**
     * Sets the value of the creditCheckIDExpDateYear property.
     * 
     */
    public void setCreditCheckIDExpDateYear(int value) {
        this.creditCheckIDExpDateYear = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the creditLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditLevel() {
        return creditLevel;
    }

    /**
     * Sets the value of the creditLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditLevel(String value) {
        this.creditLevel = value;
    }

    /**
     * Gets the value of the tel property.
     * 
     */
    public long getTel() {
        return tel;
    }

    /**
     * Sets the value of the tel property.
     * 
     */
    public void setTel(long value) {
        this.tel = value;
    }

    /**
     * Gets the value of the pin property.
     * 
     */
    public long getPIN() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     */
    public void setPIN(long value) {
        this.pin = value;
    }

}

