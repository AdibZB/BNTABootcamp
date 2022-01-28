package com.bnta.week2.mon;
import java.util.Arrays;

/*  TASK
    Write a method that reverses any String and print to console
    Input should be a string
    Output should be reversed input
*/

public class exercise1
{
    public static void main(String[] args)
    {
        //input for system to reverse
        System.out.println(reverse("Adib"));
    }
        //common convention to use static in front of string - do not know reason why ... yet
        static String reverse(String input)
        {
            //"" is a placeholder, telling the code to not print my name the correct way
            String output = "";
                /*
                input.length -1 means that the string starts from the other side
                greater to or equal to 0 means the operation would stop at A
                -- means that it is decrementing so going backwards through the letters
                */
            for (int i = input.length() - 1; i >= 0; i--)
            {
                /*
                The addition assignment operator ( += ) adds the value of the right operand to a variable
                and assigns the result to the variable.
                */
                output += input.charAt(i);
            }
            return output;
        }
}