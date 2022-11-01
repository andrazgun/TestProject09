package com.siit.course.homework.Homework04;

public class Book {
    String name;
    int year;
    Author author;
    double price;

    public Book(String name, int year, Author author, double price) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.price = price;
    }

    public Book() {
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public int getYear() {
        return this.year;
    }

    public void printBook() {

        System.out.println("Book " + name + ", " + price + ", by " + author.name
                + ", published in " + year + ".");
    }
}
