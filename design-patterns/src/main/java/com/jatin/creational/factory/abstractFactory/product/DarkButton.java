package com.jatin.creational.factory.abstractFactory.product;

// Step 2 - Create a product concrete class
public class DarkButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Dark Button was clicked");
    }
}
