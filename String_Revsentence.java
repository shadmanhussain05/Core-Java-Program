package first;
import java.util.*;
class String_Revsetence {
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        String str = sc.nextLine();
	        str = str+ " ";
	        String word = "";
	        		String rev = "";
	        for(int i=0;i<str.length();i++){
	            char ch = str.charAt(i);
	            
	            //Forming a word
	            if(ch!=' '){
	                word = word + ch;
	            }
	            //Adding the formed word to the rev variable to reverse it
	            else {
	                rev = word +" "+ rev;
	                word="";
	            } 
	        }
	        
	        //Printing the reversed sentence
	        System.out.println("Reversed sentence: " + rev);
  }
}
