package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void replace() {

        assertEquals("Wrong",Replace.replace("abca"),"abca");

        assertEquals("Wrong",Replace.replace("abcad"),"abcaf");

        assertEquals("Wrong",Replace.replace("abcal"),"abcat");

    }
}