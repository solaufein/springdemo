// Copyright 2015 Motorola Solutions, Inc.
// All rights Reserved.
// Motorola Solutions Confidential Restricted

package com.springdemo.service;

import com.springdemo.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ActorServiceUsingDAO implements ActorService {

    @Autowired
    ActorDAO actorDAO;

    @Override
    public List<Actor> findByLastName(String lastName) {
        return null;
    }

    @Override
    public Iterable<Actor> findAll() {
        return actorDAO.findAllActors();
    }

    @Override
    public void save(Actor actor) {
        actorDAO.save(actor);
    }

    @Override
    public void deleteAll() {
        findAll().forEach(this::delete);
    }

    @Override
    public void delete(Actor actor) {
        actorDAO.delete(actor);
    }

    public void setActorDAO(ActorDAO actorDAO) {
        this.actorDAO = actorDAO;
    }
}
