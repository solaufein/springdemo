// Copyright 2015 Motorola Solutions, Inc.
// All rights Reserved.
// Motorola Solutions Confidential Restricted

package com.springdemo.examples;

import com.springdemo.model.Actor;
import com.springdemo.model.Employee;
import com.springdemo.service.ActorService;
import org.springframework.context.ApplicationContext;

import java.util.stream.Stream;

import static com.springdemo.utils.MyUtils.newLineWithTopic;
import static com.springdemo.utils.MyUtils.print;

public class XmlConfigAndBeansExample implements Example {

    private ApplicationContext context;

    public XmlConfigAndBeansExample(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void present() {
        firstExample();

        secondExample();

        thirdExample();
    }

    private void firstExample() {
        newLineWithTopic("ActorService & old DAO implementation Example: ");
        ActorService actorService = context.getBean("actorServiceUsingDAO", ActorService.class);
        actorService.save(new Actor("Hanna", "Saw"));

        Iterable<Actor> actors = actorService.findAll();
        Stream.of(actors).forEach(System.out::println);

        actorService.deleteAll();
        System.out.println();
    }

    private void secondExample() {
        newLineWithTopic("Constructor Arg Injection Bean Example: ");
        Employee employee2 = context.getBean("employee2", Employee.class);
        print(employee2);
    }

    private void thirdExample() {
        newLineWithTopic("Setter Injection Bean Example: ");
        Employee employeeNewInstance = context.getBean("employee", Employee.class);
        print(employeeNewInstance);
    }
}
