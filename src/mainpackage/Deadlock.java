package mainpackage;

public class Deadlock {

	public static void main(String[] args) {
		final String Passenger1="Tsna";
		final String Passenger2="Pack";
		Thread bus1=new Thread(){
			@Override
			public void run(){
				synchronized (Passenger1){
					System.out.println("P1 locked in Bus 1");
					try{
						Thread.sleep(1000);
					}catch(Exception ex){
						synchronized(Passenger2){
							System.out.println("P2 is locked in Bus 1");
						}
					}
				}
				
			}
		};
		
		Thread bus2=new Thread(){
			@Override
			public void run(){
				synchronized (Passenger2){
					System.out.println("P2 locked in Bus 2");
					try{
						Thread.sleep(1000);
					}catch(Exception ex){
						synchronized(Passenger1){
							System.out.println("P1 is locked in Bus 2");
						}
					}
				}
				
			}
		};
		bus1.start();
		bus2.start();

	}

}
