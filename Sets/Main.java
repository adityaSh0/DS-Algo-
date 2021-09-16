package Sets;

import java.util.Set;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Set<String> fruits=new HashSet<>();
//		fruits.add("Apple");
//		fruits.add("Banana");
//		fruits.add("Kiwi");
//		System.out.println(fruits.add("Kiwi"));
//		System.out.println(fruits);
		
		Set<Integer> x=new HashSet<>();
		x.add(12);
		x.add(13);
		x.add(18);
		
		Set<Integer> y=new HashSet<>();
		
		y.add(13);
		
		//x.addAll(y);
		//x.retainAll(y);
		System.out.println(x.containsAll(y));
		
	}

}
