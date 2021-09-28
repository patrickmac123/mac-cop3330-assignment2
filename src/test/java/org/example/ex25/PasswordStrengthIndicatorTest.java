package org.example.ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2
 *  Copyright 2021 Patrick Mac
 */

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.Conversion;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthIndicatorTest {

    @Test
    void passwordValidator()
    {
        PasswordStrengthIndicator test = new PasswordStrengthIndicator();

        int result;
        String input;
        input = "12345";
        result = test.passwordValidator(input);
        assertEquals(4,result);

        input = "abcdef";
        result = test.passwordValidator(input);
        assertEquals(3,result);

        input = "abc123xyz";
        result = test.passwordValidator(input);
        assertEquals(2,result);

        input = "1337h@xor!";
        result = test.passwordValidator(input);
        assertEquals(1,result);



    }

}