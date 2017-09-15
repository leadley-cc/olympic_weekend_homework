package com.example.michael.olympicsweekendhomework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

import static com.example.michael.olympicsweekendhomework.MedalType.*;

/**
 * Created by michael on 15/09/2017.
 */

public class MedalTest {
    Medal goldMedal;

    @Before
    public void before() {
        goldMedal = new Medal(GOLD);
    }

    @Test
    public void canGetType() {
        assertEquals(GOLD, goldMedal.getType());
    }
}