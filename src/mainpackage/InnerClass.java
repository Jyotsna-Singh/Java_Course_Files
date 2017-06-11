package mainpackage;

public class InnerClass {
	
	static class Animal{
		String Name;
		String Voice;
	}
	
	public static void main(String[] args){
		Animal animal = new Animal();
		animal.Name="Cow";
		animal.Voice="Moo";
		System.out.println(animal.Name);
	}
	
	void call(){
		
		
	}

}
