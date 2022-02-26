package com.bnta.week3.monday.enums_dates;

/*  TASK
    write a method that calculate age on any given date
    hint: subtract today's date[year] - date[year]
*/

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class exercise5
{
    public static void main(String[] args)
    {
        System.out.println("Enter your date of birth in YYYY-MM-DD format please: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();
        LocalDate dob = LocalDate.parse(input);
        System.out.println("You are " + ageFromDate(dob) + " years old.");
    }

    public static int ageFromDate(LocalDate dob)
    {
        LocalDate curDate = LocalDate.now();
        if((dob != null) && (curDate != null))
        {
            return Period.between(dob, curDate).getYears();
        }
        else
        {
            return 0;
        }
    }
}