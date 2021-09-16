package Sets;

import java.util.HashSet;
import java.util.Set;

public class DistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,5,5,3,3};
		Set<Integer> dis=new HashSet<>();
		for(int element: a) {
			dis.add(element);
		}
		
		System.out.println(dis.size());

	}

}
