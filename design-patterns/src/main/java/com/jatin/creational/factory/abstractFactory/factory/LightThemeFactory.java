package com.jatin.creational.factory.abstractFactory.factory;

import com.jatin.creational.factory.abstractFactory.product.Button;
import com.jatin.creational.factory.abstractFactory.product.CheckBox;
import com.jatin.creational.factory.abstractFactory.product.LightButton;
import com.jatin.creational.factory.abstractFactory.product.LightCheckBox;

public class LightThemeFactory implements ThemeFactory{

    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LightCheckBox();
    }
}
