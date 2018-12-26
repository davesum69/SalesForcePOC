package com.tmo.ordertranslator.modal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"JurisdictionId",
"TaxRegionId",
"TaxIsInclusive",
"TaxName",
"TaxCode",
"TaxAmount",
"TaxRate",
"TaxCalculationDate"
})
public class TaxLine {

@JsonProperty("JurisdictionId")
private String jurisdictionId;
@JsonProperty("TaxRegionId")
private String taxRegionId;
@JsonProperty("TaxIsInclusive")
private String taxIsInclusive;
@JsonProperty("TaxName")
private String taxName;
@JsonProperty("TaxCode")
private String taxCode;
@JsonProperty("TaxAmount")
private String taxAmount;
@JsonProperty("TaxRate")
private String taxRate;
@JsonProperty("TaxCalculationDate")
private String taxCalculationDate;

@JsonProperty("JurisdictionId")
public String getJurisdictionId() {
return jurisdictionId;
}

@JsonProperty("JurisdictionId")
public void setJurisdictionId(String jurisdictionId) {
this.jurisdictionId = jurisdictionId;
}

@JsonProperty("TaxRegionId")
public String getTaxRegionId() {
return taxRegionId;
}

@JsonProperty("TaxRegionId")
public void setTaxRegionId(String taxRegionId) {
this.taxRegionId = taxRegionId;
}

@JsonProperty("TaxIsInclusive")
public String getTaxIsInclusive() {
return taxIsInclusive;
}

@JsonProperty("TaxIsInclusive")
public void setTaxIsInclusive(String taxIsInclusive) {
this.taxIsInclusive = taxIsInclusive;
}

@JsonProperty("TaxName")
public String getTaxName() {
return taxName;
}

@JsonProperty("TaxName")
public void setTaxName(String taxName) {
this.taxName = taxName;
}

@JsonProperty("TaxCode")
public String getTaxCode() {
return taxCode;
}

@JsonProperty("TaxCode")
public void setTaxCode(String taxCode) {
this.taxCode = taxCode;
}

@JsonProperty("TaxAmount")
public String getTaxAmount() {
return taxAmount;
}

@JsonProperty("TaxAmount")
public void setTaxAmount(String taxAmount) {
this.taxAmount = taxAmount;
}

@JsonProperty("TaxRate")
public String getTaxRate() {
return taxRate;
}

@JsonProperty("TaxRate")
public void setTaxRate(String taxRate) {
this.taxRate = taxRate;
}

@JsonProperty("TaxCalculationDate")
public String getTaxCalculationDate() {
return taxCalculationDate;
}

@JsonProperty("TaxCalculationDate")
public void setTaxCalculationDate(String taxCalculationDate) {
this.taxCalculationDate = taxCalculationDate;
}

}