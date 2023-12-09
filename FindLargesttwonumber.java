package programm;
import java.util.Scanner;
public class FindLargesttwonumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>y && y>x) {
			System.out.println(x+"is largest number");
		}
		else {
			System.out.println(y+"is largest number");
		}
	}

}
