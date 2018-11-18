package com.train.springlearn;

/**
 * Created by T-RAIN on 2018/11/14.
 */
public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout()  {
        return "Run 4k";
    }

    @Override
    public String getDailyFortune() {
        return "Track Coach: " + fortuneService.getFortune();
    }

}
