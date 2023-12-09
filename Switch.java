package Programm2;

public class Switch {
	 void on() {
		 System.out.println("on");
	}
	 void off() {
		 System.out.println("off");
	 }
	public class tv extends Switch();
public void main(String[] args) {
	tv T=new tv();
	System.out.println("tv onn");
		T.on();
		T.off();
}
		
}
}
