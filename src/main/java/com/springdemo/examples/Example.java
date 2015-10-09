// Copyright 2015 Motorola Solutions, Inc.
// All rights Reserved.
// Motorola Solutions Confidential Restricted

package com.springdemo.examples;

public interface Example {

    enum ExampleName {
        THREADS, JAVA_CONFIG, XML_CONFIG_AND_BEANS, SPRING_DATA_AND_TRANSACTIONAL
    }

    void present();
}