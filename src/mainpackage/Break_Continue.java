package mainpackage;

public class Break_Continue {
public static void main(String[] args) {
		
		for(int i=1;i<100;i+=1)
		{//block of code
			if(i % 4==0)
				continue;
			System.out.println("Count is: "+ i);
			System.out.println("Count is printed");
		}

	}

}
