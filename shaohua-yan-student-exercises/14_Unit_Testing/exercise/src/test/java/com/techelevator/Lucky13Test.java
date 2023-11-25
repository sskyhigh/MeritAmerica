package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Lucky13Test {
    private Lucky13 lucky13;
    @Before
    public void setup(){
        lucky13 = new Lucky13();
    }
    @Test
    public void testLucky13_v1(){
        assertTrue(lucky13.getLucky(new int[]{0, 2, 4}));
    }
    @Test
    public void testLucky13_v2(){
        assertFalse(lucky13.getLucky(new int[]{1, 3, 4}));
    }
    @Test
    public void testLucky13_v3(){
        assertFalse(lucky13.getLucky(new int[]{2,3,5}));
    }
}
