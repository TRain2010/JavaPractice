package com.train.springlearn;

/**
 * Created by T-RAIN on 2018/11/14.
 */
public class BaseballCoach implements Coach {
    // define a private field for the dependency
    private FortuneService fortuneService;

    // define a constructor for dependency injection;

    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 min on batting practice.";
    }

    @Override
    public String getDailyFortune() {
        // use my fortune service
        return fortuneService.getFortune();
    }
}
