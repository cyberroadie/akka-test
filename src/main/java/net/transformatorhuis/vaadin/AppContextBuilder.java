package net.transformatorhuis.vaadin;

import org.mortbay.jetty.webapp.WebAppContext;

/**
 * User: cyberroadie
 * Date: 18/02/11
 * http://www.codeproject.com/KB/java/Embedding_Jetty.aspx
 */
public class AppContextBuilder {
    private WebAppContext webAppContext;

	public WebAppContext buildWebAppContext(){
		webAppContext = new WebAppContext();
		webAppContext.setDescriptor(webAppContext + "/WEB-INF/web.xml");
		webAppContext.setResourceBase(".");
		webAppContext.setContextPath("/runJetty");
		return webAppContext;
	}
}
