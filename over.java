package first;
public class over {
		void sum(int a,int b){
		System.out.println(a+b+"=a+b");
		}
		void sum(int a, int b,int c){
		System.out.println(a+b+c+"=a+b+c");
		}
		public static void main(String[] args) {
		over  O=new over();
		O.sum(20,30);
		O.sum(30,40,56);
}
}

