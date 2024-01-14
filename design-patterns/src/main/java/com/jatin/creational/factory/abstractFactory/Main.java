package com.jatin.creational.factory.abstractFactory;

import com.jatin.creational.factory.abstractFactory.factory.DarkThemeFactory;
import com.jatin.creational.factory.abstractFactory.factory.ThemeFactory;
import com.jatin.creational.factory.abstractFactory.product.CheckBox;
import com.jatin.creational.factory.abstractFactory.product.Button;

public class Main {
    private static ThemeFactory factory = new DarkThemeFactory(); //only have to change this
    public static void main(String[] args) {
        /*
        String theme ="Dark";
        Button button = new DarkButton();
        CheckBox checkBox = new DarkCheckBox(); //tight coupling
         */

        Button button = factory.createButton(); //now we don't have to use subclass
        button.onClick();

        CheckBox checkBox = factory.createCheckBox();
        checkBox.onSelect();
    }
}
