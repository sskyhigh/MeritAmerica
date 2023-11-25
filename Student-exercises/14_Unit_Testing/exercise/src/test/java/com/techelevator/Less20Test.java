package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Less20Test {
    private Less20 less20;
    @Before
    public void setup(){
        less20 = new Less20();
    }
    @Test
    public void testIsLessThanMultipleOf20_v1(){
        assertFalse(less20.isLessThanMultipleOf20(20));
    }
    @Test
    public void testIsLessThanMultipleOf20_v2(){
        assertTrue(less20.isLessThanMultipleOf20(19));
    }
    @Test
    public void testIsLessThanMultipleOf20_v3(){
        assertTrue(less20.isLessThanMultipleOf20(18));
    }
}
