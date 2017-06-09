package mainpackage;

import java.util.Scanner;

public class MyArray {

	static Scanner reader=new Scanner(System.in);
	public static void main(String[] args) {
		String[] companies = new String[5];
		/*
		jobs[0]="Developer";
		jobs[1]="Tester";
		jobs[2]="QA";
		jobs[3]="Manager";
		jobs[4]="admin";
		*/
		System.out.println("Enter Company Name");
		for(int i=0;i<5;i++)
			companies[i]=reader.nextLine();
		
		
		System.out.println("Print Company Name");
		for(int i=0;i<5;i++){
			System.out.println(companies[i]);
		}
		
	}

}
