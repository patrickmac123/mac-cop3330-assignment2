package org.example.ex31;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 31
 *  Copyright 2021 Patrick Mac
 */

public class KarvonenHeartRate
{
    public static double calculate(double rate, int age, int restingHR)
    {
        double intensity = rate / 100;
        double TargetHeartRate = (((220 - age) - restingHR) * intensity) + restingHR;
        return TargetHeartRate;
    }
    public static void main(String[] args)
    {
        boolean flag = true;
        int age = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.print("What is your age? ");
            String input = scan.nextLine();
            try
            {
                age = Integer.parseInt(input);
            }
            catch (Exception e)
            {
                System.out.println("Sorry. That's not a valid input.");
                continue;
            }
            age = Integer.parseInt(input);
            if(age != 0)
            {
                flag = false;
            }
            else if(age == 0)
            {
                System.out.println("Sorry. 0 is not a valid age.");
            }
        } while (flag);

        flag = true;
        int restingHR = 0;
        do {
            System.out.print("What is your resting heart rate? ");
            String input = scan.nextLine();
            try
            {
                restingHR = Integer.parseInt(input);
            }
            catch (Exception e)
            {
                System.out.println("Sorry. That's not a valid input.");
                continue;
            }
            restingHR = Integer.parseInt(input);
            if(restingHR != 0)
            {
                flag = false;
            }
            else if(restingHR == 0)
            {
                System.out.println("Sorry. 0 is not a valid heart rate.");
            }
        } while (flag);

        System.out.println("Resting Pulse: "+restingHR+"\tAge: "+age);
        System.out.println();
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");
        double bpm;
        double intensity = 55;
        for(int i = 55;i <= 95;i+=5)
        {
            bpm = calculate(intensity,age,restingHR);
            System.out.println(i+"%          | "+Math.round(bpm)+"bpm");
            intensity = intensity+5;
        }

    }
}
