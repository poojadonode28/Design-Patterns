package com.jatin.creational.factory.factoryMethod;

// Step 2 - Create product Subclasses/product hierarchy
public class PrimaryButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Primary Button is clicked");
    }
}
