package mainpackage;

public class While_Do {

	public static void main(String[] args) {
		int i=1;
		do
		{//block of code
			if(i % 4==0)
			System.out.println("Mod by 4 is: "+ i);
			
			i=i+1;
		}while(i<100);

	}

}
