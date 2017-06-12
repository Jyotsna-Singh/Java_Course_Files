package mainpackage;

public class MyThread extends Thread{

	boolean IsRunning=true;
	String name;
	public MyThread(String name){
		System.out.println(name);
	}
	@Override
	public void run(){
		display();
	}
	
	void display(){
		//Code here
				int count = 0;
				
				while(count<10){
					System.out.println(name+ ":"+count);
					count++;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	}

}
