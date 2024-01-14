package com.jatin.behavioural.observer;

public class Main {
    public static void main(String[] args) {
        BitcoinTracker tracker = new BitcoinTracker();
        tracker.addSubscriber(new EmailSender());
        tracker.addSubscriber(new Tweeter());
        tracker.setPrice(100.0);
    }
}
