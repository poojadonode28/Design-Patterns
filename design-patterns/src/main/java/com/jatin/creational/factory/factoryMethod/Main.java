package com.jatin.creational.factory.factoryMethod;

public class Main {
    private static ButtonFactory buttonFactory = new PrimaryButtonFactory();
    public static void main(String[] args) {
        Button primary = buttonFactory.createButton();
        primary.onClick();
    }
}
