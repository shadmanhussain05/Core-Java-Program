package first;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner("System.in");
	int n=sc.nextInt();
	int i;
	for(i=2;i<n;i++) {
		if(n==i)
		System.out.println("is prime");
	}
	if(n%i==0) {
		System.out.println("not prime");
	}
}
   }
