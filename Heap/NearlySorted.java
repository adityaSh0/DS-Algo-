package Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class NearlySorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		PriorityQueue<Integer> minHeap=new PriorityQueue<>();
		for(int i=0;i<n;i++) {
			minHeap.add(a[i]);
			if(minHeap.size()>k) {
				System.out.println(minHeap.remove());		}
		}
		while(minHeap.size()>0) {
			System.out.println(minHeap.element());
			minHeap.remove();
		}

	}

}
