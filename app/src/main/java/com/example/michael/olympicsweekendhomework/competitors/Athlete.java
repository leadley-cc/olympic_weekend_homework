package com.example.michael.olympicsweekendhomework.competitors;

import com.example.michael.olympicsweekendhomework.Medal;
import com.example.michael.olympicsweekendhomework.SkillType;

import java.util.*;

/**
 * Created by michael on 15/09/2017.
 */

public class Athlete implements Competitor {
    private String name;
    private String country;
    private Map<SkillType,Integer> skills;
    private List<Medal> medals;

    public Athlete(String name, String country, Map<SkillType, Integer> skills) {
        this.name = name;
        this.country = country;
        this.skills = skills;
        this.medals = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public Map<SkillType, Integer> getSkills() {
        return skills;
    }

    @Override
    public int getSkill(SkillType skill) {
        return skills.get(skill);
    }

    @Override
    public List<Medal> getMedals() {
        return medals;
    }

    @Override
    public void awardMedal(Medal medal) {
        medals.add(medal);
    }

    public static Map<SkillType, Integer> generateSkillsMap(
            int accuracy, int agility, int speed, int stamina, int strength
    ) {
        Map<SkillType, Integer> skills = new EnumMap<>(SkillType.class);
        skills.put(SkillType.ACCURACY, accuracy);
        skills.put(SkillType.AGILITY, agility);
        skills.put(SkillType.SPEED, speed);
        skills.put(SkillType.STAMINA, stamina);
        skills.put(SkillType.STRENGTH, strength);
        return skills;
    }
}
