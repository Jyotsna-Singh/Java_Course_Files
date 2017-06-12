package mainpackage;

import java.util.ArrayList;

public class MyCollections {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("Developer");
		ar.add("Manager");
		ar.add("Tester");
		ar.add("Admin");
		ar.remove(2);
		for(String st: ar)
		System.out.println(st);

		//Array Class
		ArrayList<employee> emp= new ArrayList<employee>();
		emp.add(new employee("Jyotsna", 23));
		emp.add(new employee("Luna", 2));
		emp.add(new employee("Kiana", 3));
		
		for(employee st: emp)
			System.out.println("Employee name: "+st.name+" Employee age: " + st.age);
	}
	
	static class employee
	{
		String name;
		int age;
		public employee(String name, int age){
			this.name=name;
			this.age=age;
		}
	}

}
