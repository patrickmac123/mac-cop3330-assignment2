package org.example.ex40;

import org.example.ex39.SortingRecords;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FilteringRecordsTest {

    @Test
    void records()
    {
        SortingRecords test = new SortingRecords();

        assertEquals(false,test.records().equals(Collections.<Map<String, String>>emptyList()));
    }
}