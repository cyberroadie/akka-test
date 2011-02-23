package net.transformatorhuis.service;

import akka.actor.ActorRef;
import akka.actor.Actors;
import akka.actor.UntypedActor;

import java.util.UUID;

/**
 * Sends random messages
 * User: cyberroadie
 * Date: 23/02/11
 */
public class Sending {

    private ActorRef actorRef = null;

    public Sending() {
        this.actorRef = Actors.remote().actorFor("db:service", "localhost", 2552);
    }

    public void send() {
        actorRef.sendOneWay("Haai: " + UUID.randomUUID());
    }

}
