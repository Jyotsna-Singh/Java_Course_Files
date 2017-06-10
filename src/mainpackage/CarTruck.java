package mainpackage;

public class CarTruck extends Car {

		boolean HasTruck;
		
		void GetOwner(){
			System.out.println("Owner: "+Owner);
		}

		@Override
		double GetPrice(){
			//different content
			double NewPrice = Price-(MilesDrive*50);
			return NewPrice;
		}
}
