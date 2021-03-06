package com.adyen.model.hpp;

import com.adyen.Util.Util;

public class DirectoryLookupRequest {
    private String currencyCode;
    private String paymentAmount;
    private String sessionValidity;
    private String merchantReference;
    private String countryCode;

    public DirectoryLookupRequest() {
        sessionValidity = Util.calculateSessionValidity();
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public DirectoryLookupRequest setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    public String getPaymentAmount() {
        return paymentAmount;
    }

    public DirectoryLookupRequest setPaymentAmount(String paymentAmount) {
        this.paymentAmount = paymentAmount;
        return this;
    }

    public String getSessionValidity() {
        return sessionValidity;
    }

    public DirectoryLookupRequest setSessionValidity(String sessionValidity) {
        this.sessionValidity = sessionValidity;
        return this;
    }

    public String getMerchantReference() {
        return merchantReference;
    }

    public DirectoryLookupRequest setMerchantReference(String merchantReference) {
        this.merchantReference = merchantReference;
        return this;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public DirectoryLookupRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
}
