package org.example.ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 33
 *  Copyright 2021 Patrick Mac
 */

import java.util.Random;
import java.util.Scanner;

public class Magic8Ball
{
    public static int randomize()
    {
        Random rand = new Random();
        int num = rand.nextInt(4);
        return num;
    }
    public static void main(String[] args)
    {
        String[] response = {"Yes,", "No,", "Maybe,", "Ask again later."};
        Scanner scan = new Scanner(System.in);
        String input;

            System.out.println("I am the Magic 8 Ball");
            System.out.println("To quit type exit");
            System.out.println("What is your question? ");
            System.out.print("> ");
            input = scan.nextLine();

            int num = randomize();
            System.out.println();
            System.out.println(response[num]);
            System.out.println();


    }

}
