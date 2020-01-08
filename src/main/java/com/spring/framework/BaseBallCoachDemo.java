package com.spring.framework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseBallCoachDemo {

    public static void main(String args[]) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BaseballCoach theCoach = context.getBean("myBaseBallCoach", BaseballCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        context.close();


    }

}
