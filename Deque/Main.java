package Deque;

import java.util.ArrayDeque;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<Integer> ad=new ArrayDeque<>();
		ad.push(12);
		ad.push(23);
		ad.push(34);
		System.out.println(ad.pop());
		System.out.println(ad.pop());

	}

}
