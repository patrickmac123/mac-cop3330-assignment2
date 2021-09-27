package org.example.ex26;
import java.lang.Math;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 26
 *  Copyright 2021 Patrick Mac
 */

public class MonthstoPayOffaCreditCard {


    public static void main( String[] args )
    {
        int months;
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your balance? ");
        double balance = scan.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        double APR = scan.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        double monthlyPayment = scan.nextDouble();

        PaymentCalculator debt = new PaymentCalculator();

        months = debt.calculateMonthsUntilPaidOff(APR,balance,monthlyPayment);

        System.out.println("It will take you "+months+" months to pay off this card.");


    }
}

class PaymentCalculator
{
    public int calculateMonthsUntilPaidOff(double APR,double balance,double monthlyPayment)
    {
        APR = APR/100;
        APR = APR/365;
        double n = (-1.0/30.0) * Math.log(1.0+(balance/monthlyPayment) * (1.0- (Math.pow(1.0+APR,30.0)))) / Math.log(1.0+APR);
        int result = (int) Math.ceil(n);
        return result;
    }
}