package com.bnta.week2.thursday.loops;
import java.util.Arrays;

/*  TASK
    create a sum variable
    using your answer from Question 4, create a for loop that goes through the values
    add each item to the sum value
    print the total sum
*/

public class exercise6
{
    public static void main(String[] args)
    {
        int[] arrayNumbers = new int[11];
        for (int i = 0; i <= 10; i++)
        {
            arrayNumbers[i] = i;
        }

        int sum = 0;

        for (int number : arrayNumbers)
        {
            sum += number;
        }
        System.out.println(sum);
    }
}