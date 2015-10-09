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
public class ActorServiceImpl implements ActorService {

    @Autowired
    ActorRepository actorRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Actor> findByLastName(String lastName) {
        return actorRepository.findByLastName(lastName);
    }

    @Transactional(readOnly = true)
    @Override
    public Iterable<Actor> findAll() {
        return actorRepository.findAll();
    }

    @Transactional
    @Override
    public void save(Actor actor) {
        actorRepository.save(actor);
    }

    @Transactional
    @Override
    public void deleteAll() {
        actorRepository.deleteAll();
    }

    @Transactional
    @Override
    public void delete(Actor actor) {
        actorRepository.delete(actor);
    }

    public void setActorRepository(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }
}
