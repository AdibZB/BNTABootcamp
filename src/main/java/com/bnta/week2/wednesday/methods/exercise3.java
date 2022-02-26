package com.bnta.week2.wednesday.methods;

/*  TASK
    Write a method which takes two numbers as arguments, checks if they are the same
    returns the appropriate boolean value.
    You should check both possible outcomes here,
    i.e. that it returns true when it is supposed to and false when it is supposed to.
*/

public class exercise3
{
    public static void main(String[] args)
    {
        same(3,3);
    }

    public static void same(int number, int number2)
    {
        int num1 = number;
        int num2 = number2;
        boolean equal = num1 == num2;
        System.out.println(equal);
    }
}
