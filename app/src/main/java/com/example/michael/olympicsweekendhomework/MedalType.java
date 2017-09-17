package com.example.michael.olympicsweekendhomework;

/**
 * Created by michael on 15/09/2017.
 */

public enum MedalType {
    GOLD(3),
    SILVER(2),
    BRONZE(1);

    private int points;

    MedalType(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }
}
