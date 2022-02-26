package com.bnta.week2.arrays_conditionals_methods;
import java.util.Scanner;

/*  TASK
        Create a package called email
        Then have a method called validateEmail that return
        true or false if input is valid email
        Finally invoke validateEmail in main
            i.e. "hello@gmail.com" -> true
            i.e. "hellogmail.com" -> false
*/

public class exercise6
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email address: ");
        String input = scanner.nextLine();

        validateEmail(input);
    }

    public static void validateEmail(String email )
    {
        if (email.contains("@"))
        {
            System.out.println("Thank you.");
        }
        else
        {
            System.out.println("Unknown email");
        }
    }
}