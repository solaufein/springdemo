// Copyright 2015 Motorola Solutions, Inc.
// All rights Reserved.
// Motorola Solutions Confidential Restricted

package com.springdemo.logic;

import org.springframework.core.task.TaskExecutor;

public class ThreadConfiguredByXml {
    private TaskExecutor taskExecutor;
    private ClassWithMethodToFire classWithMethodToFire;

    public ThreadConfiguredByXml(TaskExecutor taskExecutor, ClassWithMethodToFire classWithMethodToFire) {
        this.taskExecutor = taskExecutor;
        this.classWithMethodToFire = classWithMethodToFire;
    }

    public void fire(final String parameter) {
        taskExecutor.execute(() -> classWithMethodToFire.doSomething(parameter));
    }
}
