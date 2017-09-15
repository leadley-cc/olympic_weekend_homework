package com.example.michael.olympicsweekendhomework;

import com.example.michael.olympicsweekendhomework.competitors.Competitor;

/**
 * Created by michael on 15/09/2017.
 */

public class Score implements Comparable<Score> {
    private Competitor competitor;
    private int scoreValue;

    public Score(Competitor competitor, int scoreValue) {
        this.competitor = competitor;
        this.scoreValue = scoreValue;
    }

    public Competitor getCompetitor() {
        return competitor;
    }

    public int getScoreValue() {
        return scoreValue;
    }

    @Override
    public int compareTo(Score scoreToCompare) {
        if (this.scoreValue > scoreToCompare.getScoreValue()) return 1;
        if (this.scoreValue < scoreToCompare.getScoreValue()) return -1;
        return 0;
    }
}
