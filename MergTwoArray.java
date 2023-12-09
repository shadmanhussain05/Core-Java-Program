package NewArrayprogram;

public class MergTwoArray {
public static void main(String[] args) {
	int ar1[]= {12,13,23,15,11,16};
	int ar2[]= {53,26,23,15,18,13};
	int res[]=new int [ar1.length+ar2.length];
	int j=0;
	for(int i = 0; i<ar2.length; i++) {
		res[j]= ar1[i];
	}
	for(int i=0;i<ar2.length; i++,j++) {
		res[j]=ar2[i];
	}
	System.out.println("Merged Array");
	for(int i=0;i<res.length; i++) {
		System.out.println(res[i]);
	}
}
}
