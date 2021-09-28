package org.example.ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2
 *  Copyright 2021 Patrick Mac
 */

import org.example.ex32.GuesstheNumberGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Magic8BallTest {

    @Test
    void randomize()
    {
        Magic8Ball test = new Magic8Ball();
        int result = test.randomize();
        assertEquals(true,(result<=4&&result>=1));
    }
}