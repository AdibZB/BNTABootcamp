package com.bnta.week3.monday.enums_dates;

/*  TASK
    1 - Print todays Date and Time using LocalDate
    2 - Represent your date of birth using LocalDate
    3 - Add 100 days to your dob and print it
*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class exercise4
{
    public static void main(String[] args)
    {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        System.out.println("--------------------------------------");

        LocalDate d = LocalDate.of(1997, Month.JULY, 12);
        System.out.println("My date of birth is: " + d);
        LocalDate dobPlus100days = d.plusDays(100);
        System.out.println("My DOB + 100 days is: " + dobPlus100days);

    }
}