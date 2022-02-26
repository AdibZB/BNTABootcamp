package com.bnta.week2.tuesday.arrays;
import java.util.Arrays;

/*  TASK
    using your answer to Q5, create a second array which is initialised using your original array
    hint: instead of using the `new` keyword, try simply giving the name of your original array
    change the value at index 0 of the new array to "z"
    print both of your arrays and compare
*/

public class exercise6
{
    public static void main(String[] args)
    {
        String[] array = new String[]{"a", "b", "c", "d"};
        System.out.println(Arrays.toString(array));

        array[0] = "z";
        System.out.println(Arrays.toString(array));
    }
}