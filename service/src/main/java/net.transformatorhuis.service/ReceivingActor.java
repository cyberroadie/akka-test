package net.transformatorhuis.service;

import akka.actor.Actors;
import akka.actor.UntypedActor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Writes received messages to log output
 * User: cyberroadie
 * Date: 18/02/11
 */
public class ReceivingActor extends UntypedActor {

    private static Logger logger = LoggerFactory.getLogger(ReceivingActor.class);

    public ReceivingActor() {
        logger().info("Receiver is starting up...");
        Actors.remote().start("localhost", 2552);
		Actors.remote().register("db:service", getContext());
    }

    @Override
    public void onReceive(Object message) {

        if (message instanceof String) logger.info("Received String message: %s", message);
        else throw new IllegalArgumentException("Unknown message: " + message);
    }

}
