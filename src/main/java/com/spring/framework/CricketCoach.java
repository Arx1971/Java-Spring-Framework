package com.spring.framework;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Inside the: setTeam");
        this.team = team;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("Inside the: setEmailAddress");
        this.emailAddress = emailAddress;
    }

    public CricketCoach() {
        System.out.println("CricketCoach: inside no-arg constructor");
    }

    public FortuneService getFortuneService() {
        return fortuneService;
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("CricketCoach: Setter Method");
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
