package PriorityQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class KLargestElement {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		while(t-- !=0) {
			int n=sc.nextInt();
			int k=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			PriorityQueue<Integer> pq=new PriorityQueue<>();
			for(int i=0;i<n;i++) {
				if(i<k) {
					pq.add(arr[i]);
				}
				else {
					if(pq.peek() < arr[i]) {
						pq.poll();
						pq.add(arr[i]);
					}
				}
			}
			ArrayList<Integer> rev=new ArrayList<>(pq);
			Collections.sort(rev,Collections.reverseOrder());
			for(int ans: rev) {
				System.out.print(ans+" ");
			}
		}
		

	}

}
