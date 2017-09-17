package com.example.michael.olympicsweekendhomework.scorers;

import com.example.michael.olympicsweekendhomework.Score;
import com.example.michael.olympicsweekendhomework.SkillType;
import com.example.michael.olympicsweekendhomework.competitors.Competitor;

import java.util.*;

/**
 * Created by michael on 17/09/2017.
 */

public class MultiSkillScorer implements Scorer {
    private Set<SkillType> judgedSkills;

    public MultiSkillScorer(List<SkillType> skills) {
        this.judgedSkills = new HashSet<>(skills);
    }

    @Override
    public Score calculateScore(Competitor competitor) {
        int scoreValue = 0;
        for (SkillType judgedSkill : judgedSkills) {
            scoreValue += competitor.getSkill(judgedSkill);
        }
        return new Score(competitor, scoreValue);
    }
}
