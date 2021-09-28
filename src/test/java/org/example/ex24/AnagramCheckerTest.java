package org.example.ex24;

/*
 *  UCF COP3330 Fall 2021 Assignment 2
 *  Copyright 2021 Patrick Mac
 */

import org.example.ex25.PasswordStrengthIndicator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    @Test
    void isAnagram()
    {
        AnagramChecker test = new AnagramChecker();

        boolean result;
        String input1;
        String input2;
        input1 = "tone";
        input2 = "note";
        result = test.isAnagram(input1,input2);
        assertEquals(true,result);

        String input3;
        String input4;
        input1 = "apple";
        input2 = "peopl";
        result = test.isAnagram(input1,input2);
        assertEquals(false,result);
    }
}