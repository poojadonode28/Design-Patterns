package com.jatin.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

// Step 3 - Add a common implementation for publisher
public abstract class PublisherImpl implements Publisher{ // ListBasedPublisher

    private List<Subscriber> subscribers = new ArrayList<>();
    @Override
    public void notifyChange() {
        /*
        for(Subscriber subscriber:subscribers){
            subscriber.takeAction();
        }
        */
        subscribers.forEach(Subscriber::takeAction); //method reference
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
}
