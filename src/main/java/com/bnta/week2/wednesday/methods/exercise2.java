package com.bnta.week2.wednesday.methods;

/*  TASK
    Write a method which takes a number as an argument and returns that number negated,
    e.g. passing 5 as an argument should return -5; passing -10 should return 10.
*/

public class exercise2
{
    public static void main(String[] args)
    {
        negated(5);
    }

    public static void negated(int number)
    {
        int num1 = number;
        num1 = -num1;
        System.out.println(num1);
    }
}
