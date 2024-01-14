package com.jatin.structural.adapter.payment;

import com.jatin.structural.adapter.external.PayUApi;
import com.jatin.structural.adapter.external.PayUStatus;
import com.jatin.structural.adapter.external.RazorPayApi;

public class Main {
    private static PaymentProvider paymentProvider = new RazorPayPaymentProvider();

    public static void main(String[] args) {
        paymentProvider.makePayment("Jatin","j3lanje@gmail.com",1000);
        paymentProvider.verifyStatus(1l);
    }
    public static void original(String[] args) {
        String type="razorpay";
        if(type.equals("razorpay")){
            RazorPayApi api = new RazorPayApi();
            api.pay("Jatin",1000);
            int status=api.checkStatus();
        }
        else{ // different request response format
            PayUApi api= new PayUApi();
            api.order(1000);
            PayUStatus status = api.getStatus();
        }
    }
}
