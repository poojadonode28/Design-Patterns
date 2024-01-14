package com.jatin.behavioural.strategy;

import lombok.AllArgsConstructor;


// Step 3 - Modify the concrete class
@AllArgsConstructor
public class Navigator {
    // Add a local variable for the strategy
    private NavigationStrategy navigationStrategy;

    // Delegate the call to strategy
    public void navigate(String from, String to){
        navigationStrategy.navigate(from, to);
    }
}
