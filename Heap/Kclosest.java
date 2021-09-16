package Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Kclosest {
	static class Pair implements Comparable<Pair>{
		int num;
		int diff;
		 Pair(int num,int diff){
			this.num=num;
			this.diff=diff;
		}
		 public int compareTo(Pair o) {
			 return (this.diff>o.diff)? -1:1;
		 }
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int x=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		PriorityQueue<Pair> maxHeap=new PriorityQueue<>();
		for(int i=0;i<n;i++) {
			maxHeap.add(new Pair(a[i],Math.abs(a[i]-x)));
			if(maxHeap.size()>k) {
				maxHeap.remove();
			}
		}
		while (maxHeap.size()>0) {
			System.out.println(maxHeap.element().num);
			maxHeap.remove();
		}

	}

}
