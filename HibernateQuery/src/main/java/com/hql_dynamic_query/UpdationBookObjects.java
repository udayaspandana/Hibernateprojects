package com.hql_dynamic_query;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class UpdationBookObjects {

	
	public static void main(String[] args)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
		Query q=manager.createQuery("update Book b set b.price=90 where b.id=1");
		
		transaction.begin();
		q.executeUpdate();
		transaction.commit();
		
	}
}
