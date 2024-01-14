package com.jatin.creational.factory.factoryMethod;

public class LinkButtonFactory implements ButtonFactory{
    @Override
    public Button createButton() {
        return new LinkButton();
    }
}
