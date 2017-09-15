package com.example.michael.olympicsweekendhomework.competitors;

import com.example.michael.olympicsweekendhomework.SkillType;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.example.michael.olympicsweekendhomework.SkillType.ACCURACY;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by michael on 15/09/2017.
 */
public class TeamTest {
    Athlete athlete1;
    Athlete athlete2;
    Team team;

    @Before
    public void before() {
        Map<SkillType,Integer> skills1 = new HashMap<>();
        skills1.put(ACCURACY, 79);
        athlete1 = new Athlete("Michael", "GB", skills1);

        Map<SkillType,Integer> skills2 = new HashMap<>();
        skills2.put(ACCURACY, 71);
        athlete2 = new Athlete("Kyle", "GB", skills2);

        List<Athlete> athletes = new ArrayList<>( Arrays.asList(athlete1, athlete2) );
        team = new Team("MK", "GB", athletes);
    }

    @Test
    public void getName() {
        assertEquals("MK", team.getName());
    }

    @Test
    public void getCountry() {
        assertEquals("GB", team.getCountry());
    }

    @Test
    public void getSkills() {
        assertNotNull(team.getSkills());
    }

    @Test
    public void getSkill() {
        assertEquals(150, team.getSkill(ACCURACY));
    }

}