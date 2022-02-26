package com.bnta.week2.thursday.loops;
import java.util.Arrays;

/*  TASK
    create a for loop which goes through each string in our array
    grab the first letter of our word
    capitalise the first letter
    add the capitalised letter to the rest of the provided word
    assign the value to an array
    print our resulting array
*/

//Start with the array: ["i", "sure", "do", "love", "bees"].
// Create a for loop which makes each word uppercase in the array. Print the contents of the array in the terminal.
//Hint: You could make use of the .charAt() method to grab a specific character (letter) at the specified index
// Hint: You could make use of the .substring() method which works on strings to grab the part of a given string forward from the specified index

public class exercise8
{
    public static void main(String[] args)
    {
        String[] words = new String[]
                {"i", "sure", "do", "love", "bees"};
        for (int i = 0; i < words.length; i++)
        {
            char firstLetter = words[i].charAt(0);
            char capitalise = Character.toUpperCase(firstLetter);
            String capWord = capitalise + words[i].substring(1);
            words[i] = capWord;
        }
        System.out.println(Arrays.toString(words));
    }
}