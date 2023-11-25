package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CigarPartyTest {
    private CigarParty cigarParty;

    @Before
    public void setup() {
        cigarParty = new CigarParty();
    }

    @Test
    public void testHaveParty_notEnoughCigars() {
        assertFalse(cigarParty.haveParty(30, false));
    }

    @Test
    public void testHaveParty_EnoughCigars() {
        assertTrue(cigarParty.haveParty(50, true));
    }

    @Test
    public void testHaveParty_MaybeEnough() {
        assertTrue(cigarParty.haveParty(70, true));
    }

    @Test
    public void testHaveParty_dontKnow() {
        assertFalse(cigarParty.haveParty(70, false));
    }
}
