package Programm2;

public class str {
public static void main(String[] args) {
	String str="My Name is khan";
	String rv="";
	int leng=str.length()-1;
	String result = "";
	for (int i = leng; i>=0; i--) {
		rv=str.charAt(i)+rv;
		if(str.charAt(i)==' ' || (str.charAt(i)!=' ' && i==0))
		{
			result = result+rv;                                                                                                                                                                                                  
			rv = "";
		}
	}
System.out.println(result);
}
}
