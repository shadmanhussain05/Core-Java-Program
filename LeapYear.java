package first;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entere the year");
		int y=sc.nextInt();
		 if(y%400==0 || y%4==0 && y%100!=0) {
			System.out.println("is leap year");
		}
		else {
			System.out.println("is not leap year");
		}
	}
	
	

}
