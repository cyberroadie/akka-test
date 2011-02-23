package net.transformatorhuis.service;

import akka.actor.Actor;
import akka.actor.ActorRef;
import akka.actor.Actors;

/**
 * User: cyberroadie
 * Date: 23/02/11
 */
public class Service {

    public static void startAkkaActors() {
        ActorRef receiver = Actors.actorOf((Class<? extends Actor>) ReceivingActor.class);
        receiver.start();
    }

    public static void sendMessages() {
        Sending sending = new Sending();
        for (int i = 0; i < 1000; i++)
            sending.send();
    }
}
