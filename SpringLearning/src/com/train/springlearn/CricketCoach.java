package com.train.springlearn;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String dailyWork;
    // create a no-arg constructor
    public CricketCoach() {
        System.out.println("Cricket coach: Insert no arg ");
    }

    public void setDailyWork(String dailyWork) {
        this.dailyWork = dailyWork;
    }

    @Override
    public String getDailyWorkout() {
        return dailyWork;
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
