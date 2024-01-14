package com.jatin.structural.decorator;

// Step 3 - Create the base decorator

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class BaseDecorator implements Database{

    protected Database database;

    @Override
    public String read() {
        return database.read();
    }

    @Override
    public void write(String input) {
        database.write(input);
    }
}
