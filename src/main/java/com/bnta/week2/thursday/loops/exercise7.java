package com.bnta.week2.thursday.loops;
import java.util.Arrays;

/*  TASK
    create a for loop which goes through each string in our array
    make each word uppercase
    assign the value in the array to the uppercase string
    print our resulting array
*/

public class exercise7
{
    public static void main(String[] args)
    {
        String[] words = new String[]
                {"i", "sure", "do", "love", "bees"};
        for (int i = 0; i < words.length; i++)
        {
            words[i] = words[i].toUpperCase();
        }
        System.out.println(Arrays.toString(words));
    }
}