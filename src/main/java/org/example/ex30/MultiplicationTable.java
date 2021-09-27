package org.example.ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 30
 *  Copyright 2021 Patrick Mac
 */

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        int a;
        int b;

        for (a = 1; a <= 12; ++a)
        {
            for (b = 1; b <= 12; ++b)
            {
                System.out.printf("%5d",(a*b));
            }
            System.out.println();
        }
    }
}
