package com.jatin.behavioural.observer;

// Step 4 - Implement concrete subject
public class BitcoinTracker extends PublisherImpl{
    private Double price;

    void setPrice(Double price){
        this.price=price;
        notifyChange();
    }
}
