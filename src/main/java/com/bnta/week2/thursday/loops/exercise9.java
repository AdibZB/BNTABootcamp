package com.bnta.week2.thursday.loops;
import java.util.Arrays;

/*  TASK
    create a for loop which goes through number in our array
    check whether the value is greater than the current greatest value
    reassign the current greatest value if true
    print the greatest value
*/

public class exercise9
{
    public static void main(String[] args)
    {
       int[] numberArray = new int[]
                {1, 6, 17, 9, 20, 5};

        int maxNum = 0;

        for (int number : numberArray)
        {
            if (number > maxNum) {maxNum = number;}
        }
        System.out.println(maxNum);
    }
}