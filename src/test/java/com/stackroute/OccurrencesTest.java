package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class OccurrencesTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void count() {

        assertEquals("Wrong",Occurrences.count("abca",'a'),2);
        assertEquals("Wrong",Occurrences.count("abca",'c'),1);
        assertEquals("Wrong",Occurrences.count("abcbbba",'b'),4);
    }
}