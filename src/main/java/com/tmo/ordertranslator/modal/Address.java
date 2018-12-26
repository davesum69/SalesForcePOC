package com.tmo.ordertranslator.modal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"AddressId",
"AddressType",
"FirstName",
"LastName",
"Street1",
"City",
"Region",
"Country",
"ZipPostalCode"
})
public class Address {

@JsonProperty("AddressId")
private String addressId;
@JsonProperty("AddressType")
private String addressType;
@JsonProperty("FirstName")
private String firstName;
@JsonProperty("LastName")
private String lastName;
@JsonProperty("Street1")
private String street1;
@JsonProperty("City")
private String city;
@JsonProperty("Region")
private String region;
@JsonProperty("Country")
private String country;
@JsonProperty("ZipPostalCode")
private String zipPostalCode;

@JsonProperty("AddressId")
public String getAddressId() {
return addressId;
}

@JsonProperty("AddressId")
public void setAddressId(String addressId) {
this.addressId = addressId;
}

@JsonProperty("AddressType")
public String getAddressType() {
return addressType;
}

@JsonProperty("AddressType")
public void setAddressType(String addressType) {
this.addressType = addressType;
}

@JsonProperty("FirstName")
public String getFirstName() {
return firstName;
}

@JsonProperty("FirstName")
public void setFirstName(String firstName) {
this.firstName = firstName;
}

@JsonProperty("LastName")
public String getLastName() {
return lastName;
}

@JsonProperty("LastName")
public void setLastName(String lastName) {
this.lastName = lastName;
}

@JsonProperty("Street1")
public String getStreet1() {
return street1;
}

@JsonProperty("Street1")
public void setStreet1(String street1) {
this.street1 = street1;
}

@JsonProperty("City")
public String getCity() {
return city;
}

@JsonProperty("City")
public void setCity(String city) {
this.city = city;
}

@JsonProperty("Region")
public String getRegion() {
return region;
}

@JsonProperty("Region")
public void setRegion(String region) {
this.region = region;
}

@JsonProperty("Country")
public String getCountry() {
return country;
}

@JsonProperty("Country")
public void setCountry(String country) {
this.country = country;
}

@JsonProperty("ZipPostalCode")
public String getZipPostalCode() {
return zipPostalCode;
}

@JsonProperty("ZipPostalCode")
public void setZipPostalCode(String zipPostalCode) {
this.zipPostalCode = zipPostalCode;
}

}