package com.jatin.singleton;

public class EagerSingleton {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.showMessage();
    }
    private static final EagerSingleton instance = new EagerSingleton();
    public EagerSingleton(){

    }
    public static EagerSingleton getInstance(){
        return instance;
    }
    public void showMessage(){
        System.out.println("Eager Singleton");
    }
}
