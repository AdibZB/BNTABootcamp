package com.bnta.week2.thursday.loops;

/*  TASK
    create a for loop which goes from 0 to 20
    print each even value
*/

public class exercise3
{
    public static void main(String[] args)
    {
        for (int i = 0; i <= 20; i++)
        {
            if (i %2 == 0) System.out.println(i);
        }

        /* OR
        for (int i = 0; 1 <= 20; i += 2)
        {
            System.out.println(i);
        }\
         */
    }
}