// Copyright 2015 Motorola Solutions, Inc.
// All rights Reserved.
// Motorola Solutions Confidential Restricted

package com.springdemo.config;

import com.springdemo.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.security.SecureRandom;

@Configuration
//@Import(value = SomeOtherConfiguration.class)
//@ImportResource("classpath*:spring/applicationContext.xml")
@EnableJpaRepositories(basePackages = "com.springdemo.service")
@EnableTransactionManagement
//@ComponentScan(basePackages = "com.springdemo")
public class JavaCodeConfigurationExample {

    @Bean(name = "employee_javacode_config")
    @Scope(value = "prototype")
    public Employee employee() {
        return new Employee("Steve", "Jops", secureRandom());
    }

    @Bean(name = "secure_random_singleton")
    public SecureRandom secureRandom() {
        return new SecureRandom();
    }
}