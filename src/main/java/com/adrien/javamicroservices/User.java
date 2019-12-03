package com.adrien.javamicroservices;

public class User {
    private final int id;
    private final String firstname;
    private final String lastname;
    private final String email;

    // Constructor
    public User(int id, String firstname, String lastname, String email) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
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
        return email;
    }
}
