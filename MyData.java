package codingtest.com.test;

public class MyData {

	
	public static void main(String[] args) {
		
		Soution3 soution= new Soution3();
		int[] arry= {4,1,3,2};
		int[] atta= {4,1,3};
		
	boolean a=soution.soultion2(arry);
	boolean b=soution.soultion2(atta);
		System.out.println(a);
		System.out.println(b);
		
		ex3();
		System.out.println();
		
	}
	public static void ex3() {
		
		Soution2 soution2= new Soution2();
		long l= 12345;
		int[] a=soution2.solution(l);
	
	}
}
