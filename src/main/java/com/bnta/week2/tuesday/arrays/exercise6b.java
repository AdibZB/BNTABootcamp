package com.bnta.week2.tuesday.arrays;
import java.util.Arrays;

/*  TASK
    using your answer to Q5, create another array which is A COPY off of your original array
    (using the `Arrays.copyOf()` method)
    NOTE that the `.copyOf()` method accepts two arguments,
    first being the array that's being copied and second being the length of the new array
    change the value at index 0 of the new array to "z"
    print both of the arrays and compare
*/

public class exercise6b
{
    public static void main(String[] args)
    {
        String[] array = new String[]{"a", "b", "c", "d"};
        System.out.println(Arrays.toString(array));

        String[] array2 = Arrays.copyOf(array, array.length);
        array2[0] = "z";
        System.out.println(Arrays.toString(array2));
    }
}