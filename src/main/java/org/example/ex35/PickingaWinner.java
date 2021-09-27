package org.example.ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 35
 *  Copyright 2021 Patrick Mac
 */

public class PickingaWinner
{

    public static void main(String[] args)
    {
        String input;
        Boolean running = true;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<String> contestant = new ArrayList<String>();

        do
        {
            System.out.print("Enter a name: ");
            input = scan.nextLine();
            if(input.equals(""))
            {
                running = false;
            }
            else
            {
                contestant.add(input);
            }
        }while(running);

        int num = rand.nextInt(contestant.size());
        System.out.println("The winner is... "+contestant.get(num)+".");
    }
}
