package NewArrayprogram;
public class MissingElementArray {
	public static void main(String[] args) {
		int arr[]= {8,15,26,34,44};
		System.out.println("Missing eLment Array is given");
		for(int i=0;i<arr.length-1; i++) 
		{
			for(int j=arr[i]+1;j<arr[i+1];j++)
			{
				System.out.println(j);
			}
		}
	}

}
