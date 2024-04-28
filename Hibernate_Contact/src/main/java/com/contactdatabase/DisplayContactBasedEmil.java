package com.contactdatabase;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class DisplayContactBasedEmil {
	
	public static void main(String[] args) {
	
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager  manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the email:");
	String email=sc.next();
	
	Query q=manager.createQuery("select c from Contact c where c.email=:n");
	q.setParameter("n", email);
	
   	List<Contact> c2=q.getResultList();
	for(Contact c1:c2)
	{
		System.out.println(c1.getId()+" "+c1.getName()+" "+c1.getEmail()+""+c1.getPassword());
	}

	}
}
