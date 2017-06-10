package mainpackage;

public class FunctionSimple {

	float sum(float n1, float n2){
		float sum=n1+n2;
		return sum;
	}
	
	
	void Draw(){
		
			for (int i=0; i<10; i++){
				System.out.println("*");
				for(int j=i; j>0;j--)
					System.out.print("-");
			}

		
	}
	
	public static void main(String[] args) {
		
		float r = new FunctionSimple().sum(3,9);
		System.out.println(r);
		
		new FunctionSimple().Draw();
		new FunctionSimple().Draw();
		new FunctionSimple().Draw();
		new FunctionSimple().Draw();

	}

}
