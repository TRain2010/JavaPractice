package com.train.annotations;

import org.springframework.stereotype.Component;

/**
 * Created by T-RAIN on 2018/11/19.
 */
@Component
public class HappyFortuneService implements FortuneService {

    private String fortuneService;
    @Override
    public String getFortune() {
        return fortuneService;
    }
}
