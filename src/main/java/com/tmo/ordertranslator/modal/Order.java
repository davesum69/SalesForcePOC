public class Order {
 Header HeaderObject;
 Customer CustomerObject;
 Shipments ShipmentsObject;
 Addresses AddressesObject;
 Payments PaymentsObject;
 private String BundleLineItems;
 private String xmlns;
 private String xmlns:ns2;


 // Getter Methods 

 public Header getHeader() {
  return HeaderObject;
 }

 public Customer getCustomer() {
  return CustomerObject;
 }

 public Shipments getShipments() {
  return ShipmentsObject;
 }

 public Addresses getAddresses() {
  return AddressesObject;
 }

 public Payments getPayments() {
  return PaymentsObject;
 }

 public String getBundleLineItems() {
  return BundleLineItems;
 }

 public String get_xmlns() {
  return _xmlns;
 }

 public String get_xmlns: ns2() {
  return _xmlns: ns2;
 }

 // Setter Methods 

 public void setHeader(Header HeaderObject) {
  this.HeaderObject = HeaderObject;
 }

 public void setCustomer(Customer CustomerObject) {
  this.CustomerObject = CustomerObject;
 }

 public void setShipments(Shipments ShipmentsObject) {
  this.ShipmentsObject = ShipmentsObject;
 }

 public void setAddresses(Addresses AddressesObject) {
  this.AddressesObject = AddressesObject;
 }

 public void setPayments(Payments PaymentsObject) {
  this.PaymentsObject = PaymentsObject;
 }

 public void setBundleLineItems(String BundleLineItems) {
  this.BundleLineItems = BundleLineItems;
 }

 public void set_xmlns(String _xmlns) {
  this._xmlns = _xmlns;
 }

 public void set_xmlns: ns2(String _xmlns: ns2) {
  this._xmlns: ns2 = _xmlns: ns2;
 }
}