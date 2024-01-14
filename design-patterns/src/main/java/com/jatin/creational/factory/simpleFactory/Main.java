package com.jatin.creational.factory.simpleFactory;

public class Main {
    public static void main(String[] args) {
        //Button primaryButton = new PrimaryButton();
        Button primaryButton = ButtonFactory.createButton(ButtonType.PRIMARY); //decoupled object creation
        primaryButton.onClick();
    }
}
