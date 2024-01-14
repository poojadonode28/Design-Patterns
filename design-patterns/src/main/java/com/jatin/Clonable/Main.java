package com.jatin.Clonable;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Animal animal1 = new Animal("Dog");
        Animal animal2 = (Animal) animal1.clone();
        System.out.println(animal2.name);
        System.out.println(animal1.hashCode());
        System.out.println(animal2.hashCode());
    }
}
