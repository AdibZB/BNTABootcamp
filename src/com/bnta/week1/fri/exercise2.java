package com.bnta.week1.fri;

/*  TASK
    Write a program that compares two String contents.
    Create 3 variables.
    2 to store both strings and 1 to store the result
    Print the result
*/

public class exercise2
{
    public static void main(String[] args)
    {
        //2 strings variables
        String firstname = "Adib";
        String surname = "Baig";
        //prints out the strings
        System.out.println(firstname + " " + surname);
        //result variable
        //result boolean compares the first name and last name, true = yes it is the same, false = it is not the same
        boolean result = firstname.equals(surname);
        System.out.println(result);
    }
}