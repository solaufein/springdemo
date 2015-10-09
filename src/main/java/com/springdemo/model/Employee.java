// Copyright 2015 Motorola Solutions, Inc.
// All rights Reserved.
// Motorola Solutions Confidential Restricted

package com.springdemo.model;

import java.security.SecureRandom;

public class Employee {
    private String firstName;
    private String lastName;
    private SecureRandom secure;

    public Employee() {
        //    System.out.println("Employee Constructor invoked");
    }

    public Employee(String firstName, String lastName, SecureRandom secure) {
        //    System.out.println("Employee Constructor invoked");
        this.firstName = firstName;
        this.lastName = lastName;
        this.secure = secure;
    }

    public void secureMethodExample() {
        int val = 0;

        if (secure != null){
            val = secure.nextInt();
        }

        System.out.println("secureMethodExample: " + val);
    }

    public void init() {
        System.out.println("My init method invoked");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public SecureRandom getSecure() {
        return secure;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSecure(SecureRandom secure) {
        this.secure = secure;
    }

    /*@PostConstruct
    public void initIt() throws Exception {
        System.out.println("PostConstruct init method: firstName = " + firstName + ", lastName = " + lastName);
    }*/

    /*@PreDestroy
    public void cleanUp() throws Exception {
        System.out.println("Spring Container is destroy! Customer clean up");
    }*/

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", classHashCode='" + this.hashCode() + '\'' +
                ", secure=" + secure +
                '}';
    }
}
