package com.jatin.behavioural.strategy;

public class CarDrivingStrategy implements NavigationStrategy{
    @Override
    public void navigate(String from, String to) {
        System.out.println("Navigating using the car mode");
    }
}
