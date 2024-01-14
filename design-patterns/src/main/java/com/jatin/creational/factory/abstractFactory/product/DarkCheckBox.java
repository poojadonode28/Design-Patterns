package com.jatin.creational.factory.abstractFactory.product;

public class DarkCheckBox implements CheckBox{
    @Override
    public void onSelect() {
        System.out.println("Dark CheckBox was selected");
    }
}
