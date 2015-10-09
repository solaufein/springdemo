// Copyright 2015 Motorola Solutions, Inc.
// All rights Reserved.
// Motorola Solutions Confidential Restricted

package com.springdemo.logic;

import com.springdemo.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrintThread extends Thread {

    @Autowired
    @Qualifier(value = "actorServiceImpl")
    private ActorService actorService;

    @Override
    public void run() {

        System.out.println("First Thread is running");
        System.out.println("Injected ActorService bean -> findAllActors: " + actorService.findAll());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("First Thread is running");
    }

    public void setActorService(ActorService actorService) {
        this.actorService = actorService;
    }
}