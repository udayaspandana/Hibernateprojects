package com.hibernate_demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee table")  // we can specify the teble name and Override it
public class Employee {
	
	@Id
	@Column(name="employee_id")  //in this id ,column was specified for the  insertion in table 
	
	private int id;
	private String name;
	@Column(nullable=false , unique=true) 
	//by default null able value is "true" ---i.e., null value are allowed	private String name;               
	// by default unique is "false if we specify that it as false we have to give unique value
	private double salary;
	@Column(length=10 , name="employee_role" , nullable=false) 
	//here we are specifying the size also and override it to change the designation to employee role
	private String designation;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	}
