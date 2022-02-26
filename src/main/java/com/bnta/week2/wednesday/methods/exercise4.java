package com.bnta.week2.wednesday.methods;

/*  TASK
    Write a method which takes two numbers as arguments and prints one of:

    "The first number is larger"
    "The second number is larger"
    "The numbers are equal"
    as appropriate.
*/

public class exercise4
{
    public static void main(String[] args)
    {
        compare(3, 5);
    }

    public static void compare(int number, int number2)
    {
        int num1 = number;
        int num2 = number2;
        if (num1 > num2)
        {
            System.out.println("The first number is larger");
        }
        if (num1 < num2)
        {
            System.out.println("The second number is larger");
        }
        if (num1 == num2)
        {
            System.out.println("These numbers are equal");
        }
    }
}