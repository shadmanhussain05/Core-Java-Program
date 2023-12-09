package FirstJavaproject;
import java.util.*;
public class PsswordGenerate {
private static final char[] Shaad_password = null;
public static void main(String[] args) {	
	System.out.println(Shaad_password);
}
static char[] Shaad_Password(int length) {
	System.out.println("generating password random");
	System.out.println("your new password is");
	String Capital_char="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String small_char="abcdefghijklmnopqrstuvwxyz";
			String numbers="0123456789";
				String symbols="@$&%><$#?!";
			String values=Capital_char+small_char+numbers+symbols;
			Random rndm_method=new Random();
			char[] password=new char[length];
			for(int i = 0;i<length;i++) {
				password[i]= values.charAt(rndm_method.nextInt(values.length()));
			}
			return password;
}
}
