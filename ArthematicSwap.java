package first;

public class ArthematicSwap {
public static void main(String[] args) {
	int i=30;
	int j=50;
 i=i^j;
 j=i^j;
	i=j^i;
	System.out.println("i="+i);
	System.out.println("j="+j);
}
}
