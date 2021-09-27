package org.example.ex25;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 25
 *  Copyright 2021 Patrick Mac
 */

public class PasswordStrengthIndicator
{

    public static int passwordValidator(String input)
    {
        int n = input.length();
        boolean letters = false;
        boolean numbers = false;
        boolean specialChar = false;

        Set<Character> set = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+'));

        for (char i : input.toCharArray())
        {
            if (Character.isLetter(i))
                letters = true;
            if (Character.isDigit(i))
                numbers = true;
            if (set.contains(i))
                specialChar = true;
        }

        if (letters && numbers && specialChar && n >= 8)
        {
            return 1;
        }
        else if (letters && numbers && n >= 8)
        {
            return 2;
        }
        else if (letters && n <= 8)
        {
            return 3;
        }
        else if (numbers && n <= 8) {
            return 4;
        }
        return 0;
    }


    public static void main( String[] args )
    {

        Scanner scan = new Scanner(System.in);
        System.out.print("What is the password? ");
        String password = scan.nextLine();
        int result = passwordValidator(password);
        String status;
        switch (result)
        {
            case 1: status = "very strong";
                break;
            case 2: status = "strong";
                break;
            case 3: status = "weak";
                break;
            case 4: status = "very weak";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + result);
        }
        System.out.print("The password \'"+password+"\' is a "+status+" password.");


    }
}
