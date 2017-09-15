package com.example.michael.olympicsweekendhomework.scorers;

import com.example.michael.olympicsweekendhomework.Score;
import com.example.michael.olympicsweekendhomework.competitors.Competitor;

/**
 * Created by michael on 15/09/2017.
 */

public interface Scorer {
    Score calculateScore(Competitor competitor);
}
