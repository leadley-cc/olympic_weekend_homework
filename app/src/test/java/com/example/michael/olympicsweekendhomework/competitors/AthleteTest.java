package com.example.michael.olympicsweekendhomework.competitors;

import com.example.michael.olympicsweekendhomework.SkillType;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static com.example.michael.olympicsweekendhomework.SkillType.*;

/**
 * Created by michael on 15/09/2017.
 */
public class AthleteTest {
    Athlete athlete;

    @Before
    public void before() {
        Map<SkillType,Integer> skills = new HashMap<>();
        skills.put(ACCURACY, 79);
        athlete = new Athlete("Michael", "GB", skills);
    }

    @Test
    public void getName() {
        assertEquals("Michael", athlete.getName());
    }

    @Test
    public void getCountry() {
        assertEquals("GB", athlete.getCountry());
    }

    @Test
    public void getSkills() {
        assertNotNull(athlete.getSkills());
    }

    @Test
    public void getSkill() {
        assertEquals(79, athlete.getSkill(ACCURACY));
    }

}