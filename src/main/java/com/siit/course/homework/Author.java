package com.siit.course.homework;

public class Author {
    String name;
    String email;

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Author() {
    }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
}
