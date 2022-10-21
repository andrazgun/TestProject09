package com.siit.course.homework;

public class Library {

        public static void Author() {

Author author1 = new Author("Shel Silverstein",
        "sv@123.com");

Book book1 = new Book("Acolo unde nu mai e trotuar",
        2016,
        new Author("Shel Silverstein",
                "sv@123.com"),
        28);


            System.out.println("Book " + book1.name + ", " + book1.price + ", by " + author1.name +
                    ", published in " + book1.year + ".");



    }

}
