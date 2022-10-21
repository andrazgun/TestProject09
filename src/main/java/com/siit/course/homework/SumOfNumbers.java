package com.siit.course.homework;

public class SumOfNumbers {
    /* Calculate the sum of the first 100 numbers higher than 0.
    Name the class (and java file) SumOfNumbers. */
    public static void main(String[] args) {


        int sum = 0;
        int MAX_NUMBER = 100;
        for (int i = 1; i <= MAX_NUMBER; i++) {
            sum = sum + i;
        }
        System.out.println("The sum of the first " + MAX_NUMBER + " numbers is:");
        System.out.println(sum);
    }
}
