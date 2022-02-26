package com.bnta.week2.tuesday.arrays;
import java.util.Arrays;

/*  TASK
    using your array from Q1, fill it with the number `4`
    print the array to the console
*/

public class exercise3
{
    public static void main(String[] args)
    {
        int[] array = new int[3];
        Arrays.fill(array, 4);
        System.out.println(Arrays.toString(array));
    }
}