package com.contactdatabase;



import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertingConact {
	public static void main(String[] args)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
		Contact c=new Contact();
		c.setId(1);
		c.setName("spandana");
		c.setEmail("Spandanabollineni@gmail.com");
		c.setPassword("Spandana@123");
		
		
		transaction.begin();
		manager.persist(c);
		transaction.commit();
	}


}
