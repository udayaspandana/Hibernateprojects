package com.hibernate_demo;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EstablishConnection {
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("dev");
		
		System.out.println(factory);
		System.out.println("connection established  .....");
	}


}

