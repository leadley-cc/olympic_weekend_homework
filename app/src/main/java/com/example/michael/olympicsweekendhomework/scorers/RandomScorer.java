package com.example.michael.olympicsweekendhomework.scorers;

import com.example.michael.olympicsweekendhomework.Score;
import com.example.michael.olympicsweekendhomework.competitors.Competitor;

import java.util.Random;

/**
 * Created by michael on 15/09/2017.
 */

public class RandomScorer implements Scorer {
    Random random;

    public RandomScorer() {
        random = new Random();
    }

    @Override
    public Score calculateScore(Competitor competitor) {
        return new Score(competitor, random.nextInt(100));
    }
}
