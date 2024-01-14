package com.jatin.creational.builder;

import lombok.Builder;

public class DatabaseTest {
    public static void main(String[] args) {
        Database database = Database
                .builder()
                .withName("user1") // method chaining
                .withUrl("host1",8080)
                .mysql()
                .build(); // immutability

        System.out.println(
                database.getName() + " : " +
                database.getHost() + " : " +
                database.getPort() + " : " +
                database.getType()
        );
    }
}
