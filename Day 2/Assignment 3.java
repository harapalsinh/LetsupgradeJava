package com.Employee;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) 
	{
		//ASSIGNMENT DAY 3
		int mark1, mark2, mark3, mark4,mark5;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter marks of 5 subject out of 100 line by line");

		mark1=sc.nextInt();
		mark2=sc.nextInt();
		mark3=sc.nextInt();
		mark4=sc.nextInt();
		mark5=sc.nextInt();
		int fullmark= 500;
		int total= mark1 + mark2 + mark3 + mark4 + mark5;
		
		float perentage = (total  * 100) / fullmark;
		
		if(perentage >= 90.0) {
			System.out.println("You have A grade with "+ perentage + "%");	
		}
		else if(perentage < 90.0 && perentage >= 80.0) {
			System.out.println("You have B grade with "+ perentage + "%");
		}
		else if(perentage < 80.0 && perentage >= 70.0) {
			System.out.println("You have C grade with "+ perentage + "%");
		}
		else if(perentage < 70.0 && perentage >= 60.0) {
			System.out.println("You have C grade with "+ perentage + "%");
		}
		else if(perentage < 60.0) {
			System.out.println("You have D grade with "+ perentage + "%");
		}
	}

}