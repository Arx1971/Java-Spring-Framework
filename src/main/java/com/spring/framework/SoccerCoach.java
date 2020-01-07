package com.spring.framework;

public class SoccerCoach implements Coach {

    public String getDailyWorkout() {
        return "They have working out for last few hours";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }

}
