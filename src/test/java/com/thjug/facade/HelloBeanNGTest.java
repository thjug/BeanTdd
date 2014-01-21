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
package com.thjug.facade;

import com.thjug.test.factory.EJBContainerFactory;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author nuboat
 */
public class HelloBeanNGTest {

	@Test
	public void testHelloBean() throws Exception {
		final String name = "yoyo";

		final HelloBean instance = EJBContainerFactory.getHelloBean();

		final boolean expect = true;
		final String result = instance.hello(name);

		assertEquals(result.startsWith("Hello"), expect);
	}

}
