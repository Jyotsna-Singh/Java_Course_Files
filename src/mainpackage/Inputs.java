package mainpackage;

import java.util.Scanner;

public class Inputs {

	static Scanner reader=new Scanner(System.in);
	static Scanner reader1=new Scanner(System.in);	
	public static void main(String[] args){
		System.out.println("Enter Name: ");
		String name=reader.nextLine();
		System.out.println("Enter Age: ");
		int age=reader.nextInt();
		System.out.println("Enter Salary: ");
		double Salary=reader.nextDouble();
		System.out.println("Gender: ");
		String input = reader1.nextLine();
		char Gender=input.charAt(0);
		
		
		System.out.println(name);
	
		System.out.println("age: "+age);
	
		System.out.println("Salary: "+ Salary);
	
		System.out.println("Gender: "+Gender);
	}
	
}
