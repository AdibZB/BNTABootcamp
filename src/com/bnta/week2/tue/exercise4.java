package com.bnta.week2.tue;
import java.util.Scanner;

/* TASK
    Write a program that takes an input number from the console and prints if number is prime
    Create a method to check if number is prime then use against the input
*/

public class exercise4
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int prime;
        boolean isPrime = true;
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();

        for (int i = 2; i <=num/2; i++)
        {
            prime = num%1;
            if(prime == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }
}