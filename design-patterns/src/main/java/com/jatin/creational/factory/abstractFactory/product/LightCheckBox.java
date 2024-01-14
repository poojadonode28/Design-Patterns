package com.jatin.creational.factory.abstractFactory.product;

public class LightCheckBox implements CheckBox{
    @Override
    public void onSelect() {
        System.out.println("Light CheckBox was selected");
    }
}
