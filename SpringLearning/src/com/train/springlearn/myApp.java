package com.train.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by T-RAIN on 2018/11/14.
 */
public class myApp {
    public static void main(String[] args) {
//        Coach theCoach = new TrackCoach();
//        System.out.println(theCoach.getDailyWorkout());

        // create a spring container
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");

        //retrieve bean from container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach coach2  =context.getBean("myCoach2", Coach.class);
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(coach2.getDailyFortune());
        context.close();
    }
}
