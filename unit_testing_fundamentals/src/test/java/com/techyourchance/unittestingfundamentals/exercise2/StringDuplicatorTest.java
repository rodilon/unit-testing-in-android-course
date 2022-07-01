package com.techyourchance.unittestingfundamentals.exercise2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringDuplicatorTest {

    StringDuplicator SUT;

    @Before
    public void setUp() {
        SUT = new StringDuplicator();
    }

    @Test
    public void duplicate_emptyChar_returnEmptyChar() {
        String result = SUT.duplicate("");

        assertEquals(result, "");
    }

    @Test
    public void duplicate_singleChar_returnSingleCharDuplicated() {
        String result = SUT.duplicate("a");

        assertEquals(result, "aa");
    }

    @Test
    public void duplicate_longChar_returnLongCharDuplicated() {
        String result = SUT.duplicate("Renan");

        assertEquals(result, "RenanRenan");
    }

}