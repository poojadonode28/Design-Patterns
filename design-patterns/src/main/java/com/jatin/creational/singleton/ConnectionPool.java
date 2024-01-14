package com.jatin.creational.singleton;

public class ConnectionPool {
    // Step 3 - Declare a static variable within the class to hold the single instance of the class.
    private static ConnectionPool INSTANCE=null;

    // Step 1 - Hide the constructor
    private ConnectionPool(){} //preventing other classes from directly creating instances of the Singleton class.

    // Step 2 - Global access point
    public static ConnectionPool getInstance(){
        // Create if not present
        if(INSTANCE==null) { // Double check locking
            synchronized (ConnectionPool.class) { // Thread safe
                if(INSTANCE==null){
                    INSTANCE=new ConnectionPool();
                }
            }
        }
        return INSTANCE;
    }
}


