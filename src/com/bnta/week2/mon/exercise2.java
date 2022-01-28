package com.bnta.week2.mon;
import java.util.Locale;

/*  TASK
    Given the following String input
    String input = "   b ri   ght net   work  "
    Write a program that transforms input into: Bright Network
*/

public class exercise2
{
    public static void main(String[] args)
    {
        //calling method with string I wish to fix, very specific to "   b ri   ght net   work  " string
        //hard coded method
        //error happens when another string is used due to substring method and its length
        System.out.println(fix("   b ri   ght net   work  "));
    }
    public static String fix(String input)
    {
        //replaceall removes all the spaces inbetween bright network
        String spaces = input.replaceAll(" ", "");
        //substring a string method which targets specific characters starting from 0 targeting B
        //trim not needed with this method as substring targets specific characters
        return spaces.substring(0,1).toUpperCase() + spaces.substring(1,6) + " " + spaces.substring(6,7).toUpperCase()
                + spaces.substring(7,13);
    }
}

//to make it acceptable for any string, if loops/switch statements needed