package com.example.michael.olympicsweekendhomework.competitors;

import com.example.michael.olympicsweekendhomework.SkillType;

import java.util.*;

/**
 * Created by michael on 15/09/2017.
 */

public class Team implements Competitor {
    private String name;
    private String country;
    private List<Athlete> athletes;

    public Team(String name, String country, List<Athlete> athletes) {
        this.name = name;
        this.country = country;
        this.athletes = athletes;
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
        HashMap<SkillType, Integer> skills = new HashMap<>();
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
}
