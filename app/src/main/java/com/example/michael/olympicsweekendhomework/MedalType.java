package com.example.michael.olympicsweekendhomework;

/**
 * Created by michael on 15/09/2017.
 */

enum MedalType {
    GOLD(1),
    SILVER(2),
    BRONZE(3);

    private int place;

    MedalType(int place) {
        this.place = place;
    }

    public int getPlace() {
        return place;
    }
}
