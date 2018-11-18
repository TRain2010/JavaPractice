package com.train.springlearn;

/**
 * Created by T-RAIN on 2018/11/16.
 */
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Go go go";
    }
}
