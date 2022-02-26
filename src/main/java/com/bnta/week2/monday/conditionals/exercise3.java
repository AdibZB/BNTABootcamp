package com.bnta.week2.monday.conditionals;

/*  TASK
    create a string variable using the `new` keyword
    create a second string variable which has the same value as the first, again using the `new` keyword
    create an `if` statement which compares the two variables and prints to the console if they are equal
*/

public class exercise3
{
    public static void main(String[] args)
    {
        String first = new String("hi");
        String second = new String("hi");

        if(first.equals(second));
        System.out.println("The two strings are the same.");
    }
}