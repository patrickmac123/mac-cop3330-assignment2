package org.example.ex28;

import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 28
 *  Copyright 2021 Patrick Mac
 */

public class AddingNumbers
{
    public static void main( String[] args )
    {
        int sum = 0;
        Scanner scan = new Scanner(System.in);

        for(int i = 0;i<5;i++)
        {

            System.out.print("Enter a number: ");
            sum += scan.nextInt();

        }
        System.out.println("The total is "+sum+".");
    }
}
