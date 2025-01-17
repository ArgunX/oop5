package com.example.uny.model;

public abstract class User {
    protected  int id;
    protected String name;
    protected String lastName;

    public User(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;


    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}' + "\n";
    }
}
