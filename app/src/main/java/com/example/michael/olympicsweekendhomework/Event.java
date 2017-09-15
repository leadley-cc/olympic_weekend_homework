package com.example.michael.olympicsweekendhomework;

import com.example.michael.olympicsweekendhomework.competitors.Competitor;
import com.example.michael.olympicsweekendhomework.scorers.Scorer;

import java.util.*;

/**
 * Created by michael on 15/09/2017.
 */

public class Event {
    private String name;
    private List<Competitor> competitors;
    private Scorer scorer;

    public Event(String name, List<Competitor> competitors, Scorer scorer) {
        this.name = name;
        this.competitors = competitors;
        this.scorer = scorer;
    }

    public String getName() {
        return name;
    }

    public List<Competitor> getCompetitors() {
        return competitors;
    }

    public Competitor awardMedals() {
        Competitor winner = null;

        return null;
    }
}
