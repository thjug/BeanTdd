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

import com.thjug.entity.User;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 *
 * @author nuboat
 */
@Stateless
@LocalBean
public class UserManager extends AbstractManager<User>{

	public UserManager() {
		super(User.class);
	}

}
