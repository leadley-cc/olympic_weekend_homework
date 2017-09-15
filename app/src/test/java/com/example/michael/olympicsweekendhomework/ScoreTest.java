package com.example.michael.olympicsweekendhomework;

import com.example.michael.olympicsweekendhomework.competitors.Athlete;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by michael on 15/09/2017.
 */
public class ScoreTest {
    Athlete athlete;
    Score lowScore;
    Score highScore;

    @Before
    public void before() throws Exception {
        athlete = new Athlete("Michael", "GB", new HashMap<SkillType,Integer>());
        lowScore = new Score(athlete, 10);
        highScore = new Score(athlete, 90);
    }

    @Test
    public void getCompetitor() throws Exception {
        assertEquals(athlete, lowScore.getCompetitor());
    }

    @Test
    public void getScoreValue() throws Exception {
        assertEquals(90, highScore.getScoreValue());
    }

    @Test
    public void canCompare() throws Exception {
        assertEquals(1, highScore.compareTo(lowScore));
        assertEquals(-1, lowScore.compareTo(highScore));
        assertEquals(0, lowScore.compareTo(lowScore));
    }

}