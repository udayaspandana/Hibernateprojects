package com.contactdatabase;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteContactBasedNames {
	
	public static void main(String[] args)
	{
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager  manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Contact c=manager.find(Contact.class,"spandana");
		if(c!=null)
		{
			transaction.begin();
			manager.remove(c);
			transaction.commit();
		}
		else
		{
			System.out.println("Contact is not present");
		}
		
	} 
	
}
