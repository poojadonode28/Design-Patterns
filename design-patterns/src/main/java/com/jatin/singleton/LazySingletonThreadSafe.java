package com.jatin.singleton;

public class LazySingletonThreadSafe {
    private static LazySingletonThreadSafe instance;

    private LazySingletonThreadSafe() {
    }

    public static synchronized LazySingletonThreadSafe getInstance() {
        if (instance == null) {
            instance = new LazySingletonThreadSafe();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Lazy Singleton Thread Safe");
    }

    public static void main(String[] args) {
        LazySingletonThreadSafe lazySingletonThreadSafe = LazySingletonThreadSafe.getInstance();
        lazySingletonThreadSafe.showMessage();
    }
}
