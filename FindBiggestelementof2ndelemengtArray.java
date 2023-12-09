package NewArrayprogram;

public class FindBiggestelementof2ndelemengtArray {
public static void main(String[] args) {
	int arr[] = {23,12,14,56,22,28,13};
	int fbig=arr[0];
	int sbig= arr[1];
	for(int i=0;i<arr.length;i++) {
		if(fbig<arr[i]) {
			sbig=fbig;
			fbig=arr[i];
		}
		else {
			sbig=arr[i];
		}
	}
	System.out.println("first biggest element"+fbig);
	System.out.println("Secnd biggest element"+sbig);

}
}
