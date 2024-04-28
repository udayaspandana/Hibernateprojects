package com.hibernate_demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateEmployeeObject {
	public static void main(String[] args)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager  manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Employee e=manager.find(Employee.class,12);
		if(e!=null)
		{
			transaction.begin();
			e.setDesignation("MR");
			e.setSalary(300000);
			manager.merge(e);//it helps to do this updating the values 
			transaction.commit();
		}
		else
		{
			System.out.println("Employee is not present......");
		}
	}


}
