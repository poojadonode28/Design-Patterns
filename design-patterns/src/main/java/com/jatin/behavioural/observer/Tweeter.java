package com.jatin.behavioural.observer;

public class Tweeter implements Subscriber{
    @Override
    public void takeAction() {
        System.out.println("Sending tweet");
    }
}
