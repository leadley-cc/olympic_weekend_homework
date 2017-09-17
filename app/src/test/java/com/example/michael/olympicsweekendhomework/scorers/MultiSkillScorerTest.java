package com.example.michael.olympicsweekendhomework.scorers;

import com.example.michael.olympicsweekendhomework.Score;
import com.example.michael.olympicsweekendhomework.SkillType;
import com.example.michael.olympicsweekendhomework.competitors.Athlete;
import com.example.michael.olympicsweekendhomework.competitors.Competitor;

import org.junit.Before;
import org.junit.Test;

import java.util.EnumMap;
import java.util.Map;

import static com.example.michael.olympicsweekendhomework.SkillType.ACCURACY;
import static com.example.michael.olympicsweekendhomework.SkillType.AGILITY;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * Created by michael on 17/09/2017.
 */
public class MultiSkillScorerTest {
    Scorer scorer;
    Competitor athlete;

    @Before
    public void before() {
        scorer = new MultiSkillScorer( asList(ACCURACY, AGILITY) );
        Map<SkillType,Integer> skills = new EnumMap<>(SkillType.class);
        skills.put(ACCURACY, 79);
        skills.put(AGILITY, 65);
        athlete = new Athlete("Michael", "GB", skills);
    }

    @Test
    public void canCalculateScore() {
        Score result = scorer.calculateScore(athlete);
        assertEquals(144, result.getScoreValue());
    }
}