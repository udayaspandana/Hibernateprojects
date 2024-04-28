package com.hql_dynamic_query;

import java.util.List;
import java.util.Scanner;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class hql_Dynamic_Query {
	
	
	public static void main(String[] args)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the price:");
		double price=sc.nextDouble();
		
		// hql dynamic query based on position
		Query q=manager.createQuery("select b from Book b where b.price=?1");
		q.setParameter(1, price);
		
		
		//hql dynamic query based on name
		//query q1=manager.createQuery("select b from Book b where b.price=:n:);
		//q1.setParameter("n",price);
		
		List<Book> books=q.getResultList();
		for(Book b:books)
		{
			System.out.println(b.getId()+" "+b.getBname()+" "+b.getAuthor()+""+b.getPrice());
		}
	}

}
