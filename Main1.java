package codingtest.com.test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
//Array 장점+list장점 => 유연하면서 빠르게 값을 찾아낼 수있는 
//Map:key ->hash function->hash->buckety index -> Data 
//hashmap:not synch
//hashtable:sysnch
//concurrenthashMap:synch+hish concurrency
class MyData1 {
	int v;

	public MyData1(int v) {
		
		this.v = v;
	}

	@Override
	public String toString() {
		return "MyData1 [v=" + v + "]";
	}
	
	
}
public class Main1 {

	public static void main(String[] args) {
		HashMap<MyData1, Integer> map = new HashMap<>();
		
		

	}
	static void method01(Map<MyData1,Integer> map) {
		
		map.put(new MyData1(1), 1);
		map.put(new MyData1(2), 2);
		//map.remove("B",2); //제거 하는 코드
		System.out.println(map);
		
		//map.putIfAbsent("C", 10);
		System.out.println(map.get("A"));
		System.out.println(map.get("c"));
		System.out.println("-------------------------");
		System.out.println(map.values());
	}

}
