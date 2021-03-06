package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

        // retrieve bean from the container
        Coach theCoach = context.getBean("myCoach", Coach.class);

        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        // check if they are the same
        boolean res = (theCoach == alphaCoach);
        System.out.println(res);
        System.out.println("\nMemory location for theCoach " + theCoach);
        System.out.println("\nMemory location for alphaCoach " + alphaCoach);

        // close the context
        context.close();
    }
}
