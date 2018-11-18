package com.train.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by T-RAIN on 2018/11/15.
 */
public class HelloSpringApp {
    public static void main(String[] args) {
        // load spring configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appConfig.xml");
        // retrieve bean from container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        // call method on the bean
        System.out.println(theCoach.getDailyWorkout());
        //close the context
        context.close();
    }
}
