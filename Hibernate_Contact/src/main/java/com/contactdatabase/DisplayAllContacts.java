package com.contactdatabase;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class DisplayAllContacts {

	public static void main(String[] args) {
		
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager  manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
		
		Query q=manager.createQuery("select c from Contact c");
		
		List<Contact> c=q.getResultList();//execute query
		for(Contact c1:c)
		{ 
			System.out.println(c1.getId()+" "+c1.getName()+" "+c1.getEmail()+""+c1.getPassword());
			System.out.println("----------------------");
		}

	}
}
