package mainpackage;

import java.io.FileWriter;

public class File {

	public static void main(String[] args){
		try{
		FileWriter fo=new FileWriter("test.txt");
		fo.write("15,00,000/- 15LPA Fullstack Web Application Developer Job");
		fo.close();
		}
		catch(Exception ex){
			System.out.println(ex.getMessage());
		}
	}
}
