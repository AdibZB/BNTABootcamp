package com.bnta.week2.wednesday.methods;
import static com.bnta.week2.wednesday.methods.exercise6.countArrayItems;

/*  TASK
    Write a method which takes a sentence as an argument,
    counts the number of words in the array
    and prints "The sentence contains X words".
    HINT: Remember what you've done already, you might be able to reuse one of your methods here...
*/

public class exercise7
{
    public static void main(String[] args)
    {
        System.out.println(numberOfWords("hi, my name is "));
    }

    public static boolean numberOfWords(String sentence)
    {
        String[] words = sentence.split(" ");
        int wordCount = countArrayItems(words);
        System.out.println("The sentence contains " + wordCount + " words");
        return true;
    }
}