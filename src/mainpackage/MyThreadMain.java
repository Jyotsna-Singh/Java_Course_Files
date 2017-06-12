package mainpackage;

public class MyThreadMain {

	public static void main(String[] args) throws InterruptedException {
		MyThread t = new MyThread("t1");
		t.start();
		//t.wait();
		//t.join();
		MyThread t2 = new MyThread("t2");
		t2.start();
		System.out.println("Thread is working");
		
		//Thread.sleep(6000);
		//t.IsRunning=false;
		//runnable
		
		MyRunnable r=new MyRunnable("Runnable");
		Thread tr = new Thread(r);
		tr.start();
	}

}
