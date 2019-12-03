package com.adrien.javamicroservices;

public class User {
    private final int id;
    private final String firstname;
    private final String lastname;
    private final String password;

    // Constructor
    public User(int id, String firstname, String lastname, String password) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.password = password;
    }

    // Getter and Setters
    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return password;
    }
}
