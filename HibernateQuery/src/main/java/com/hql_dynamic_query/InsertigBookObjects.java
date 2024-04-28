package com.hql_dynamic_query;
import java.util.Scanner;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertigBookObjects {
	
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Book b=new Book();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("how many books you want to add");
		int ch=sc.nextInt();
		for(int i=1;i<=ch;i++)
		{
		
		System.out.println("Enter the Book name:");
		String name=sc.next();
		System.out.println("Enter the Book price:");
		int price=sc.nextInt();
		System.out.println("Enter the Book author:");
		String author=sc.next();
		
		
		b.setBname(name);
		b.setPrice(price);
		b.setAuthor(author);
		
		transaction.begin();
		manager.persist(b);
		transaction.commit();
		
		
		}
		
		

	
	}

}
