package com.bnta.week2.monday.conditionals;

/*  TASK
    create three `int` variables. Assign them values with the first value sitting between the other two
    create an `if` statement which compares whether the first value is greater than the second AND less than the third
    print something to the console if the condition is met
    create an `else` statement which prints to the console if the above condition is NOT met
*/

public class exercise5
{
    public static void main(String[] args)
    {
        int first = 9;
        int second = 7;
        int third = 15;

        if(first > second && first < third)
        {
            System.out.println("The first number is inbetween the second and third numbers.");
        }
        else
        {
            System.out.println(first + " is not between " + second + " and " + third);
        }
    }
}