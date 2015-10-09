// Copyright 2015 Motorola Solutions, Inc.
// All rights Reserved.
// Motorola Solutions Confidential Restricted

package com.springdemo.utils;

import com.springdemo.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyUtils {
    public static void print(Employee employee) {
        System.out.println(employee + "\n");
    }

    public static void comment(String comment) {
        System.out.println(comment);
    }

    public static void newLineWithTopic(String whatItIsAbout) {
        System.out.println("########## " + whatItIsAbout + " ########## ");
    }

    public static ApplicationContext createContextFom(String contextLocation) {
        return new ClassPathXmlApplicationContext(contextLocation);
    }

    public static ApplicationContext createContextFom(Class clazz) {
        return new AnnotationConfigApplicationContext(clazz);
    }
}
