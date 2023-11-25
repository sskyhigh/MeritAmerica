package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxEnd3Test {
    private MaxEnd3 end3;

    @Before
    public void setup() {
        end3 = new MaxEnd3();
    }

    @Test
    public void testMaxEnd3_v1() {
        int[] nums = {1, 2, 3}; int[] expected = {3, 3, 3};
        assertArrayEquals(expected, end3.makeArray(nums));
    }

    @Test
    public void testMaxEnd3_v2() {
        int[] nums = {11, 5, 9}; int[] expected = {11, 11, 11};
        assertArrayEquals(expected, end3.makeArray(nums));
    }

    @Test
    public void testMaxEnd3_v3() {
        int[] nums = {2, 11, 3}; int[] expected = {3, 3, 3};
        assertArrayEquals(expected, end3.makeArray(nums));
    }
}
