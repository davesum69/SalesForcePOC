package com.tmo.ordertranslator.modal;

public class Promotion {
    private String type;
    private String name;
    private String displayName;
    private String coupons;
    private String expirationDate;
    private String discountValue;
    private String discountType;
    private String discountTotalAmount;


    // Getter Methods 

    public String getType() {
     return type;
    }

    public String getName() {
     return name;
    }

    public String getDisplayName() {
     return displayName;
    }

    public String getCoupons() {
     return coupons;
    }

    public String getExpirationDate() {
     return expirationDate;
    }

    public String getDiscountValue() {
     return discountValue;
    }

    public String getDiscountType() {
     return discountType;
    }

    public String getDiscountTotalAmount() {
     return discountTotalAmount;
    }

    // Setter Methods 

    public void setType(String type) {
     this.type = type;
    }

    public void setName(String name) {
     this.name = name;
    }

    public void setDisplayName(String displayName) {
     this.displayName = displayName;
    }

    public void setCoupons(String coupons) {
     this.coupons = coupons;
    }

    public void setExpirationDate(String expirationDate) {
     this.expirationDate = expirationDate;
    }

    public void setDiscountValue(String discountValue) {
     this.discountValue = discountValue;
    }

    public void setDiscountType(String discountType) {
     this.discountType = discountType;
    }

    public void setDiscountTotalAmount(String discountTotalAmount) {
     this.discountTotalAmount = discountTotalAmount;
    }
   }
