package com.bnta.week2.monday.conditionals;

/*  TASK
    Modify your answer to Question 5 to instead use an OR operator.
    Play about with the values assigned to your three variables, noting how the behaviour changes.
*/

public class exercise6
{
    public static void main(String[] args)
    {
        {
            int first = 9;
            int second = 7;
            int third = 15;

           if(first > second || first < third)
           {

                   System.out.println("The first number is inbetween the second and third numbers.");
           }
            else
            {
                   System.out.println(first + " is not between " + second + " and " + third);
            }
        }
    }
}