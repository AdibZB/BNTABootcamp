package com.bnta.week2.mon;
import java.util.Scanner;

/*  TASK
    Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
    You might compile and run the program via command line or by editing configuration and pass program arguments
*/
// args should contain numbers

public class exercise3
{
    // used for only numbers for 1-10

    /* public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a value from 1-10");
        int number = scanner.nextInt();
        System.out.println("------------");
        System.out.println(evenOdd(number));
    }

    public static String evenOdd(int number)
    {
        switch (number)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                return "odd";

            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                return "even";

            default:
                return number + " -> Not valid number in range";
        }
    }*/

    // used for all numbers
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();
        oddOrEven(input);
    }

    static void oddOrEven(int number)
    {
        boolean odd = true;
        for(int i=0; i<number; i++)
        {
            if(number%2 ==0)
            {  //if remainder of the number&2 is 0 then the number is not odd
                odd = false;
                break;
            }
        }
        if(odd)
        {
            System.out.println(number + " is odd");
        }
        else
        {
            System.out.println(number + " is even");
        }
    }
}