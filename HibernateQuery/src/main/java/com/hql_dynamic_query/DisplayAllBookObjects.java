package com.hql_dynamic_query;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class DisplayAllBookObjects {
	
	public static void main(String[] args)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		
		
		Query q=manager.createQuery("select b from Book b");
		List<Book> b=q.getResultList();//execute query
		
		for(Book b1:b)
		{ 
			System.out.println(b1.getId()+" "+b1.getBname()+" "+b1.getAuthor()+""+b1.getPrice());
			System.out.println("----------------------");
		}
	}

}
