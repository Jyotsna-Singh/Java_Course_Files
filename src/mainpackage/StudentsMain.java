package mainpackage;

public class StudentsMain {

	public static void main(String[] args){
		Students st=new Students("Jyotsna",Gender.Female);
		System.out.println("Name: "+ st.FirstName);
		System.out.println("Gender: "+ st.gender);
	}
}
