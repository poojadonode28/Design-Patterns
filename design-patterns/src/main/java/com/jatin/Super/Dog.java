package com.jatin.Super;

public class Dog extends Animal{
    String colour = "black";
    void displayColour(){
        System.out.println(this.colour);
        System.out.println(super.colour);
    }
}
