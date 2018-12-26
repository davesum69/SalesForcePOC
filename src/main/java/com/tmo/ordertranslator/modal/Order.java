package com.tmo.ordertranslator.modal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"Header",
"Customer",
"Shipments",
"Addresses",
"Payments",
"BundleLineItems"
})
public class Order {

@JsonProperty("Header")
private Header header;
@JsonProperty("Customer")
private Customer customer;
@JsonProperty("Shipments")
private Shipments shipments;
@JsonProperty("Addresses")
private Addresses addresses;
@JsonProperty("Payments")
private Payments payments;
@JsonProperty("BundleLineItems")
private Object bundleLineItems;

@JsonProperty("Header")
public Header getHeader() {
return header;
}

@JsonProperty("Header")
public void setHeader(Header header) {
this.header = header;
}

@JsonProperty("Customer")
public Customer getCustomer() {
return customer;
}

@JsonProperty("Customer")
public void setCustomer(Customer customer) {
this.customer = customer;
}

@JsonProperty("Shipments")
public Shipments getShipments() {
return shipments;
}

@JsonProperty("Shipments")
public void setShipments(Shipments shipments) {
this.shipments = shipments;
}

@JsonProperty("Addresses")
public Addresses getAddresses() {
return addresses;
}

@JsonProperty("Addresses")
public void setAddresses(Addresses addresses) {
this.addresses = addresses;
}

@JsonProperty("Payments")
public Payments getPayments() {
return payments;
}

@JsonProperty("Payments")
public void setPayments(Payments payments) {
this.payments = payments;
}

@JsonProperty("BundleLineItems")
public Object getBundleLineItems() {
return bundleLineItems;
}

@JsonProperty("BundleLineItems")
public void setBundleLineItems(Object bundleLineItems) {
this.bundleLineItems = bundleLineItems;
}

}