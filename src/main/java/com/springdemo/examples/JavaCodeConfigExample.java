// Copyright 2015 Motorola Solutions, Inc.
// All rights Reserved.
// Motorola Solutions Confidential Restricted

package com.springdemo.examples;

import com.springdemo.model.Employee;
import org.springframework.context.ApplicationContext;

import static com.springdemo.utils.MyUtils.newLineWithTopic;
import static com.springdemo.utils.MyUtils.print;

public class JavaCodeConfigExample implements Example {

    private ApplicationContext context;

    public JavaCodeConfigExample(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void present() {
        newLineWithTopic("Context JavaCode Bean(prototype) Configuration Example: ");
        Employee employee = context.getBean("employee_javacode_config", Employee.class);
        print(employee);

        Employee employee2 = context.getBean("employee_javacode_config", Employee.class);
        print(employee2);
    }
}