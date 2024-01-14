package com.jatin.behavioural.observer;

// Step 5 - Create concrete observer
public class EmailSender implements Subscriber{
    @Override
    public void takeAction() {
        System.out.println("Email send on price changed");
    }
}
