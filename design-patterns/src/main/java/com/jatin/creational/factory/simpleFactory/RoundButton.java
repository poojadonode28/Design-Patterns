package com.jatin.creational.factory.simpleFactory;

public class RoundButton implements Button{
    @Override
    public void onClick() {
        System.out.println("RoundButton is clicked");
    }
}
