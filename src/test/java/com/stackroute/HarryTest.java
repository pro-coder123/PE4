package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarryTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void count() {


        assertTrue(Harry.count("Is Harry here"));
        assertFalse(Harry.count("nuhuil is here"));

    }
}