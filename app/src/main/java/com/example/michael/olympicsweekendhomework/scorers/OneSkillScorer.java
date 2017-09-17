package com.example.michael.olympicsweekendhomework.scorers;

import com.example.michael.olympicsweekendhomework.Score;
import com.example.michael.olympicsweekendhomework.SkillType;
import com.example.michael.olympicsweekendhomework.competitors.Competitor;

/**
 * Created by michael on 17/09/2017.
 */

public class OneSkillScorer implements Scorer {
    SkillType judgedSkill;

    public OneSkillScorer(SkillType skill) {
        this.judgedSkill = skill;
    }

    @Override
    public Score calculateScore(Competitor competitor) {
        int scoreValue = competitor.getSkill(judgedSkill);
        return new Score(competitor, scoreValue);
    }
}
