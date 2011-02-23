package net.transformatorhuis.vaadin;

import org.mortbay.jetty.webapp.WebAppContext;

import java.net.URL;

/**
 * User: cyberroadie
 * Date: 18/02/11
 * http://www.codeproject.com/KB/java/Embedding_Jetty.aspx
 */
public class AppContextBuilder {
    private WebAppContext webAppContext;

	public WebAppContext buildWebAppContext(){
        URL warUrl  = this.getClass().getResource("/");

		webAppContext = new WebAppContext();
		webAppContext.setWar(warUrl.toExternalForm());
		webAppContext.setContextPath("/");
		return webAppContext;
	}
}
