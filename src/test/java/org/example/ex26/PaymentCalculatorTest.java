package org.example.ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2
 *  Copyright 2021 Patrick Mac
 */

import org.example.ex25.PasswordStrengthIndicator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {

    @Test
    void calculateMonthsUntilPaidOff()
    {
        PaymentCalculator test = new PaymentCalculator();

        double result;
        double APR = 12;
        double balance = 5000;
        double monthlyPayment = 100;
        result = test.calculateMonthsUntilPaidOff(APR,balance,monthlyPayment);
        assertEquals(70,result);
    }
}