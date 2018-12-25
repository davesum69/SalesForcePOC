package com.tmo.ordertranslator.modal;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orderStatus",
        "storeCode",
        "flowType",
        "applicationId",
        "createdDate",
        "locale",
        "currency",
        "orderNumber",
        "emailFrom",
        "totalItemCostBeforeTax",
        "totalShippingCostBeforeTax",
        "totalItemTaxes",
        "totalShippingTaxes",
        "totalTaxes",
        "totalItemCostIncludingTax",
        "totalShippingCostIncludingTax",
        "totalLoanAmount",
        "grandTotal",
        "promotions",
        "fields"
    })
    public class Header {

        @XmlElement(name = "OrderStatus", required = true)
        protected String orderStatus;
        @XmlElement(name = "StoreCode", required = true)
        protected String storeCode;
        @XmlElement(name = "FlowType", required = true)
        protected String flowType;
        @XmlElement(name = "ApplicationId", required = true)
        protected String applicationId;
        @XmlElement(name = "CreatedDate", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createdDate;
        @XmlElement(name = "Locale", required = true)
        protected String locale;
        @XmlElement(name = "Currency", required = true)
        protected String currency;
        @XmlElement(name = "OrderNumber", required = true)
        @XmlSchemaType(name = "unsignedLong")
        protected BigInteger orderNumber;
        @XmlElement(name = "EmailFrom", required = true)
        protected String emailFrom;
        @XmlElement(name = "TotalItemCostBeforeTax", required = true)
        protected BigDecimal totalItemCostBeforeTax;
        @XmlElement(name = "TotalShippingCostBeforeTax", required = true)
        protected BigDecimal totalShippingCostBeforeTax;
        @XmlElement(name = "TotalItemTaxes", required = true)
        protected BigDecimal totalItemTaxes;
        @XmlElement(name = "TotalShippingTaxes", required = true)
        protected BigDecimal totalShippingTaxes;
        @XmlElement(name = "TotalTaxes", required = true)
        protected BigDecimal totalTaxes;
        @XmlElement(name = "TotalItemCostIncludingTax", required = true)
        protected BigDecimal totalItemCostIncludingTax;
        @XmlElement(name = "TotalShippingCostIncludingTax", required = true)
        protected BigDecimal totalShippingCostIncludingTax;
        @XmlElement(name = "TotalLoanAmount", required = true)
        protected BigDecimal totalLoanAmount;
        @XmlElement(name = "GrandTotal", required = true)
        protected BigDecimal grandTotal;
        @XmlElement(name = "Promotions", required = true)
        protected Promotions promotions;
        @XmlElement(name = "Fields", required = true)
        protected Fields fields;

        /**
         * Gets the value of the orderStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderStatus() {
            return orderStatus;
        }

        /**
         * Sets the value of the orderStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderStatus(String value) {
            this.orderStatus = value;
        }

        /**
         * Gets the value of the storeCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStoreCode() {
            return storeCode;
        }

        /**
         * Sets the value of the storeCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStoreCode(String value) {
            this.storeCode = value;
        }

        /**
         * Gets the value of the flowType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlowType() {
            return flowType;
        }

        /**
         * Sets the value of the flowType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlowType(String value) {
            this.flowType = value;
        }

        /**
         * Gets the value of the applicationId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplicationId() {
            return applicationId;
        }

        /**
         * Sets the value of the applicationId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplicationId(String value) {
            this.applicationId = value;
        }

        /**
         * Gets the value of the createdDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreatedDate() {
            return createdDate;
        }

        /**
         * Sets the value of the createdDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreatedDate(XMLGregorianCalendar value) {
            this.createdDate = value;
        }

        /**
         * Gets the value of the locale property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocale() {
            return locale;
        }

        /**
         * Sets the value of the locale property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocale(String value) {
            this.locale = value;
        }

        /**
         * Gets the value of the currency property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * Sets the value of the currency property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

        /**
         * Gets the value of the orderNumber property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getOrderNumber() {
            return orderNumber;
        }

        /**
         * Sets the value of the orderNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setOrderNumber(BigInteger value) {
            this.orderNumber = value;
        }

        /**
         * Gets the value of the emailFrom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailFrom() {
            return emailFrom;
        }

        /**
         * Sets the value of the emailFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailFrom(String value) {
            this.emailFrom = value;
        }

        /**
         * Gets the value of the totalItemCostBeforeTax property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalItemCostBeforeTax() {
            return totalItemCostBeforeTax;
        }

        /**
         * Sets the value of the totalItemCostBeforeTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalItemCostBeforeTax(BigDecimal value) {
            this.totalItemCostBeforeTax = value;
        }

        /**
         * Gets the value of the totalShippingCostBeforeTax property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalShippingCostBeforeTax() {
            return totalShippingCostBeforeTax;
        }

        /**
         * Sets the value of the totalShippingCostBeforeTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalShippingCostBeforeTax(BigDecimal value) {
            this.totalShippingCostBeforeTax = value;
        }

        /**
         * Gets the value of the totalItemTaxes property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalItemTaxes() {
            return totalItemTaxes;
        }

        /**
         * Sets the value of the totalItemTaxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalItemTaxes(BigDecimal value) {
            this.totalItemTaxes = value;
        }

        /**
         * Gets the value of the totalShippingTaxes property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalShippingTaxes() {
            return totalShippingTaxes;
        }

        /**
         * Sets the value of the totalShippingTaxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalShippingTaxes(BigDecimal value) {
            this.totalShippingTaxes = value;
        }

        /**
         * Gets the value of the totalTaxes property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalTaxes() {
            return totalTaxes;
        }

        /**
         * Sets the value of the totalTaxes property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalTaxes(BigDecimal value) {
            this.totalTaxes = value;
        }

        /**
         * Gets the value of the totalItemCostIncludingTax property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalItemCostIncludingTax() {
            return totalItemCostIncludingTax;
        }

        /**
         * Sets the value of the totalItemCostIncludingTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalItemCostIncludingTax(BigDecimal value) {
            this.totalItemCostIncludingTax = value;
        }

        /**
         * Gets the value of the totalShippingCostIncludingTax property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalShippingCostIncludingTax() {
            return totalShippingCostIncludingTax;
        }

        /**
         * Sets the value of the totalShippingCostIncludingTax property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalShippingCostIncludingTax(BigDecimal value) {
            this.totalShippingCostIncludingTax = value;
        }

        /**
         * Gets the value of the totalLoanAmount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalLoanAmount() {
            return totalLoanAmount;
        }

        /**
         * Sets the value of the totalLoanAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalLoanAmount(BigDecimal value) {
            this.totalLoanAmount = value;
        }

        /**
         * Gets the value of the grandTotal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getGrandTotal() {
            return grandTotal;
        }

        /**
         * Sets the value of the grandTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setGrandTotal(BigDecimal value) {
            this.grandTotal = value;
        }

        /**
         * Gets the value of the promotions property.
         * 
         * @return
         *     possible object is
         *     {@link Order.Header.Promotions }
         *     
         */
        
}