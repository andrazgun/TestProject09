package com.siit.course;

import java.util.Scanner;

public class LeapYear {
    /* Display the number of days in month February from a year between 1900-2016 that is read from keyboard
            HINT
    A year is a leap year if:
            -Is divisible by 4 but not by 100
            -Is divisible by 100 but not by 400 */

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
                System.out.println("Enter year between 1900 and 2016:");

        int year = input.nextInt();

        // Using else-if statement
        // Leap year
        /* if (year % 400 == 0) {
            System.out.println("In the year" + year + " the number of days in February was 29.");
        }
        // Not a leap year
        else if (year % 100 == 0) {
            System.out.println("In the year" + year + " the number of days in February was 28.");
        }
        // Leap year
        else if (year % 4 == 0) {
            System.out.println("In the year" + year + " the number of days in February was 29.");
        }
        // Not a leap year
        else {
            System.out.println("Number of days in February is 28");
        } */
        // Using logical operators
        // Leap year
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            System.out.println("In the year" + year + " the number of days in February was 29.");
        }
        // Not a leap year
        else {
            System.out.println("In the year" + year + " the number of days in February was 28.");
        }

    }
}
