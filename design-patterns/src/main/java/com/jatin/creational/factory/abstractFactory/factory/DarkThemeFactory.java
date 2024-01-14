package com.jatin.creational.factory.abstractFactory.factory;

import com.jatin.creational.factory.abstractFactory.product.Button;
import com.jatin.creational.factory.abstractFactory.product.CheckBox;
import com.jatin.creational.factory.abstractFactory.product.DarkButton;
import com.jatin.creational.factory.abstractFactory.product.DarkCheckBox;

public class DarkThemeFactory implements ThemeFactory{
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new DarkCheckBox();
    }
}
