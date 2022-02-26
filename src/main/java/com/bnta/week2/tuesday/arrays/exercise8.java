package com.bnta.week2.tuesday.arrays;
import java.util.Arrays;

/*  TASK
    declare a new array which can hold the numbers from 1-10 (inclusive)
    create a `for` loop which initialises this array with the numbers 1-10
    print the array to the console
*/

public class exercise8
{
    public static void main(String[] args)
    {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++)
        {
            numbers[i] = i+1;
        }
        System.out.println(Arrays.toString(numbers));
    }
}