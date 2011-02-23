package net.transformatorhuis.vaadin;

import org.mortbay.jetty.Handler;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.handler.ContextHandlerCollection;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.servlet.ServletHolder;
import org.vaadin.artur.icepush.ICEPushServlet;

/**
 * User: cyberroadie
 * Date: 22/02/11
 */
public class JettyMain {

     public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        Context context = new Context(server, "/", Context.SESSIONS);


        ServletHolder servletHolder = new ServletHolder(new ICEPushServlet());
        servletHolder.setInitParameter("application", "net.transformatorhuis.vaadin.HelloWorld");
        servletHolder.setInitParameter("widgetset", "net.transformatorhuis.vaadin.MyAppWidgetSet");
        servletHolder.setInitOrder(1);

        context.addServlet(servletHolder, "/viewer/*");
        context.addServlet(servletHolder, "/VAADIN/*");

        server.start();
        server.join();

    }
}
