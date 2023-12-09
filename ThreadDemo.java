package Thread;

public class ThreadDemo extends Thread {
	    public void run()
	    {
	    	// Task for thread
	    	for(int i=10; i>1;i--) {
	    		
	    		System.out.println(" second thread value of i is:"+i);
	    		
	        try {
	            Thread.sleep(500);
	        }
	        catch (Exception e) {
	        	System.out.println("Exception Caugh Successfully");
	        }
	    }
	    }
	    public static void main(String[] args) {
			ThreadDemo th =new ThreadDemo();
			th.start();
		}
}
	
