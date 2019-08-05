package com.training.Assignment1;

import java.util.Scanner;

public class Employee {

	private String name;
	private int age;
	private float salary;
	private String desig;
	
	
	public Employee(int sal, String desig)
	{
		this.salary = sal;
		this.desig = desig;
		this.getDetails();
		Helper.count++;
		Helper.e.add(this);
	}
	
	public void getDetails()
	{
		int t;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		this.name = sc.next();
		this.age = Helper.readAge.readEmpAge();
			
	}
	public void raiseSalary()
	{
		System.out.println("Enter the amount to be incremented for "+name+ ":");
		Scanner sc= new Scanner(System.in);
		int amt= sc.nextInt();
		this.salary += amt;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", desig=" + desig + "]";
	}
	
}
