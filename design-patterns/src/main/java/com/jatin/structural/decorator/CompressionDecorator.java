package com.jatin.structural.decorator;

public class CompressionDecorator extends BaseDecorator{
    private Database nextLayer;
    public CompressionDecorator(Database database) {
        super(database);
        this.nextLayer=database;
    }

    @Override
    public String read() {
        String original = nextLayer.read();
        return decompress(original);
    }

    private String decompress(String original){
        return original + " - Decompressed";
    }

    @Override
    public void write(String input) {
        String compressed = compress(input);
        database.write(compressed);
    }

    private String compress(String input){
        return input + " - Compressed";
    }
}
