package com.jatin.structural.adapter.payment;

import com.jatin.structural.adapter.external.RazorPayApi;

// Step 3 - Implement concrete adapter sub classes
public class RazorPayPaymentProvider implements PaymentProvider{
    private RazorPayApi api = new RazorPayApi();

    // Step 4 - Adapt/Transform common contract to provider specific contract
    @Override
    public void makePayment(String name, String email, int amount) {
        api.pay(name, amount); // only use what you need
    }

    @Override
    public PaymentStatus verifyStatus(Long id) {
        int status = api.checkStatus();
        return toPaymentStatus(status);
    }

    private PaymentStatus toPaymentStatus(int status) {
        if(status==0){
            return PaymentStatus.ERROR;
        }
        else{
            return PaymentStatus.OK;
        }
    }
}
