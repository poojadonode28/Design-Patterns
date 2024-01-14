package com.jatin.structural.adapter.external;
// difference contract
public class PayUApi {
    public void order(int amount){
        System.out.println("PayU payment: " + amount);
    }
    public PayUStatus getStatus(){
        return PayUStatus.SUCCESS;
    }
}
