package com.tnsif.jpaintro;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAIUtil {
	private static EntityManagerFactory factory;
	private static EntityManager entityManager;
	static {
		factory = Persistence.createEntityManagerFactory("PUnit");

	}

	public static EntityManager getEntityManager() {
		if (entityManager == null || !entityManager.isOpen())
			entityManager = factory.createEntityManager();
		return entityManager;
	}

}
