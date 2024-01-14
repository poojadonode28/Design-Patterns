package com.jatin.creational.builder;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Database {
    private String name;
    private String host;
    private int port;
    private DatabaseType type;

    // Step 1 - Hide the constructor
    private Database(){}

    // Add a static method to get the builder object
    public static DatabaseBuilder builder() {
        return new DatabaseBuilder();
    }

    //step 2 - create an inner/friend/nested class (static)
    static class DatabaseBuilder{ // Builder class with parameterless constructor

        // Step 3 - (Cheating) use the fields from outer to the inner class
        Database database = new Database();

        // Step 4 - Expose setters for inner fields

        // Fluent interface/Chained builder
        public DatabaseBuilder withName(String name) { // Should return the Builder instance to allow method chaining.
            database.name = name;
            return this;
        }

        public DatabaseBuilder withUrl(String host, int port) {
            database.host = host;
            database.port = port;
            return this;
        }

        public DatabaseBuilder mysql() {
            database.type = DatabaseType.MYSQL;
            return this;
        }

        // Step 4 - Create a build hook to return the outer class object
        public Database build() {

            if (!isValid()){
                throw new IllegalArgumentException("Invalid database configuration");
            }

            Database newDatabase = new Database();
            newDatabase.name = database.name;
            newDatabase.host = database.host;
            newDatabase.port = database.port;
            newDatabase.type = database.type;
            return newDatabase;
        }

        // Step 5 - Add a validation method
        public Boolean isValid() {
            if (database.name == null) {
                return false;
            }
            return true;
        }
    }
}
