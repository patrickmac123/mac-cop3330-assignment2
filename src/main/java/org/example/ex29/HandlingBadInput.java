package org.example.ex29;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 29
 *  Copyright 2021 Patrick Mac
 */

public class HandlingBadInput
{
    public static Integer Calculate(Integer r)
    {
        int years;
        return years = 72 / r;
    }
    public static void main( String[] args ) {

        boolean flag = true;
        int rate = 0;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("What is the rate of return? ");
            String input = scan.nextLine();
            try
            {
                rate = Integer.parseInt(input);
            }
            catch (Exception e)
            {
                System.out.println("Sorry. That's not a valid input.");
                continue;
            }

            rate = Integer.parseInt(input);

            if(rate != 0)
            {
                flag = false;
            }
            else if(rate == 0)
            {
                System.out.println("Sorry. 0 is not a valid rate.");
            }


        } while (flag);

        int result = Calculate(rate);
        System.out.println("It will take "+result+" years to double your initial investment.");
    }
}

