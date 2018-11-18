package com.train.springlearn;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    // create a no-arg constructor
    public CricketCoach() {
        System.out.println("Cricket coach: Insert no arg ");
    }

    @Override
    public String getDailyWorkout() {
        return "Cricket daily work";
    }
    // our setter method
    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return "Crickets " + fortuneService.getFortune();
    }
}
