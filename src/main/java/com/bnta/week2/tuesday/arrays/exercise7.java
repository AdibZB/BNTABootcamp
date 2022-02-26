package com.bnta.week2.tuesday.arrays;
import java.util.Arrays;

/*  TASK
    using your array from Q5, create a `for` loop which prints each item in the array
*/

public class exercise7
{
    public static void main(String[] args)
    {
        String[] array = new String[]{"a", "b", "c", "d"};
        System.out.println(Arrays.toString(array));

        for (String letters : array)
        {
            System.out.println(letters);
        }
    }
}