package mainpackage;

public class Car {

	String Type;
	int Model;
	double Price;
	double MilesDrive;
	static String Owner;
	Owners owners;
	public Car(String Type,int Model,double Price,double MilesDrive){
		
		this.Type=Type;
		this.Model=Model;
		this.Price=Price;
		this.MilesDrive=MilesDrive;
		System.out.println("Constructor 1 is Created");
		owners=new Owners();
		owners.FirstName="Jyotsna";
	}
	
	public Car(){
		System.out.println("Constructor 2 is Created");
	}
	
	double GetPrice(){
		double NewPrice = Price-(MilesDrive*100);
		return NewPrice;
	}
	
}
