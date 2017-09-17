package com.example.michael.olympicsweekendhomework;

import java.util.*;

/**
 * Created by michael on 17/09/2017.
 */

public final class MedalTable {
    private static Map<String, List<Medal>> table = new HashMap<>();

    private MedalTable() {}

    public static void reset() {
        table = new HashMap<>();
    }

    public static void addMedal(String country, Medal medal) {
        if (table.containsKey(country)) {
            table.get(country).add(medal);
        } else {
            List<Medal> medalList = new ArrayList<>();
            medalList.add(medal);
            table.put(country, medalList);
        }
    }

    public static List<Medal> getMedalsForCountry(String country) {
        if (table.containsKey(country)) {
            List<Medal> medalList = table.get(country);
            return new ArrayList<>(medalList);
        }
        return null;
    }

    public static int getPointsForCountry(String country) {
        int totalPoints = 0;
        if (table.containsKey(country)) {
            List<Medal> medalList = table.get(country);
            for (Medal medal : medalList) {
                totalPoints += medal.getPoints();
            }
        }
        return totalPoints;
    }
}
