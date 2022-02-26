package com.bnta.week2.monday.conditionals;

/*  TASK
    create a String variable and assign it a value
    create an `if` statement which grabs the first letter of your word and compares it against a Character value
    print something to the console if the condition is met
*/

public class exercise7
{
    public static void main(String[] args)
    {
        String animal = "cat";

        if(Character.toUpperCase(animal.charAt(0)) == 'C')
        {
            System.out.println("The first letter is 'C'.");
        }
    }
}