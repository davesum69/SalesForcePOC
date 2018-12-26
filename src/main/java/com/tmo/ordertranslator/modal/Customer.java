package com.tmo.ordertranslator.modal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"CustomerId",
"CustomerUserName",
"FirstName",
"MiddleName",
"LastName",
"DOBMonth",
"DOBDay",
"DOBYear",
"SSN",
"CreditCheckIDType",
"CreditCheckIDState",
"CreditCheckIDNumber",
"CreditCheckIDExpDateMonth",
"CreditCheckIDExpDateYear",
"Email",
"CreditLevel",
"Tel",
"PIN"
})
public class Customer {

@JsonProperty("CustomerId")
private String customerId;
@JsonProperty("CustomerUserName")
private String customerUserName;
@JsonProperty("FirstName")
private String firstName;
@JsonProperty("MiddleName")
private String middleName;
@JsonProperty("LastName")
private String lastName;
@JsonProperty("DOBMonth")
private String dOBMonth;
@JsonProperty("DOBDay")
private String dOBDay;
@JsonProperty("DOBYear")
private String dOBYear;
@JsonProperty("SSN")
private String sSN;
@JsonProperty("CreditCheckIDType")
private String creditCheckIDType;
@JsonProperty("CreditCheckIDState")
private String creditCheckIDState;
@JsonProperty("CreditCheckIDNumber")
private String creditCheckIDNumber;
@JsonProperty("CreditCheckIDExpDateMonth")
private String creditCheckIDExpDateMonth;
@JsonProperty("CreditCheckIDExpDateYear")
private String creditCheckIDExpDateYear;
@JsonProperty("Email")
private String email;
@JsonProperty("CreditLevel")
private String creditLevel;
@JsonProperty("Tel")
private String tel;
@JsonProperty("PIN")
private String pIN;

@JsonProperty("CustomerId")
public String getCustomerId() {
return customerId;
}

@JsonProperty("CustomerId")
public void setCustomerId(String customerId) {
this.customerId = customerId;
}

@JsonProperty("CustomerUserName")
public String getCustomerUserName() {
return customerUserName;
}

@JsonProperty("CustomerUserName")
public void setCustomerUserName(String customerUserName) {
this.customerUserName = customerUserName;
}

@JsonProperty("FirstName")
public String getFirstName() {
return firstName;
}

@JsonProperty("FirstName")
public void setFirstName(String firstName) {
this.firstName = firstName;
}

@JsonProperty("MiddleName")
public String getMiddleName() {
return middleName;
}

@JsonProperty("MiddleName")
public void setMiddleName(String middleName) {
this.middleName = middleName;
}

@JsonProperty("LastName")
public String getLastName() {
return lastName;
}

@JsonProperty("LastName")
public void setLastName(String lastName) {
this.lastName = lastName;
}

@JsonProperty("DOBMonth")
public String getDOBMonth() {
return dOBMonth;
}

@JsonProperty("DOBMonth")
public void setDOBMonth(String dOBMonth) {
this.dOBMonth = dOBMonth;
}

@JsonProperty("DOBDay")
public String getDOBDay() {
return dOBDay;
}

@JsonProperty("DOBDay")
public void setDOBDay(String dOBDay) {
this.dOBDay = dOBDay;
}

@JsonProperty("DOBYear")
public String getDOBYear() {
return dOBYear;
}

@JsonProperty("DOBYear")
public void setDOBYear(String dOBYear) {
this.dOBYear = dOBYear;
}

@JsonProperty("SSN")
public String getSSN() {
return sSN;
}

@JsonProperty("SSN")
public void setSSN(String sSN) {
this.sSN = sSN;
}

@JsonProperty("CreditCheckIDType")
public String getCreditCheckIDType() {
return creditCheckIDType;
}

@JsonProperty("CreditCheckIDType")
public void setCreditCheckIDType(String creditCheckIDType) {
this.creditCheckIDType = creditCheckIDType;
}

@JsonProperty("CreditCheckIDState")
public String getCreditCheckIDState() {
return creditCheckIDState;
}

@JsonProperty("CreditCheckIDState")
public void setCreditCheckIDState(String creditCheckIDState) {
this.creditCheckIDState = creditCheckIDState;
}

@JsonProperty("CreditCheckIDNumber")
public String getCreditCheckIDNumber() {
return creditCheckIDNumber;
}

@JsonProperty("CreditCheckIDNumber")
public void setCreditCheckIDNumber(String creditCheckIDNumber) {
this.creditCheckIDNumber = creditCheckIDNumber;
}

@JsonProperty("CreditCheckIDExpDateMonth")
public String getCreditCheckIDExpDateMonth() {
return creditCheckIDExpDateMonth;
}

@JsonProperty("CreditCheckIDExpDateMonth")
public void setCreditCheckIDExpDateMonth(String creditCheckIDExpDateMonth) {
this.creditCheckIDExpDateMonth = creditCheckIDExpDateMonth;
}

@JsonProperty("CreditCheckIDExpDateYear")
public String getCreditCheckIDExpDateYear() {
return creditCheckIDExpDateYear;
}

@JsonProperty("CreditCheckIDExpDateYear")
public void setCreditCheckIDExpDateYear(String creditCheckIDExpDateYear) {
this.creditCheckIDExpDateYear = creditCheckIDExpDateYear;
}

@JsonProperty("Email")
public String getEmail() {
return email;
}

@JsonProperty("Email")
public void setEmail(String email) {
this.email = email;
}

@JsonProperty("CreditLevel")
public String getCreditLevel() {
return creditLevel;
}

@JsonProperty("CreditLevel")
public void setCreditLevel(String creditLevel) {
this.creditLevel = creditLevel;
}

@JsonProperty("Tel")
public String getTel() {
return tel;
}

@JsonProperty("Tel")
public void setTel(String tel) {
this.tel = tel;
}

@JsonProperty("PIN")
public String getPIN() {
return pIN;
}

@JsonProperty("PIN")
public void setPIN(String pIN) {
this.pIN = pIN;
}

}