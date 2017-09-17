package com.example.michael.olympicsweekendhomework;

import com.example.michael.olympicsweekendhomework.competitors.Competitor;
import com.example.michael.olympicsweekendhomework.scorers.Scorer;

import java.util.*;

import static com.example.michael.olympicsweekendhomework.MedalType.*;

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

    public void awardMedals() {
        TreeSet<Score> scores = new TreeSet<>();
        for (Competitor competitor: competitors) {
            scores.add( scorer.calculateScore(competitor) );
        }
        // pollLast gets and removes the highest Score since a TreeSet is in ascending order
        Competitor firstPlace = scores.pollLast().getCompetitor();
        Competitor secondPlace = scores.pollLast().getCompetitor();
        Competitor thirdPlace = scores.pollLast().getCompetitor();

        awardAndRecordMedal(firstPlace, new Medal(GOLD));
        awardAndRecordMedal(secondPlace, new Medal(SILVER));
        awardAndRecordMedal(thirdPlace, new Medal(BRONZE));
    }

    private void awardAndRecordMedal(Competitor competitor, Medal medal) {
        competitor.awardMedal(medal);
        MedalTable.addMedal(competitor.getCountry(), medal);
    }
}
