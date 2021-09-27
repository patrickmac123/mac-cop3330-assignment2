package org.example.ex32;

import java.util.Scanner;
import java.util.Random;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 32
 *  Copyright 2021 Patrick Mac
 */

public class GuesstheNumberGame
{
    public static int guessNum(int difficulty)
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int num = 0;
        int guesses = 0;
        String inputString;
        int input = 0;
        boolean loop = true;
        boolean valid = true;

        if(difficulty == 1)
        {
            num = rand.nextInt(11);
        }
        else if(difficulty == 2)
        {
            num = rand.nextInt(101);
        }
        else if(difficulty == 3)
        {
            num = rand.nextInt(1001);
        }


        System.out.print("I have my number. What's your guess? ");

        do {

                inputString = scan.nextLine();
                try {
                    input = Integer.parseInt(inputString);
                } catch (Exception e) {
                    guesses += 1;
                    System.out.println("Sorry. That's not a valid input.");
                    continue;
                }
                input = Integer.parseInt(inputString);


                if (input == num)
                {
                    guesses += 1;
                    loop = false;
                }
                else if (input < num)
                {
                    guesses += 1;
                    System.out.print("Too low. Guess again: ");
                }
                else if (input > num)
                {
                    guesses += 1;
                    System.out.print("Too high. Guess again: ");
                }



        }
        while(loop);

        return guesses;

    }

    public static void start()
    {
        boolean replay = true;
        boolean yesOrno = true;
        boolean flag = true;
        String difficulty;
        int guesses = 0;
        System.out.println("Let's play Guess the Number!");
        System.out.println();
        Scanner scan = new Scanner(System.in);

        do {



            do {
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                difficulty = scan.nextLine();
                if (difficulty.equals("1") || difficulty.equals("2") || difficulty.equals("3")) {
                    flag = false;
                } else {
                    System.out.println("That is not a valid input");
                }
            }
            while (flag);
            flag = true;

            if(difficulty.equals("1"))
            {
                guesses = guessNum(1);
            }
            else if (difficulty.equals("2"))
            {
                guesses = guessNum(2);
            }
            else if((difficulty.equals("3")))
            {
                guesses = guessNum(3);
            }

            System.out.println("You got it in "+guesses+" guesses!");

            do {
                System.out.print("Do you wish to play again (Y/N)? ");
                difficulty = scan.nextLine();
                if (difficulty.equals("n") || difficulty.equals("N")) {
                    replay = false;
                    yesOrno = false;

                }
                else if(difficulty.equals("y") || difficulty.equals("Y"))
                {
                    System.out.println();
                    yesOrno = false;
                }
                else
                {
                    System.out.println("That is not a valid response");
                }
            }
            while (yesOrno);
            yesOrno = true;
        }while(replay);
    }
    public static void main(String[] args)
    {
        start();
    }
}
