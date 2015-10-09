// Copyright 2015 Motorola Solutions, Inc.
// All rights Reserved.
// Motorola Solutions Confidential Restricted

package com.springdemo.examples;

import com.springdemo.logic.PrintThread;
import com.springdemo.logic.ThreadConfiguredByXml;
import org.springframework.context.ApplicationContext;

import static com.springdemo.utils.MyUtils.newLineWithTopic;

public class ThreadsExample implements Example {

    private ApplicationContext context;

    public ThreadsExample(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void present() {
        firstExample();

        secondExample();
    }

    private void secondExample() {
        newLineWithTopic("(Second) Thread xml-way Example: ");
        ThreadConfiguredByXml threadConfiguredByXml = context.getBean("threadConfiguredByXml", ThreadConfiguredByXml.class);
        threadConfiguredByXml.fire("Second Thread example");
    }

    private void firstExample() {
        newLineWithTopic("(First) Thread autowired Example: ");
        PrintThread printThread = context.getBean("printThread", PrintThread.class);
        printThread.start();
        join(printThread);
    }

    private void join(PrintThread printThread) {
        try {
            printThread.join();
        } catch (InterruptedException e) {
            System.out.println("Error while joining First thread");
        }
    }
}
