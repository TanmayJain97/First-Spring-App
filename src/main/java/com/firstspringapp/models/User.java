package com.firstspringapp.models;

public class User {
    private String firstName;
    private String lastName;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        String str = (firstName!=null)? firstName + " " :"";
        str += (lastName!=null)? lastName :"";
        return str.trim();
    }
}