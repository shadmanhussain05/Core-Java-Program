package programm;
import java.util.Scanner;
public class FINDSmallestNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int x=sc.nextInt();
	int y=sc.nextInt();
	if(x<y && y<x) {
		System.out.println(x+"is Smallest number");
	}
	else {
		System.out.println(y+"is Smallest Number");
	}
	
}
}
