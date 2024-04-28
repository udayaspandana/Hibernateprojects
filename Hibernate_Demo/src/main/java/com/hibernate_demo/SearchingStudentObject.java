package com.hibernate_demo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class SearchingStudentObject {

public static void main(String[] args)
{
	EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
	EntityManager manager=factory.createEntityManager();
			
	Student s=manager.find(Student.class,1); // search for an object(name) in primary key
	
	if(s!=null)
	{
		System.out.println(s.getStudent_id()+" "+s.getName());
	}
	else
	{
		System.out.println("Student is not present........");
	}
}
}
