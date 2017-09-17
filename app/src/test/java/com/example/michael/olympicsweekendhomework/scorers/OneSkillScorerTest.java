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
import static org.junit.Assert.*;

/**
 * Created by michael on 17/09/2017.
 */
public class OneSkillScorerTest {
    Scorer scorer;
    Competitor athlete;

    @Before
    public void before() {
        scorer = new OneSkillScorer(ACCURACY);
        Map<SkillType,Integer> skills = new EnumMap<>(SkillType.class);
        skills.put(ACCURACY, 79);
        athlete = new Athlete("Michael", "GB", skills);
    }

    @Test
    public void canCalculateScore() {
        Score result = scorer.calculateScore(athlete);
        assertEquals(79, result.getScoreValue());
    }
}