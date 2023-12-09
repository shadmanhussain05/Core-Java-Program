package first;
import java.util.Scanner;
public class CHeckOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner("System.in");
		System.out.println("nter the number");
		int m=sc.nextInt();
		if(m%2==0) {
			System.out.println("is even");
		}
		else{
			System.out.println("is odd");
		}
	}

}
