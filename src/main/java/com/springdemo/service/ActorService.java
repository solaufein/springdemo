// Copyright 2015 Motorola Solutions, Inc.
// All rights Reserved.
// Motorola Solutions Confidential Restricted

package com.springdemo.service;

import com.springdemo.model.Actor;

import java.util.List;

public interface ActorService {
    List<Actor> findByLastName(String lastName);

    Iterable<Actor> findAll();

    void save(Actor actor);

    void deleteAll();

    void delete(Actor actor);
}
