package com.example.michael.olympicsweekendhomework.competitors;

import com.example.michael.olympicsweekendhomework.SkillType;

import java.util.Map;

/**
 * Created by michael on 15/09/2017.
 */

public interface Competitor {
    String getName();

    String getCountry();

    Map<SkillType, Integer> getSkills();

    int getSkill(SkillType skill);
}
