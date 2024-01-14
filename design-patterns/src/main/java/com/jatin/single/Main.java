package com.jatin.single;

public class Main {
    public static void main(String[] args) {
        EargerSingleton eargerSingleton = EargerSingleton.getInstance();
        EargerSingleton eargerSingleton1 = EargerSingleton.getInstance();
        System.out.println(eargerSingleton.hashCode());
        System.out.println(eargerSingleton1.hashCode());
    }
}
