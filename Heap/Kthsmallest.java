package Heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Kthsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<n;i++) {
			maxHeap.add(a[i]);
			if(maxHeap.size()>k) {
				maxHeap.remove();			}
		}
		System.out.println(maxHeap.element());
	}

}
