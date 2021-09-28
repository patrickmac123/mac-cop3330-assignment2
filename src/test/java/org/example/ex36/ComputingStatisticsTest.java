package org.example.ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2
 *  Copyright 2021 Patrick Mac
 */

import org.example.ex33.Magic8Ball;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ComputingStatisticsTest {

    @Test
    void average()
    {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(1000);
        list.add(300);
        ComputingStatistics test = new ComputingStatistics();
        double average = test.average(list);
        assertEquals(400.0,average);
    }

    @Test
    void min()
    {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(1000);
        list.add(300);
        ComputingStatistics test = new ComputingStatistics();
        double min = test.min(list);
        assertEquals(100,min);
    }

    @Test
    void max()
    {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(1000);
        list.add(300);
        ComputingStatistics test = new ComputingStatistics();
        double max = test.max(list);
        assertEquals(1000,max);
    }

    @Test
    void standardDeviation()
    {
        ArrayList list = new ArrayList();
        list.add(100);
        list.add(200);
        list.add(1000);
        list.add(300);
        ComputingStatistics test = new ComputingStatistics();
        double std = test.standardDeviation(list);

        double roundOff = (double) Math.round(std * 100) / 100;
        assertEquals(353.55,roundOff);
    }
}