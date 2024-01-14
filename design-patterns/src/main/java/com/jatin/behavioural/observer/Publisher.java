package com.jatin.behavioural.observer;

// Step 1 - Create the subject interface - object of interface - btc price
public interface Publisher {
    void notifyChange();
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
}
