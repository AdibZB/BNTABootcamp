package com.bnta.week2.tuesday.arrays;
import java.util.Arrays;

/*  TASK
    adding onto your example from Q8,
    now create a second `for` loop which reassigns each value in the array to be double the initial value
    again print the array
*/

public class exercise9 {
    public static void main(String[] args)
    {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++)
        {
            numbers[i] = i+1;
        }
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = numbers[i]*2;
        }
        System.out.println(Arrays.toString(numbers));
    }
}