
	package com.hql_dynamic_query;


import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class hql_Dynamic_queryForUpdation {
	
	public static void main(String[] args)
	{
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price:");
		double price=sc.nextDouble();
		System.out.println("Enter the author:");
		String author=sc.next();
		System.out.println("Enter the name:");
		String name=sc.next();
		
		
		Query q=manager.createQuery("update  Book b set b.price=?1,b.author=?2 where b.bname=?3");
		q.setParameter(1, price);
		q.setParameter(2,author);
		q.setParameter(3,name);
		
		
		transaction.begin();
		q.executeUpdate();
		transaction.commit();
		
		
		
		
		
		
		
		
	}

}
