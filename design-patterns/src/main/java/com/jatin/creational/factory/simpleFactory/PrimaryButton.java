package com.jatin.creational.factory.simpleFactory;

// Step 2 - Create product subclasses
public class PrimaryButton implements Button{

    @Override
    public void onClick() {
        System.out.println("PrimaryButton is clicked");
    }
}
