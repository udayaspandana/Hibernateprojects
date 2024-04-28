package com.hibernate_demo;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class InsertingEmployeeObject {
	
	public static void main(String[] args)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		
		Employee e=new Employee();
		e.setId(12);
		e.setName("ram");
		e.setSalary(12000);
		e.setDesignation("HR");
		
		
		transaction.begin();
		manager.persist(e);
		transaction.commit();
	}

}
