package org.example.ex24;
import java.util.Arrays;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 24
 *  Copyright 2021 Patrick Mac
 */
public class AnagramChecker
{
    public static boolean isAnagram(String string1, String string2)
    {
        if (string1.length() != string2.length())
        {
            return false;
        }
        char[] array1 = string1.toCharArray();
        char[] array2 = string2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);

    }

    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("This program helps Troubleshoot Car Issues");
        System.out.print("Enter the first string: ");
        String firstString = scan.nextLine();
        System.out.print("Enter the first string: ");
        String secondString = scan.nextLine();

        boolean result = isAnagram(firstString,secondString);

        if(result)
        {
            System.out.println(firstString+" and "+secondString+" are anagrams.");
        }
        else
        {
            System.out.println("\""+firstString+"\" and \""+secondString+"\" are not anagrams.");
        }

    }
}
