package com.bnta.week2.tuesday.arrays;
import java.util.Arrays;

/*  TASK
    start from your solution to Q5
    create a String variable called `condition` which has the value "c"
    create a Boolean variable called `hasC` which has the value `false`
    create a `for` loop which goes through each item in our array, comparing it against our `condition` variable
    if the two are equal, change the `hasC` value to `true`
    once the `for` loop concludes, print out a message which tells you if `hasC` is `true` or `false`
*/

public class exercise10
{
    public static void main(String[] args)
    {
        String[] array = new String[]{"a", "b", "c", "d"};
        String condition = "c";
        Boolean hasC = false;

        for (String item: array){
            if (item.equals(condition)) {
                hasC = true;
            }
        }

        if (hasC) {
            System.out.println(condition + " is in the array!");
        }
        else {
            System.out.println("The condition was not met");
        }
    }
}