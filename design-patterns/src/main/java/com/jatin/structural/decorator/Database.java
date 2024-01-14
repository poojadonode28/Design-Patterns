package com.jatin.structural.decorator;

// Step 1 - Create product interface

public interface Database {
    String read();

    void write(String input);
}
