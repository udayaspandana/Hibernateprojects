package com.hibernate_demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UpdateStudentObject {
	
	public static void main(String[] args)
	{
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		EntityManager  manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Student s=manager.find(Student.class,1);
		if(s!=null)
		{
			transaction.begin();
			s.setAddress("delhi");
			s.setAge(30);
			manager.merge(s);//it helps to do this updating the values 
			transaction.commit();
		}
		else
		{
			System.out.println("Student is not present......");
		}
	}

}
