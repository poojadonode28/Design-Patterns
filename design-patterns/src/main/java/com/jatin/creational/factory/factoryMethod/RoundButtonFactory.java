package com.jatin.creational.factory.factoryMethod;

public class RoundButtonFactory implements ButtonFactory{
    @Override
    public Button createButton() {
        return new RoundButton();
    }
}
