package com.jatin.singleton;

import com.jatin.single.EargerSingleton;

public class Main {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EargerSingleton eagerSingleton1 = EargerSingleton.getInstance();
        System.out.println(eagerSingleton.hashCode());
        System.out.println(eagerSingleton1.hashCode());
    }
}
