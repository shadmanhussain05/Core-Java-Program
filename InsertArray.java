package NewArrayprogram;
import java.util.Scanner;
public class InsertArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entrer the Array size");
		int length=sc.nextInt();
		int arr[]=new int[length];
		System.out.println("entre the"+length+"element");
		for(int i=0;i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"].....>"+arr[i]);	
			}
	}

}
