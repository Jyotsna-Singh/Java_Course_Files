package mainpackage;

public class CarMain {

	public static void main(String[] args){
		
		Car.Owner="Jyotsna";
		Car car1= new Car("Ford Aspire",2017,600000,50);
		System.out.println("Owner: "+car1.Owner);
		System.out.println("Car Price of "+car1.Type+" is : "+car1.GetPrice());
		
		Car car2= new Car("Suzuki Dzire",2017,600000,20);
		
		System.out.println("Car Price of "+car2.Type+"is : "+car2.GetPrice());
		
		Car car3= new Car();
	}
}
