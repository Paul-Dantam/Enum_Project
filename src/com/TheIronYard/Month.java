package com.TheIronYard;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Month {


    JANUARY("January"),
    FEBRUARY("February"),
    MARCH("March"),
    APRIL("April"),
    MAY("May"),
    JUNE("June"),
    JULY("July"),
    AUGUST("August"),
    SEPTEMBER("September"),
    OCTOBER("October"),
    NOVEMBER("November"),
    DECEMBER("December");


    private String englishName;

    Month(String englishName) {
        this.englishName = englishName;
    }

    @JsonValue
    public String getEnglishName() {
        return englishName;
    }
}
