package com.bnta.week2.arrays_conditionals_methods;

/*  TASK
    Write a method that finds the longest string in any given array.
    i.e. [] -> ""
    i.e. ["hello", "ola", "bye", "ciao"] -> hello
    i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
    i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
*/

public class exercise7
{
    public static void main(String[] args)
    {
       System.out.println(
               longestWords(new String[]{"Adib", "Suad", "Will", "Suraaj", "Sarina", "Marcy", "Michelle"}));
    }

    static String longestWords(String[] input)
    {
        if (input == null) return "";
        String longest = "";
        int longestWord = 0;
        for (String i : input)
        {
            if (i.length() > longestWord)
            {
                longestWord = i.length();
                longest = i + ", ";
            }
            else if (i.length() == longestWord)
            {
                boolean duplicate = false;
                for (String s : longest.split(","))
                {
                    if (s.equals(i))
                    {
                        duplicate = true;
                        break;
                    }
                }
                if (!duplicate)
                {
                    longest += i + ", ";
                }
            }
        }
        if (longest.equals(""))
        {
            return longest;
        }
        return longest.substring(0, longest.length() - 2);
    }
}