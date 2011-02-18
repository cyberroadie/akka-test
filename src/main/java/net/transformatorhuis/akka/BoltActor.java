package net.transformatorhuis.akka;

import akka.actor.UntypedActor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User: cyberroadie
 * Date: 18/02/11
 */
public class BoltActor extends UntypedActor {

    private static Logger logger = LoggerFactory.getLogger(BoltActor.class);

    @Override
    public void onReceive(Object message) {
        if (message instanceof String) logger.info("Received String message: %s", message);
        else throw new IllegalArgumentException("Unknown message: " + message);
    }

}
