package org.example.ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 2
 *  Copyright 2021 Patrick Mac
 */

import org.example.ex36.ComputingStatistics;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {

    @Test
    void randomChar()
    {
        int n = 2;
        PasswordGenerator test = new PasswordGenerator();
        ArrayList length = test.randomChar(n);
        assertEquals(2,length.size());
    }

    @Test
    void randomNum()
    {
        int n = 2;
        PasswordGenerator test = new PasswordGenerator();
        ArrayList length = test.randomNum(n);
        assertEquals(2,length.size());
    }

    @Test
    void randomLetters()
    {
        int n = 8;
        PasswordGenerator test = new PasswordGenerator();
        ArrayList length = test.randomLetters(n);
        assertEquals(8,length.size());
    }

    @Test
    void generate()
    {
        int chars = 2;
        int num = 2;
        int letters = 8;
        PasswordGenerator test = new PasswordGenerator();
        String password = test.generate(test.randomChar(chars),test.randomNum(num),test.randomLetters(letters));
        int numbers=0,specials=0,letters2=0;

        for (int i = 0; i <password.length(); i++)
        {
            if (Character.isDigit(password.charAt(i)))
            {
                numbers++;
            }
            else if (Character.isAlphabetic(password.charAt(i)))
            {
                letters2++;
            }
            else
            {
                specials++;
            }
        }

        assertEquals(chars,numbers);
        assertEquals(num,specials);
        assertEquals(letters,letters);


    }
}