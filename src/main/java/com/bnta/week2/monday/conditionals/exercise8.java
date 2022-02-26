package com.bnta.week2.monday.conditionals;

/*  TASK
    create a String variable and assign it a value
    create a `for` loop which wraps around your answer from Question 7
    modify your `if` statement to check the character at each index
    Hint: use your internal, incrementing value of your `for` loop within the `.charAt()` method
    print something to the console if the condition is met
*/

public class exercise8
{
    public static void main(String[] args)
    {
        String animal = "cat";
        Character charCheck = 'C';

        for (int i = 0; i < animal.length(); i++)
        {
            if(Character.toUpperCase(animal.charAt(i)) == charCheck)
            {
                System.out.println("The letter was in index: " + i);
                break;
            }
        }
    }
}
