package mainpackage;

public class SwapTwoNumbersWithoutThirdVariable {

	public static void main(String[] args){
		   int x=10;
		   int y=15;
		   //Display Number before swap
		   System.out.println("Numbers before swap");
		   System.out.println("Value of X: " + x);
		   System.out.println("Value of Y: " + y);
		    
		    x=x+y;
		    y=x-y;
		    x=x-y;
		    
		  //Display Number after swap
			   System.out.println("Numbers after swap");
			   System.out.println("Value of X: " + x);
			   System.out.println("Value of Y: " + y);
		}
	
}
