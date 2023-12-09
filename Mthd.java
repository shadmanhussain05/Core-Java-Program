package Thread;


class UserThread extends Thread{
	public void run() {
		
		//Task for thread...
		System.out.println("this is user define Thread");
	}
}

public class Mthd {
public static void main(String[] args) {
	System.out.println("program started");
	int x = 45+98;
	System.out.println("Sum of :"+x);
	// Thread
	Thread t = Thread.currentThread();
	String tname=t.getName();
	System.out.println("Curent runing thread is :"+ tname);
	
	// Set name
	t.setName("My main");
	System.out.println(t.getName());
	// sllep method
	
	try {
		Thread.sleep(2000);
	}catch(Exception e) {
		
	};
	System.out.println(t.getId());
	
	// strat UserThread
	UserThread th = new UserThread();
	th.start();
	
	System.out.println("Programm end;");
}
}
