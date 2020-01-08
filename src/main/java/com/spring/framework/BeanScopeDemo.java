package com.spring.framework;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {

    public static void main(String args[]) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
        Coach Coach1 = context.getBean("myCoach", Coach.class);
        Coach Coach2 = context.getBean("myCoach", Coach.class);
    }

}
