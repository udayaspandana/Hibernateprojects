 package com.contactdatabase;

import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class UpdateBasedOnId {
	
	public static void main(String[] args)
	{
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager  manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println("Enter the email:");
		String email=sc.next();
		System.out.println("Enter the password:");
		String password=sc.next();

		System.out.println("enter the id to update:");
		int id=sc.nextInt();
		
		
		
		Query q=manager.createQuery("update  Contact c set c.name=?1,c.email=?2 ,c.password=?3 where id=?4");
		q.setParameter(1,name);
		q.setParameter(2,email);
		q.setParameter(3,password);
		q.setParameter(4,id);
		
		
		transaction.begin();
		q.executeUpdate();
		transaction.commit();
		
	}

}
