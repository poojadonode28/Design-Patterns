package com.jatin.singleton;

public class LazySingletonThreadSafeModified {
    public static void main(String[] args) {
        LazySingletonThreadSafeModified lazySingletonThreadSafeModified = LazySingletonThreadSafeModified.getInstance();
        lazySingletonThreadSafeModified.showMessage();
    }
    private static LazySingletonThreadSafeModified instance;
    private LazySingletonThreadSafeModified(){

    }
    //double check locking
    public static LazySingletonThreadSafeModified getInstance(){
        if(instance==null){
            synchronized (LazySingletonThreadSafeModified.class){
                if (instance == null) {
                    instance = new LazySingletonThreadSafeModified();
                }
            }
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("Lazy Singleton Thread Safe Modified");
    }
}
/*
When instance is null, multiple threads might concurrently enter the first if (instance == null) check.
The first thread that acquires the lock will create the Singleton instance.
However, other threads that were waiting for the lock will enter the synchronized block when it's their turn.
Without the second if (instance == null) check inside the synchronized block,
each of these waiting threads would create a new instance of the Singleton once the lock is released,
leading to multiple instances being created.
 */