package com.bnta.week2.wednesday.methods;

/*  TASK
    Write a method which takes a string as an argument, capitalises the first letter and returns the capitalised string.
    HINT: The .toUpperCase() method will capitalise the whole string.
    Investigate how to split the first letter from the string, capitalise that, then join the pieces back together
*/

import java.util.Locale;

public class exercise5
{
    public static void main(String[] args)
    {
        System.out.println(capitalisedFirstLetter("hello, how are you?"));
    }

    public static String capitalisedFirstLetter (String input)
    {
       String output = input.substring(0,1).toUpperCase() + input.substring(1);
        return output;
    }
}