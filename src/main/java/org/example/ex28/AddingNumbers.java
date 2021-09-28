package org.example.ex28;

import java.util.ArrayList;
import java.util.Scanner;


/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 28
 *  Copyright 2021 Patrick Mac
 */

public class AddingNumbers
{

    public static int add(ArrayList list)
    {
        int sum = 0;
        for(int i = 0;i< list.size();i++)
        {

            sum += (int) list.get(i);

        }
        return sum;
    }
    public static void main( String[] args )
    {
        ArrayList list = new ArrayList();
        Scanner scan = new Scanner(System.in);
        for(int i = 0;i<5;i++)
        {

            System.out.print("Enter a number: ");
            list.add(scan.nextInt());

        }
        int sum = add(list);
        System.out.println("The total is "+sum+".");
    }
}
