package com.hibernate_demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class MainInsertingObject {
	
	public static void main(String[] args)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager  manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Student s=new Student();
		s.setStudent_id(1);
		s.setName("ram");
		s.setAge(23);
		s.setAddress("banglore");
		
		
		
		transaction.begin();
		manager.persist(s);
		transaction.commit();
		
				
				
	}

}
