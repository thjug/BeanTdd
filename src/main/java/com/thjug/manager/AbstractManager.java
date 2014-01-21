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

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author nuboat
 */
public abstract class AbstractManager<T> {

	private final Class<T> s;

	@PersistenceContext
    private EntityManager em;
	
	public AbstractManager(final Class<T> s) {
		this.s = s;
	}

	protected EntityManager getEntityManager() {
		return em;
	}

	public T findById(final Object id) {
		return em.find(s, id);
	}

	public void insert(final Object entity) {
		em.persist(entity);
	}

	public void update(final Object entity) {
		em.merge(entity);
	}

	public void delete(final Object entity) {
		em.remove(entity);
	}

}
