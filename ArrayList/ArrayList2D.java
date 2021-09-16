package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<ArrayList<Integer>> ll=new ArrayList<ArrayList<Integer>>();
		ll.add(new ArrayList<>());
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				ll.get(i).add(j,2);
			}
		}
		System.out.println(ll);
	}

}
