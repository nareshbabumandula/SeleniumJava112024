package com.oops;

public class Employee {
	
	private int employeeId;
	private String name="Peter";
	private double salary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		if (employeeId>0) {
			this.employeeId = employeeId;
		} else {
			System.out.println("Invalid emp id");
		}
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
		
}
