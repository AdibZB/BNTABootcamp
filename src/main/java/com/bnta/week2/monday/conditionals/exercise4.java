package com.bnta.week2.monday.conditionals;

/*  TASK
    create two `int` variables. Assign them values
    create an `if` statement which compares whether one value is greater than the other
    print something to the console if the condition is met
    create an `else` statement which prints to the console if the above condition is NOT met
*/

public class exercise4
{
    public static void main(String[] args)
    {
        int first = 17;
        int second = 10;

        if(second > first)
        {
            System.out.println("The second number is larger than the first");
        }
        else
        {
            System.out.println("The first is larger than the second.");
        }
    }
}