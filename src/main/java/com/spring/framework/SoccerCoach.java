package com.spring.framework;

public class SoccerCoach implements Coach {

    private FortuneService fortuneService;

    public SoccerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "They have working out for last few hours";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
