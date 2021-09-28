package org.example.ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2
 *  Copyright 2021 Patrick Mac
 */

import org.example.ex31.KarvonenHeartRate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuesstheNumberGameTest {

    @Test
    void difficulty()
    {
        GuesstheNumberGame test = new GuesstheNumberGame();



            int result = test.difficulty(1);
            assertEquals(true,(result<=10&&result>=1));
            result = test.difficulty(2);
            assertEquals(true,(result<=100&&result>=1));
            result = test.difficulty(3);
            assertEquals(true,(result<=1000&&result>=1));


    }
}
