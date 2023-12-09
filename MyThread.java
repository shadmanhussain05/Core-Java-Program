package Thread;

public class MyThread implements Runnable {
public void run() {
	// task for Thread
	for(int i =1; i<=10; i++) {
		System.out.println("Values of i is:"+i);
		try{
			Thread.sleep(500);
			
		}catch(Exception e){
				
			}
		}
}
public static void main(String[] args) {
	MyThread t =new MyThread();
	Thread thr =new Thread(t);
	ThreadDemo t2 =new ThreadDemo();
	thr.start();
	t2.start();
}
}
