package org.springframework;

public class TrackCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run as hard 5k";
    }
}
