package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DateFashionTest {
    private DateFashion dateFashion;
    @Before
    public void setup(){
        dateFashion = new DateFashion();
    }
    @Test
    public void testGetATable_enoughStyle(){
        int result = dateFashion.getATable(5, 10);
        assertEquals(2, result);
    }
    @Test
    public void testGetATable_notEnough(){
        assertEquals(0, dateFashion.getATable(5,2));
    }
    @Test
    public void testGetATable_enoughFashion(){
        assertEquals(1, dateFashion.getATable(5,5));
    }
    @Test
    public void testGetATable_unsure(){
        assertEquals(1, dateFashion.getATable(7,7));
    }
}
