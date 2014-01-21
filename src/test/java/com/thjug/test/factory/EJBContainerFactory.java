/*
 * Attribution
 * CC BY
 * This license lets others distribute, remix, tweak,
 * and build upon your work, even commercially,
 * as long as they credit you for the original creation.
 * This is the most accommodating of licenses offered.
 * Recommended for maximum dissemination and use of licensed materials.
 *
 * http://creativecommons.org/licenses/by/3.0/
 * http://creativecommons.org/licenses/by/3.0/legalcode
 */
package com.thjug.test.factory;

import java.util.HashMap;
import java.util.Map;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.NamingException;

import com.thjug.facade.HelloBean;
import com.thjug.manager.UserManager;
import javax.naming.Context;
/**
 *
 * @author nuboat
 */
public class EJBContainerFactory {

	private static EJBContainer container = null;

	public static EJBContainer getEJBContainer() {
		if (container == null) {
			final Map<String, Object> properties = new HashMap<>();
//			properties.put(
//					"org.glassfish.ejb.embedded.glassfish.installation.root",
//					"c:\\Program Files\\glassfish-4.0\\glassfish");
			container = EJBContainer.createEJBContainer(properties);
		}
		return container;
	}

	public static Context getContext() {
		return getEJBContainer().getContext();
	}

	public static void released() {
		if (container != null) {
			container.close();
		}
	}

	public static HelloBean getHelloBean() throws NamingException {
		return (HelloBean) getContext().lookup("java:global/classes/HelloBean");
	}
	
	public static UserManager getUserManager() throws NamingException {
		return (UserManager) getContext().lookup("java:global/classes/UserManager");
	}

	private EJBContainerFactory() {

	}

}
