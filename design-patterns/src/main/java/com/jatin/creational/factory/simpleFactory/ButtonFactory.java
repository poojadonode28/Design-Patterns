package com.jatin.creational.factory.simpleFactory;

// Step 3 - Create Factory class/could be third party
public class ButtonFactory {
    static Button createButton(ButtonType type){ //srp + ocp violation
        switch (type){
            case PRIMARY:
                return new PrimaryButton();
            case ROUND:
                return new RoundButton();
            case LINK:
                return new LinkButton();
        }
        throw new RuntimeException("Invalid type" + type);
    }
}
