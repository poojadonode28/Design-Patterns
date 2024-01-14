package com.jatin.structural.decorator;

public class FileDatabase implements Database{
    @Override
    public String read() {
        return "Base";
    }

    @Override
    public void write(String input) {
        System.out.println("Base: " + input);
    }
}
