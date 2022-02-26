package com.bnta.week3.monday.enums_dates;

/*  TASK
    invoke .values() method on ThirstSize enum and loop through its values and while looping lowercase each value
    hint: while you loop through enums invoke .name() to convert enum to string. without it, you can't lowercase
*/

public class exercise3
{
    public static void main(String[] args)
    {
        System.out.println("T Shirt Size is: " + TshirtSize.M);

        TshirtSize[] tshirtSizes = TshirtSize.values();
        for (TshirtSize tshirtSize : tshirtSizes)
        {
            System.out.println(tshirtSize.name().toLowerCase());
        }
    }
}