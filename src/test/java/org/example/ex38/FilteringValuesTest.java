package org.example.ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2
 *  Copyright 2021 Patrick Mac
 */

import org.example.ex36.ComputingStatistics;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FilteringValuesTest {

    @Test
    void filterEvenNumbers()
    {
        FilteringValues list = new FilteringValues();
        String[] array = new String[4];
        String[] expected = {"2","4","6","8"};
        String input = "1 2 3 4 5 6 7 8";
        array = list.filterEvenNumbers(list.splitString(input));
        assertArrayEquals(expected,array);
    }

    @Test
    void splitString()
    {
        FilteringValues list = new FilteringValues();
        String[] array = new String[7];
        String[] expected = {"1","2","3","4","5","6","7","8"};
        String input = "1 2 3 4 5 6 7 8";
        array = list.splitString(input);
        assertArrayEquals(expected,array);

    }
}