package com.jatin.structural.adapter.payment;

// Step 2 - Create the adapter interface
public interface PaymentProvider {
    // Make payment
    void makePayment(String name, String email, int amount);
    // Check status
    PaymentStatus verifyStatus(Long id);
}
