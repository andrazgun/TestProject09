package com.siit.course.homework.Homework04;

public class Library {

        public static void Author() {

Author author1 = new Author("Shel Silverstein",
        "sv@123.com");

Book book1 = new Book("Acolo unde nu mai e trotuar",
        2016,
        new Author("Shel Silverstein",
                "sv@123.com"),
        28);

        book1.printBook();


    }

    public static void main(String[] args) {

            Author();
    }
}
