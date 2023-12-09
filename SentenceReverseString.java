package first;
import java.util.Scanner;
public class SentenceReverseString {
public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	char ch[]= str.toCharArray();
	 String rev= " ";
     for(int i=ch.length-1; i>=0; i--){
    	 		int k= i;
    	 		while(i>= 0 && ch[i]!='i')
    	 		{
    	 			i--;
    	 		}
    	 		int j=i+1;
    	 		while(j<=k) {
    	 			rev= rev+ch[j];
    	 					j++;
    	 		}
    	 		rev = rev+"";
     }
     System.out.println("The reverse Sentence is:" +rev);
}
}


