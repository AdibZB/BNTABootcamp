package com.bnta.week3.monday.enums_dates;

/*  TASK
    run the above code see what error you get
    then surround it with try catch block and catch the exception that was thrown.
    Inside catch the catch block print "cannot divide by 0"
*/

public class exercise8
{
    public static void main(String[] args)
    {
        try
        {
            int division = 10 / 0;
            int result = Integer.parseInt("0");
            System.out.println(result);
        }
            catch(ArithmeticException e)
            {
                System.out.println("oops cant divide by 0");
            }
        catch(Exception e)
            {
                System.out.println("catch all");
                System.out.println(e);
            }
    }
}