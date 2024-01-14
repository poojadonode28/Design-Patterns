package com.jatin.behavioural.strategy;

// Step 2 - Create concrete Strategy
public class WalkingStrategy implements NavigationStrategy{
    @Override
    public void navigate(String from, String to) {
        System.out.println("Navigating using the walking mode");
    }
}
