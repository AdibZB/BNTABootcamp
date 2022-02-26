package com.bnta.week1.javafundamentals.friday;

/*  TASK
    Write a program that reverses an array of Strings
    String[] content = {"you", "are", "how", "hello"}
    Tip. Use for loop and you to start at highest index.
    Output should be: hello how are you?. Note question mark at the end
*/

public class exercise3
{
    public static void main(String[] args)
    {
        //
        String[] greeting = {"you", "are", "how", "Hello,"};

        for (int i = 0; i < greeting.length; i++)
        {
            System.out.println(i + " index -> " + greeting[i]);
        }

        //placeholder variable
        String result = " ";
        //content.length -1 = hello, java index convention starts from 0, so its length 4 - 1 meaning it starts from hello
        for (int i = greeting.length - 1; i >= 0; i--)
        {
            System.out.println(i + " index -> " + greeting[i]);
            result += greeting[i] + " ";
        }
        //substring = part of a string
        //result.substring(0, result.length() -1, gets rid of the space after you and replaces it with the "?"
        System.out.println(result.substring(0, result.length() - 1) + "?");
    }
}