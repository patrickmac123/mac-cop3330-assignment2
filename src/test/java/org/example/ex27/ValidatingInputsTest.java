package org.example.ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 2
 *  Copyright 2021 Patrick Mac
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidatingInputsTest {

    @Test
    void validateInput()
    {

    }

    @Test
    void validateFirstname()
    {
        ValidatingInputs undertest = new ValidatingInputs();
        String input;
        String result;
        input = "John";
        result = undertest.validateFirstname(input,"");
        assertEquals("", result);

        input = "J";
        result = undertest.validateFirstname(input,"");
        assertEquals("The first name must be at least 2 characters long.\n", result);

        input = "";
        result = undertest.validateFirstname(input,"");
        assertEquals("The first name must be filled in.\n", result);
    }

    @Test
    void validateLastname()
    {
        ValidatingInputs undertest = new ValidatingInputs();
        String input;
        String result;
        input = "Johnson";
        result = undertest.validateLastname(input,"");
        assertEquals("", result);

        input = "J";
        result = undertest.validateLastname(input,"");
        assertEquals("The last name must be at least 2 characters long.\n", result);

        input = "";
        result = undertest.validateLastname(input,"");
        assertEquals("The first name must be filled in.\n", result);
    }

    @Test
    void validateZipcode()
    {
        ValidatingInputs undertest = new ValidatingInputs();
        String input;
        String result;
        input = "55555";
        result = undertest.validateZipcode(input,"");
        assertEquals("", result);

        input = "555555";
        result = undertest.validateZipcode(input,"");
        assertEquals("The zipcode must be a 5 digit number.\n", result);

        input = "abcde";
        result = undertest.validateZipcode(input,"");
        assertEquals("The zipcode must be a 5 digit number.\n", result);
    }

    @Test
    void validateEmployeeID()
    {
        ValidatingInputs undertest = new ValidatingInputs();
        String input;
        String result;
        input = "AA-4321";
        result = undertest.validateEmployeeID(input,"");
        assertEquals("", result);

        input = "LM-22635283";
        result = undertest.validateEmployeeID(input,"");
        assertEquals("The employee ID must be in the format of AA-1234.\n", result);

        input = "jKw4362";
        result = undertest.validateEmployeeID(input,"");
        assertEquals("The employee ID must be in the format of AA-1234.\n", result);

        input = "HK-fas1";
        result = undertest.validateEmployeeID(input,"");
        assertEquals("The employee ID must be in the format of AA-1234.\n", result);
    }
}