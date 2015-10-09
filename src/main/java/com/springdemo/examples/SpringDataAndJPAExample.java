// Copyright 2015 Motorola Solutions, Inc.
// All rights Reserved.
// Motorola Solutions Confidential Restricted

package com.springdemo.examples;

import com.springdemo.model.Actor;
import com.springdemo.service.ActorService;
import org.springframework.context.ApplicationContext;

import static com.springdemo.utils.MyUtils.comment;
import static com.springdemo.utils.MyUtils.newLineWithTopic;

public class SpringDataAndJPAExample implements Example {
    private ApplicationContext context;

    public SpringDataAndJPAExample(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void present() {
        newLineWithTopic("ActorService. Spring Data JPA & Transactional Example: ");
        ActorService actorService = context.getBean("actorServiceImpl", ActorService.class);

        comment("Inserting new Actor...");
        actorService.save(new Actor("John", "Novak"));

        comment("Display all Actors...");
        actorService.findAll().forEach(System.out::println);

        comment("Delete all Actors...");
        actorService.deleteAll();
    }
}
