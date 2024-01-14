package com.jatin.structural.decorator;

public class EncryptionDecorator extends BaseDecorator{
    private Database database;

    public EncryptionDecorator(Database database) {
        super(database);
        this.database=database;
    }

    @Override
    public String read() {
        String original = database.read();
        return decrypt(original);
    }

    private String decrypt(String original){
        return original + " - Decrypted";
    }

    @Override
    public void write(String input) {
        String encrypted = encrypt(input);
        database.write(encrypted);
    }

    private String encrypt(String input){
        return input + " - Encrypted";
    }
}
