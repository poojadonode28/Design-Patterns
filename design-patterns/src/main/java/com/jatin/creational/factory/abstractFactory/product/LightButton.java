package com.jatin.creational.factory.abstractFactory.product;

public class LightButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Light Button was clicked");
    }
}
