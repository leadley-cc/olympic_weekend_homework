package com.example.michael.olympicsweekendhomework;

import com.example.michael.olympicsweekendhomework.competitors.Athlete;
import com.example.michael.olympicsweekendhomework.competitors.Competitor;
import com.example.michael.olympicsweekendhomework.scorers.Scorer;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static com.example.michael.olympicsweekendhomework.MedalType.BRONZE;
import static com.example.michael.olympicsweekendhomework.MedalType.GOLD;
import static com.example.michael.olympicsweekendhomework.MedalType.SILVER;
import static org.junit.Assert.*;

/**
 * Created by michael on 17/09/2017.
 */
public class EventTest {
    Competitor tim;
    Competitor bob;
    Competitor jon;
    List<Competitor> competitors;
    Scorer mockScorer;
    Event event;

    @Before
    public void before() {
        tim = new Athlete("Tim", "GB", new HashMap());
        bob = new Athlete("Bob", "US", new HashMap());
        jon = new Athlete("Jon", "Canada", new HashMap());
        competitors = new ArrayList<>( Arrays.asList(tim, bob, jon) );
        mockScorer = Mockito.mock(Scorer.class);
        event = new Event("100 Metre Sprint", competitors, mockScorer);
    }

    @Test
    public void canGetName() {
        assertEquals("100 Metre Sprint", event.getName());
    }

    @Test
    public void canGetCompetitors() {
        assertEquals(competitors, event.getCompetitors());
    }

    @Test
    public void awardMedals() {
        Mockito.when( mockScorer.calculateScore( tim ) ).thenReturn(new Score(tim, 40));
        Mockito.when( mockScorer.calculateScore( bob ) ).thenReturn(new Score(bob, 30));
        Mockito.when( mockScorer.calculateScore( jon ) ).thenReturn(new Score(jon, 50));

        event.awardMedals();

        assertEquals(1, tim.getMedals().size());
        assertEquals(SILVER, tim.getMedals().get(0).getType());
        assertEquals(2, MedalTable.getPointsForCountry("GB"));

        assertEquals(1, bob.getMedals().size());
        assertEquals(BRONZE, bob.getMedals().get(0).getType());
        assertEquals(1, MedalTable.getPointsForCountry("US"));

        assertEquals(1, jon.getMedals().size());
        assertEquals(GOLD, jon.getMedals().get(0).getType());
        assertEquals(3, MedalTable.getPointsForCountry("Canada"));
    }

}