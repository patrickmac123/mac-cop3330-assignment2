package org.example.ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 38
 *  Copyright 2021 Patrick Mac
 */

import java.util.*;

public class FilteringValues
{
    public static String[] filterEvenNumbers(String [] list)
    {
        List<String> evenList = new ArrayList<String>();

        for(int i = 0; i < list.length;i++)
        {
            if (Integer.valueOf(list[i]) % 2 == 0)
            {
                evenList.add(list[i]);
            }
        }
        String evenArray[] = new String[evenList.size()];

        for(int i = 0; i < evenList.size();i++)
        {
            evenArray[i] = evenList.get(i);
        }
        return evenArray;
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = scanner.nextLine();

        String str[] = input.split(" ");

        String finalList [] = filterEvenNumbers(str);

        System.out.print("The even numbers are");
        for(String s: finalList)
        {
            System.out.print(" "+s);
        }



    }
}
