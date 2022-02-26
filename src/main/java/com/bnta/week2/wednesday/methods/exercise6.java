package com.bnta.week2.wednesday.methods;
import java.util.Arrays;

/*  TASK
    Write a method which takes an array of strings as an argument and returns the number of items in the array.
*/

public class exercise6
{
    public static void main(String[] args)
    {
        String[] words = {"hello", "hi"};
        System.out.println(countArrayItems(words));
    }

    public static int countArrayItems(String[] string)
    {
        return string.length;
    }
}