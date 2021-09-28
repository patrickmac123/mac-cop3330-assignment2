package org.example.ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2
 *  Copyright 2021 Patrick Mac
 */

import org.example.ex29.HandlingBadInput;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class KarvonenHeartRateTest {

    @Test
    void calculate()
    {
        KarvonenHeartRate test = new KarvonenHeartRate();

            double result = test.calculate(55, 22, 65);
            assertEquals((int) 138, (int) result);


    }

}