package com.example.michael.olympicsweekendhomework.competitors;

import com.example.michael.olympicsweekendhomework.Medal;
import com.example.michael.olympicsweekendhomework.SkillType;

import java.util.*;

/**
 * Created by michael on 15/09/2017.
 */

public class Team implements Competitor {
    private String name;
    private String country;
    private List<Athlete> athletes;
    private List<Medal> medals;

    public Team(String name, String country, List<Athlete> athletes) {
        this.name = name;
        this.country = country;
        this.athletes = athletes;
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
        EnumMap<SkillType, Integer> skills = new EnumMap<>(SkillType.class);
        for (SkillType skill : SkillType.values()) {
            int totalSkillValue = 0;
            for (Athlete athlete : athletes) {
                if (!athlete.getSkills().containsKey(skill)) continue;
                totalSkillValue += athlete.getSkill(skill);
            }
            skills.put(skill, totalSkillValue);
        }
        return skills;
    }

    @Override
    public int getSkill(SkillType skill) {
        int totalSkillValue = 0;
        for (Athlete athlete : athletes) {
            if (!athlete.getSkills().containsKey(skill)) continue;
            totalSkillValue += athlete.getSkill(skill);
        }
        return totalSkillValue;
    }

    // The other implementation might cause counting issues in future
    @Override
    public void awardMedal(Medal medal) {
        medals.add(medal);
    }

//    @Override
//    public void awardMedal(Medal medal) {
//        for (Athlete athlete : athletes) {
//            athlete.awardMedal(medal);
//        }
//    }
}
