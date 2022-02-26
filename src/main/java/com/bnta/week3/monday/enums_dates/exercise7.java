package com.bnta.week3.monday.enums_dates;
import java.time.LocalDate;

/*  TASK
    create a method that sums days of the month for a given array of LocalDate
*/

public class exercise7
{
    public static void main(String[] args)
    {
        // create a dates array
        LocalDate[] localDatesArray =
                {
                LocalDate.of(2000,1,1),
                LocalDate.of(2000,1,2),
                LocalDate.of(2000,1,3),
                LocalDate.of(2000,1,4),
                };

        System.out.println(sumDaysOfMonth(localDatesArray));
    }

    static int sumDaysOfMonth(LocalDate[] localDatesArray)
    {

        //extract day of month for one element
        // System.out.println(localDatesArray[0].getDayOfMonth());

        //extract dom for all of the local
        int sumOfDaysOfMonth = 0;
        for (LocalDate localDate : localDatesArray)
        {
            sumOfDaysOfMonth = sumOfDaysOfMonth + localDate.getDayOfMonth();

        }
        System.out.println("sum: "+ sumOfDaysOfMonth);
        return sumOfDaysOfMonth;
    }
}