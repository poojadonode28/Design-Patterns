package com.jatin.structural.adapter.payment;

import com.jatin.structural.adapter.external.PayUApi;
import com.jatin.structural.adapter.external.PayUStatus;

public class PayUPaymentProvider implements PaymentProvider{

    private PayUApi api=new PayUApi();

    @Override
    public void makePayment(String name, String email, int amount) {
        api.order(amount);
    }

    @Override
    public PaymentStatus verifyStatus(Long id) {
        return toPaymentStatus(api.getStatus());
    }

    // mapper method
    private PaymentStatus toPaymentStatus(PayUStatus status) {
        switch (status){
            case SUCCESS:
                return PaymentStatus.OK;
            case FAILURE:
                return PaymentStatus.ERROR;
        }
        throw new RuntimeException("invalid payment type "+status);
    }
}
