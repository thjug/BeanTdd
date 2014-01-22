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
package com.thjug.manager;

import com.thjug.entity.Account;
import com.thjug.test.factory.EJBContainerFactory;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author nuboat
 */
public class AccountManagerNGTest {

	@Test
	public void testFindByIdCaseObjectNotfound() throws Exception {
		final Integer id = 1;
		final AccountManager instance =  EJBContainerFactory.getAccountManager();

		final Account account = instance.findById(id);
		assertNull(account);

		//fail("The test case shoud throw EntityNotFoundException");
	}

//	@Test
//	public void testInsert() throws Exception {
//		System.out.println("insert");
//		Object entity = null;
//		EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//		UserManager instance = (UserManager)container.getContext().lookup("java:global/classes/UserManager");
//		instance.insert(entity);
//		container.close();
//		// TODO review the generated test code and remove the default call to fail.
//		fail("The test case is a prototype.");
//	}
//
//	@Test
//	public void testUpdate() throws Exception {
//		System.out.println("update");
//		Object entity = null;
//		EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//		UserManager instance = (UserManager)container.getContext().lookup("java:global/classes/UserManager");
//		instance.update(entity);
//		container.close();
//		// TODO review the generated test code and remove the default call to fail.
//		fail("The test case is a prototype.");
//	}
//
//	@Test
//	public void testDelete() throws Exception {
//		System.out.println("delete");
//		Object entity = null;
//		EJBContainer container = javax.ejb.embeddable.EJBContainer.createEJBContainer();
//		UserManager instance = (UserManager)container.getContext().lookup("java:global/classes/UserManager");
//		instance.delete(entity);
//		container.close();
//		// TODO review the generated test code and remove the default call to fail.
//		fail("The test case is a prototype.");
//	}

}
