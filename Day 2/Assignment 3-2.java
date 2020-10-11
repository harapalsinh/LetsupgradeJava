package com.Employee;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		//ASSIGNMENT DAY 3
		String name;
		int dob,mob,yob,monthly_salary,tax;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Your name");
		name=sc.nextLine();	
		
		System.out.println("Enter Your Day of birth");
		dob=sc.nextInt();
		
		System.out.println("Enter Your Month of birth in number from 1 to 12");
		mob=sc.nextInt();
		
		System.out.println("Enter Your Year of birth in number");
		yob=sc.nextInt();
		
		System.out.println("Enter Your Monthly Salary");
		monthly_salary =sc.nextInt();
		int age = 2020-yob;
		
		int annual_salary = (monthly_salary * 12);
		
		if(annual_salary >=500000) {
			tax= (annual_salary * 20) / 100;
			System.out.println("Hello, " +name+ " , Your age is " + age + ", annual salary is " +annual_salary+ ", and Tax amount is "+ tax);
		}
		else if(annual_salary >=400000) {
			tax= (annual_salary * 15) / 100;
			System.out.println("Hello, " +name+ " , Your age is " + age + ", annual salary is " +annual_salary+ ", and Tax amount is "+ tax);
		}
		else if(annual_salary >=300000) {
			tax= (annual_salary * 10) / 100;
			System.out.println("Hello, " +name+ " , Your age is " + age + ", annual salary is " +annual_salary+ ", and Tax amount is "+ tax);
		}
		else if(annual_salary >=200000) {
			tax= (annual_salary * 5) / 100;
			System.out.println("Hello, " +name+ " , Your age is " + age + ", annual salary is " +annual_salary+ ", and Tax is "+ tax);
		}
		else {
			//tax= (annual_salary * 15) / 100;
			System.out.println("Hello, " +name+ " , Your age is " + age + ", annual salary is " +annual_salary+ ", and Tax is not need to pay");
		}
		
	}

}