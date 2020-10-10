package com.Employee;

public class Main {

	public static void main(String[] args) {
		
		//Object 1
		Employee emp = new Employee();
		emp.name="saurabh";
		emp.age=23;
		emp.city="chennai";
		System.out.println("This output is from First object ");
		emp.display();
		
		//Object 2
		Employee emp1 = new Employee();
		emp1.name="saurabh";
		emp1.age=23;
		emp1.city="chennai";
		System.out.println("\n This output is from Second object");
		emp1.display();
		
	}

}

 class Employee {
	 
	String name;
	int age;
	String city;
	
	public void display(){
		
		System.out.println("The name is "+ name);
		System.out.println("The age is "+ age);
		System.out.println("The city is "+ city);
	}

}