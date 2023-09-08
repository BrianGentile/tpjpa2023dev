package jpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {

			Professional pro = new Professional();
			pro.setName("grauss ambar");
			Account proAccount = new Account();
			pro.setAccount(proAccount);
			manager.persist(pro);

		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();

		manager.close();
		factory.close();
	}

}
