package com.train.annotations;

import org.springframework.stereotype.Component;

/**
 * Created by T-RAIN on 2018/11/19.
 */
@Component
public class TennisCoach implements Coach {
    private String fortuneService;
    @Override
    public String getDailyWork() {
        return "Play tennis";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService;
    }
}
