package com.siit.course.homework;


public class ArithmeticCalculator {
    /* Implement an arithmetic calculator that takes 3 arguments:
     the first number, the operation, the second number. */
    public static void main(String[] args) {
        if (args.length == 3) {
            float a = Float.parseFloat(args[0]);
            float b = Float.parseFloat(args[2]);
            String operator = args[1];
// implement calculator logic here
            float result;

            if (operator == "+") {
                result = a + b;
                System.out.println("Result is: " + result);
            }
            if (operator == "-") {
                result = a - b;
                System.out.println("Result is: " + result);
            }
            if (operator == "/") {
                result = a / b;
                System.out.println("Result is: " + result);
            }
            if (operator == "*") {
                result = a * b;
                System.out.println("Result is: " + result);
            }
            else {
                System.err.println("3 args are needed!");
            }
        }
    }
}