package com.jatin.creational.singleton;

public class ConnectionPoolTest {
    public static void main(String[] args) {
        ConnectionPool pool1=ConnectionPool.getInstance();
        System.out.println(pool1.hashCode());
        ConnectionPool pool2=ConnectionPool.getInstance();
        System.out.println(pool2.hashCode());
    }
}
/*
If your code has access to the Singleton class, then it’s able to call the Singleton’s static method. So whenever that
method is called, the same object is always returned.
 */