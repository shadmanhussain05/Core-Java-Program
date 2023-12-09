package first;
import java .util.Scanner;
public class palindrome {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the number");
	int m= sc.nextInt();
	int t=m;
	int rev=0;
	while(m!=0) {
		rev=rev*10+m%10;
		rev=m/10;
		if(rev==t) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not  plaindrome");
		}
		
	}
	
}
}
