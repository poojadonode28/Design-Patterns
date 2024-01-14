package com.jatin.Clonable;

public class Animal implements Cloneable{
    String name;
    Animal(String name){
        this.name=name;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
