package first;
import java.util.Scanner;
public class Fatorial {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(("Ennter number"));
	int n=sc.nextInt();
	int fact=1;
	for(int i=1;i<n;i++) {
		fact=fact*i;
		System.out.println(fact);
		
	}
}
}
