package com.jatin.behavioural.strategy;

public class Main {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new WalkingStrategy()); //dependency injection
        navigator.navigate("Pune","Hyderabad");
    }
}
