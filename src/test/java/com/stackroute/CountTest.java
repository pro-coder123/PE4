package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void count() {
        assertEquals("wrong",Count.count("abcd","ab"),1);
        assertEquals("wrong",Count.count("abcdab","ab"),2);
    }
}