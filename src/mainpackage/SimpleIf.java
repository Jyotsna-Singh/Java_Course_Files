package mainpackage;

import java.util.Scanner;

public class SimpleIf {

	static Scanner reader=new Scanner(System.in);
	public static void main(String[] args){
		
		int grade=reader.nextInt();
		
		if(grade>=90)
		{
			System.out.println("Grade is A");
		}
		else
		{
			System.out.println("End the grading");
		}
	}
}
