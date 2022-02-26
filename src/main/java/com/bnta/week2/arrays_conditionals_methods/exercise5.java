package com.bnta.week2.arrays_conditionals_methods;
import java.util.Random;
import java.util.Scanner;

/* TASK
    Write a method that displays random joke to the user.
    Your program should stop displaying jokes when use inputs no.
    e.g
    Want to hear a joke? Yes/No
        if yes then display joke and repeat same question
        if no then program should exit
*/

public class exercise5
{
    public static void main(String[] args)
    {
        boolean keepAsking = true;

        while (keepAsking) {     // allows us to keep asking the question as long as user keeps inputting yes
            Scanner scanner = new Scanner(System.in);
            printMenu();
            String input = scanner.nextLine();
            if (input.equals("yes"))
            {
                jokeGenerator();
            }
            else if (input.equals("no"))
            {
                keepAsking = false;    //allows us to break out of the loop and exit if the user inputs no as the boolean is now false
            }
            else
            {
                System.out.println("Input not recognised");
            }
        }
    }

    public static void printMenu()
    {
        System.out.println("Want to hear a joke?...yes or no?");
    }

    public static void jokeGenerator()
    {
        String[] jokes =
                {
                        //creates an array of jokes
                        "I invented a new word...plagiarism",
                        "foo"
                };
        Random rand = new Random();
        //generates a random number
        int randomNumber = rand.nextInt(jokes.length);
        //ensures that the random number we generate is within the bounds of the array length and thus equal to the index of the contents in the array (usually we see it as i but in this case, it is "random")
        // jokes.length is there cos its an int variable, not a string
        // nextint takes one more than the arg past, - use .length for cleaner and better code
        System.out.println(jokes[randomNumber]); //prints the joke at index random number
    }
}