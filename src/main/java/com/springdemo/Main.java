// Copyright 2015 Motorola Solutions, Inc.
// All rights Reserved.
// Motorola Solutions Confidential Restricted

package com.springdemo;

import com.springdemo.config.JavaCodeConfigurationExample;
import com.springdemo.examples.*;
import com.springdemo.examples.Example.ExampleName;
import org.springframework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

import static com.springdemo.examples.Example.ExampleName.*;
import static com.springdemo.utils.MyUtils.createContextFom;

public class Main {

    private static Map<ExampleName, Example> examples;
    private ApplicationContext xmlConfigContext;
    private ApplicationContext javaCodeConfigContext;

    public Main() {
        initializeContexts();
        initializeExamples();
    }

    public static void main(String[] args) {
        Main main = new Main();

//        main.present(example(JAVA_CONFIG));
//        main.present(example(XML_CONFIG_AND_BEANS));
//        main.present(example(SPRING_DATA_AND_TRANSACTIONAL));
//        main.present(example(THREADS));
    }

    private void present(Example example) {
        example.present();
    }

    private static Example example(ExampleName exampleName) {
        return examples.get(exampleName);
    }

    private void initializeContexts() {
        xmlConfigContext = createContextFom("classpath*:spring/applicationContext.xml");
        javaCodeConfigContext = createContextFom(JavaCodeConfigurationExample.class);
    }

    private void initializeExamples() {
        examples = new HashMap<>();
        examples.put(JAVA_CONFIG, new JavaCodeConfigExample(javaCodeConfigContext));
        examples.put(XML_CONFIG_AND_BEANS, new XmlConfigAndBeansExample(xmlConfigContext));
//        examples.put(SPRING_DATA_AND_TRANSACTIONAL, new SpringDataAndJPAExample(xmlConfigContext));
        examples.put(SPRING_DATA_AND_TRANSACTIONAL, new SpringDataAndJPAExample(javaCodeConfigContext));
        examples.put(THREADS, new ThreadsExample(xmlConfigContext));
    }
}
