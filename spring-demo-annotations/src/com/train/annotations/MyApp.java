package com.train.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by T-RAIN on 2018/11/19.
 */
public class MyApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
        Coach theCoach = context.getBean("tennisCoach",Coach.class);
        System.out.println(theCoach.getDailyWork());
        context.close();
    }


}
