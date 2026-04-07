package com.example.gradle.model;

public class User {
    private String username;
    private String password;

    public User() {}

    public User(String username, String password) {
        this.username = username;
    }

    public String getUsername() {
<<<<<<< HEAD
        return username.toUpperCase();
=======
        return username.trim();
>>>>>>> 821c394423fb1bff193f91ed378665438a6180cd
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
