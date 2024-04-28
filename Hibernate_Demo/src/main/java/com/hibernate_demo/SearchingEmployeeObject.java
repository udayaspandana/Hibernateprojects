package com.hibernate_demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class SearchingEmployeeObject {
	public static void main(String[] args)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
				
		Employee e=manager.find(Employee.class,12); // search for an object(name) in primary key
		
		if(e!=null)
		{
			System.out.println(e.getId()+" "+e.getName());
		}
		else
		{
			System.out.println("Employee is not present........");
		}
	}

}
