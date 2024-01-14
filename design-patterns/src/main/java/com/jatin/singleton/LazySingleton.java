package com.jatin.singleton;

public class LazySingleton {
    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.showMessage();
    }
    private static LazySingleton instance;
    private LazySingleton(){

    }
    public static LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("Lazy Singleton");
    }

}
