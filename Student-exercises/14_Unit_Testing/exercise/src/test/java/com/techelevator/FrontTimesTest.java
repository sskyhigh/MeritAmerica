package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FrontTimesTest {
    private FrontTimes frontTimes;
    @Before
    public void setup(){
        frontTimes = new FrontTimes();
    }
    @Test
    public void testGenerateString(){
        String result = frontTimes.generateString("abc", 3);
        assertEquals("abcabcabc", result);
    }
    @Test
    public void testGenerateString_Fuzzy(){
        String result = frontTimes.generateString("abc", 3);
    }
}
