package com.example.michael.olympicsweekendhomework;

import org.junit.Before;
import org.junit.Test;

import static com.example.michael.olympicsweekendhomework.MedalType.GOLD;
import static com.example.michael.olympicsweekendhomework.MedalType.SILVER;
import static org.junit.Assert.*;

/**
 * Created by michael on 17/09/2017.
 */
public class MedalTableTest {

    @Before
    public void before() {
        MedalTable.reset();
    }

    @Test
    public void medalListsStartNull() {
        assertNull( MedalTable.getMedalsForCountry("GB") );
    }

    @Test
    public void addingMedalCreatesListInMap() {
        MedalTable.addMedal("GB", new Medal(GOLD));
        assertNotNull( MedalTable.getMedalsForCountry("GB") );
        assertEquals( 1, MedalTable.getMedalsForCountry("GB").size() );
    }

    @Test
    public void addingAnotherMedalAddsToExistingListInMap() {
        MedalTable.addMedal("GB", new Medal(GOLD));
        MedalTable.addMedal("GB", new Medal(GOLD));
        assertEquals( 2, MedalTable.getMedalsForCountry("GB").size() );
    }

    @Test
    public void canGetPointsForCountry() {
        MedalTable.addMedal("GB", new Medal(GOLD));
        MedalTable.addMedal("GB", new Medal(SILVER));
        assertEquals( 5, MedalTable.getPointsForCountry("GB") );
    }

}