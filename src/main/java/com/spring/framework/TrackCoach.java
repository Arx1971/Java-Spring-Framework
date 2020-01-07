package com.spring.framework;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run as hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
