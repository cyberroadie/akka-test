package net.transformatorhuis.server;

import net.transformatorhuis.service.Service;
import net.transformatorhuis.vaadin.Presentation;

/**
 * User: cyberroadie
 * Date: 22/02/11
 */
public class Server {

     public static void main(String[] args) throws Exception {
         Presentation.startJetty();
         Service.startAkkaActors();

    }



}
