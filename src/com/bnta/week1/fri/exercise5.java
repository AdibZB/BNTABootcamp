package com.bnta.week1.fri;

/*  TASK
    Write a program that takes arguments from the program args and loops through args and prints each item in args
    Compile using: javac and run using: java
    i.e. javac Exercise5.java | java Exercise5 foo bar baz
*/

public class exercise5
{
    public static void main(String[] args)
    {
        for (int i = 0; i < args.length; i++)
        {
            System.out.println(args[i]);
        }
    }
}