package com.siit.course.homework.Homework03;

public class PrimeNumbers {
    /* Display all the prime numbers lower than 1 000 000.
    Name the class (and java file) PrimeNumbers. */
    public static void main(String[] args) {
        int i = 0;
        int MAX_NUMBER = 1000;
        int num = 0;
        int countPrime = 0;
        //Empty String
        String primeNumbers = "";

        for (i =3; i <= MAX_NUMBER; i++)
        {
            int counter = 0;
            for(num = i; num >= 1; num--)
            {
                if(i % num == 0)
                {
                    counter = counter + 1;
                }
            }
            if (counter == 2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
                // Sum the total prime numbers
                countPrime++;
            }
        }
        System.out.println("The prime numbers lower than " + MAX_NUMBER + " are:");
        System.out.println(primeNumbers);
        System.out.println("The sum of total prime numbers lower than " + MAX_NUMBER + " is:");
        System.out.println(countPrime);





    }
}
