package com.bnta.week2.thursday.loops;
import java.util.Arrays;

/*  TASK
    using your answer from Question 4, create a for loop that goes through the values
    print each value individually
*/

public class exercise5
{
    public static void main(String[] args)
    {
        int[] arrayNumbers = new int[11];
        for (int i = 0; i <= 10; i++)
        {
            arrayNumbers[i] = i;
        }

        for (int singleNumber : arrayNumbers)
        {
            System.out.println(singleNumber);
        }
    }
}