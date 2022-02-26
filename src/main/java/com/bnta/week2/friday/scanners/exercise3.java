package com.bnta.week2.friday.scanners;
import java.io.File;
import java.util.Scanner;

/*  TEST
    create a File object from a text file
    create a Scanner object from out File object
    create a loop which checks whether there is still some unused input
    create a local variable which is assigned to the next line of the input
    print the line to the console
*/

public class exercise3
{
    public static void main(String[] args)
    {
        File file = new File("/Users/adibbaig/input.txt");
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext())
        {
            String input = scanner.nextLine();
            System.out.println(input);
        }
    }
}