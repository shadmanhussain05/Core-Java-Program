package first;
import java.util.Scanner;
public class RevesenNumber {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int n= sc.nextInt();
	int t=n;
	int rev=0;
	int n1=65443;
	while(n1!=0) {
		rev=rev*10+n1%10;
		rev=n1/10;
		System.out.println(rev);}
	}

}
