package com.jatin.creational.factory.abstractFactory.factory;

import com.jatin.creational.factory.abstractFactory.product.Button;
import com.jatin.creational.factory.abstractFactory.product.CheckBox;

// Step 3 - Create the factory interface
public interface ThemeFactory { //factory is creating multiple products (abstract interface)
    Button createButton();
    CheckBox createCheckBox();
}
