package com.spring.framework;

public class BaseballCoach implements Coach {

    // private field for dependency
    private FortuneService fortuneService;


    // Constructor for Dependency Injection
    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
