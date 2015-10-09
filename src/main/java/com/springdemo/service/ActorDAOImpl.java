// Copyright 2015 Motorola Solutions, Inc.
// All rights Reserved.
// Motorola Solutions Confidential Restricted

package com.springdemo.service;

import com.springdemo.model.Actor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ActorDAOImpl implements ActorDAO {

    private static final String SELECT_ALL_QUERY = "select a from Actor a";

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Actor> findAllActors() {
        System.out.println("*** Perform DB operation: findAllActors ***");

        Query query = entityManager.createQuery(SELECT_ALL_QUERY);
        List<Actor> clients = (List<Actor>) query.getResultList();
        return clients;
    }

    @Override
    public void save(Actor actor) {
        System.out.println("*** Perform DB operation: saveActor ***");

        entityManager.persist(actor);
    }

    @Override
    public void delete(Actor actor) {
        System.out.println("*** Perform DB operation: removeActor ***");

        entityManager.remove(actor);
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
