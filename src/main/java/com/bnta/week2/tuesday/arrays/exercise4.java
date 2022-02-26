package com.bnta.week2.tuesday.arrays;
import java.util.Arrays;

/*  TASK
    adding onto your code from questions 1-3, reassign the second value in the array to the number `17`
    print the array to the console
*/

public class exercise4
{
    public static void main(String[] args)
    {
        int[] array = new int[3];
        Arrays.fill(array, 4);
        System.out.println(Arrays.toString(array));

        array[1] = 17;
        System.out.println(Arrays.toString(array));
    }
}