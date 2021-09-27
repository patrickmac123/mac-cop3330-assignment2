package org.example.ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 36
 *  Copyright 2021 Patrick Mac
 */

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

class inputClass
{
    public static ArrayList input()
    {
        String inputString;
        int input;
        Boolean running = true;
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>();

        do
        {
            System.out.print("Enter a number: ");
            inputString = scan.nextLine();
            try
            {
                if(inputString.equals("done"))
                {
                    running = false;
                }
                else
                {
                    input = Integer.parseInt(inputString);
                    num.add(input);

                }
                continue;

            } catch (Exception e)
            {
                System.out.println("Sorry. That's not a valid input.");
                continue;
            }

        }while(running);

        return num;
    }
}
public class ComputingStatistics
{

    public static double average(ArrayList<Integer> list)
    {
        double sum = 0.0;
        double average;
        for(int i = 0; i < list.size(); i++)
        {
            sum+= list.get(i);
        }
        average = sum / list.size();
        return average;

    }

    public static int min(ArrayList<Integer> list)
    {
        int n = list.size();
        int min = list.get(0);
        for (int i = 1; i < n; i++)
        {
            if (list.get(i) < min)
            {
                min = list.get(i);
            }
        }

        return min;
    }

    public static int max(ArrayList<Integer> list)
    {

        int n = list.size();
        int max = list.get(0);

        for (int i = 1; i < n; i++)
        {
            if (list.get(i) > max)
            {
                max = list.get(i);
            }
        }

        return max;
    }

    public static double standardDeviation(ArrayList<Integer> list)
    {
        double sum = 0.0;
        double std = 0.0;
        double mean;
        for(int n: list)
        {
            sum += n;
        }
        mean = sum / list.size();

        for(int n: list) {
            std += Math.pow(n - mean, 2);
        }

        return Math.sqrt(std/list.size());
    }
    public static void main(String[] args)
    {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list = inputClass.input();

        double average = average(list);
        int max = max(list);
        int min = min(list);
        double std = standardDeviation(list);

        String strList = list.toString();
        strList = strList.replace("[", "").replace("]", "");

        System.out.println("Numbers: "+strList);
        System.out.println("The average is "+average);
        System.out.println("The minimum is "+min);
        System.out.println("The maximum is "+max);
        BigDecimal formattedStd = new BigDecimal(std).setScale(2, RoundingMode.HALF_UP);
        System.out.println("The standard deviation is "+formattedStd);
    }
}
