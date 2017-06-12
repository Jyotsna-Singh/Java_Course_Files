package mainpackage;

public class MyRunnable implements Runnable{

	boolean IsRunning=true;
	public MyRunnable(String name){
		System.out.println(name);
	}
	@Override
	public void run(){
		//Code here
		int count = 0;
		
		while(IsRunning){
			System.out.println(count);
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
