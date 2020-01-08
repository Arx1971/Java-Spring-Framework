package com.spring.framework;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run as hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // bean life cycle init method

    public void initMethod() {
        System.out.println("This is Init Method");
    }

    // bean life cycle destroy method

    public void destroyMethod() {
        System.out.println("This is Destroy Method");
    }

}
