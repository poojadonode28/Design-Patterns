package com.jatin.single;

public class EargerSingleton {
    private static EargerSingleton instance;
    private EargerSingleton(){

    }
    public static EargerSingleton getInstance(){
        if(instance==null){
            synchronized (EargerSingleton.class){
                if(instance==null){
                    instance=new EargerSingleton();
                }
            }
        }
        return instance;
    }
}
