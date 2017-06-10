package mainpackage;

public class FunctionPolymorphism {

	double div(double n1, double n2){
		double r=n1/n2;
		return r;
	}
	
	double div(int n1, int n2){
		double r=n1/n2*2;
		return r;
	}
	
	double div(double n1, int n2){
		double r=n1/n2*3;
		return r;
	}
	
	public static void main(String[] args) {
		double r=new FunctionPolymorphism().div(10.0, 5.0);
		System.out.println("r:" + r);
		r=new FunctionPolymorphism().div(20,9);
		System.out.println("r:" + r);
		r=new FunctionPolymorphism().div(27.1,9);
		System.out.println("r:" + r);

	}

}
