package codingtest.com.test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Soution3 {

	public boolean soultion2(int[] arr) {
	
		int[] answer= new int[arr.length];
		for(int i=0; i<arr.length; i++) {answer[i]=i+1;}
		Arrays.sort(arr);
		
		
	
		return Arrays.equals(answer, arr);

	}
	
	

}

class Soution2{
	public int[] solution(long n) 
	{
		List<Integer> list=new LinkedList<>();
		
		while(n>0) {
			list.add((int)(n%10));
			n /=10;
		}
		System.out.println(list);
		return list.stream().mapToInt(Integer::intValue).toArray();
		
	}
	
}
