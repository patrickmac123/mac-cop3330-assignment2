package org.example.ex39;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SortingRecordsTest {

    @Test
    void records()
    {
        SortingRecords test = new SortingRecords();

        assertEquals(false,test.records().equals(Collections.<Map<String, String>>emptyList()));
    }
}