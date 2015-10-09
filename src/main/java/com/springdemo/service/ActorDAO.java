// Copyright 2015 Motorola Solutions, Inc.
// All rights Reserved.
// Motorola Solutions Confidential Restricted

package com.springdemo.service;

import com.springdemo.model.Actor;

import java.util.List;

public interface ActorDAO {
    List<Actor> findAllActors();

    void save(Actor actor);

    void delete(Actor actor);
}
