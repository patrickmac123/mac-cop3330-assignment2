package org.example.ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2
 *  Copyright 2021 Patrick Mac
 */

import org.example.ex25.PasswordStrengthIndicator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HandlingBadInputTest {

    @Test
    void calculate()
    {
        HandlingBadInput test = new HandlingBadInput();

        int result;
        int input;
        input = 4;
        result = test.calculate(input);
        assertEquals(18,result);

        input = 0;
        result = test.calculate(input);

    }

}