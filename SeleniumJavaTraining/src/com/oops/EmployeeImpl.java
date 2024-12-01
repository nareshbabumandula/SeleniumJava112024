package com.oops;

public class EmployeeImpl extends Employee{

	public static void main(String[] args) {
		EmployeeImpl emp = new EmployeeImpl();
		emp.setEmployeeId(100);
		System.out.println(emp.getEmployeeId());
		emp.setName("John");
		System.out.println(emp.getName());
		emp.setSalary(5000.00);
		System.out.println(emp.getSalary());
	}

}
