package com.tmo.ordertranslator.modal;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Address"
})
public class Addresses {

@JsonProperty("Address")
private Address address;

@JsonProperty("Address")
public Address getAddress() {
return address;
}

@JsonProperty("Address")
public void setAddress(Address address) {
this.address = address;
}

}