package com.jatin.creational.factory.simpleFactory;

public class LinkButton implements Button{
    @Override
    public void onClick() {
        System.out.println("LinkButton is clicked");
    }
}
