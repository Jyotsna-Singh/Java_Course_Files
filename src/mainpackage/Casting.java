package mainpackage;

public class Casting {

	public static void main(String[] args) {
		CarTruck.Owner="Jyotsna";
		CarTruck cartruck=new CarTruck();
		cartruck.Type="Tigor";
		cartruck.Model=2017;
		cartruck.HasTruck=true;
		cartruck.MilesDrive=10;
		cartruck.Price=500000;
		
		Car mycar = (Car) cartruck;
		System.out.println(mycar.MilesDrive);

	}

}
