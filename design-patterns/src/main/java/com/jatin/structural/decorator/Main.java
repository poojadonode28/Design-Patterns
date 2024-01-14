package com.jatin.structural.decorator;

public class Main {
    public static void main(String[] args) {
        Database fileDatabase = new FileDatabase();
        fileDatabase.write("Base");

        String result = fileDatabase.read();
        System.out.println("Returned: " + result);

        //
        Database encryptionDatabase = new EncryptionDecorator(fileDatabase);
        encryptionDatabase.write("Base");

        System.out.println(encryptionDatabase.read());

        //
        Database compressionDatabase = new CompressionDecorator(fileDatabase);
        Database encryptedDatabase = new EncryptionDecorator(compressionDatabase);
        System.out.println(encryptedDatabase.read());


    }
}
