package com.bnta.week2.friday.scanners;
import java.util.Scanner;

/*  TASK
    create a Scanner object - remember to import `java.util.Scanner` at the top of your file!
    create a variable which is assigned to the value passed into the scanner from the terminal
    print this variable
*/

public class exercise1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.toUpperCase();

        System.out.println(input);
    }
}