package com.train.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by T-RAIN on 2018/11/14.
 */
public class myApp {
    public static void main(String[] args) {
////        Coach theCoach = new TrackCoach();
////        System.out.println(theCoach.getDailyWorkout());
//
//        // create a spring container
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
//
//        //retrieve bean from container
//        Coach theCoach = context.getBean("myCoach", Coach.class);
//        Coach coach2  =context.getBean("myCoach2", Coach.class);
//        Coach coach3 = context.getBean("myCricketCoach", Coach.class);
//        System.out.println(theCoach.getDailyWorkout());
//        System.out.println(coach2.getDailyFortune());
//        context.close();

        // load spring configure file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appConfig.xml");
        // retrieve bean
        Coach theCoach = context.getBean("myCricketCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());
        // close the context
        context.close();
    }
}
