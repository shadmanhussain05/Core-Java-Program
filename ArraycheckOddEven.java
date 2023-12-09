package NewArrayprogram;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class ArraycheckOddEven {
	public static void main(String[] args) {
		int arr[]= {4,5,6,7,8,9};
		ArrayList<Inflater> al=new ArrayList();
	for(int i=0; i<arr.length-1; i++) {
		if (arr[i]%2==0) {
			System.out.println("is even");
		}
		else {
		System.out.println("is odd");
	}

}
}
}
