package com.bnta.week2.thursday.loops;
import java.util.Arrays;

/*  TASK
    create an array. Remember to manually set the size
    create a for loop which goes from 0 to 10, adding each value to an array
    print our array
*/

public class exercise4
{
    public static void main(String[] args)
    {
        int[] arrayNumbers = new int[11];
        for (int i = 0; i <= 10; i++)
        {
            arrayNumbers[i] = i;
        }
        String output = (Arrays.toString(arrayNumbers));
        System.out.println(output);
    }
}