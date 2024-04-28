package com.hibernate_demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DeleteEmployeeObject {
	public static void main(String[] args) {
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager  manager=factory.createEntityManager();
	EntityTransaction transaction=manager.getTransaction();
	
	Employee e=manager.find(Employee.class,1);
	if(e!=null)
	{
		transaction.begin();
		manager.remove(e);
		transaction.commit();
	}
	else
	{
		System.out.println("Employee is not present");
	}

}

}
