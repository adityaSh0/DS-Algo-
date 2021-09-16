package Array;

import java.util.Scanner;

public class ArrayIntro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how many values u want to insert");
		int n=sc.nextInt();
		int [] arr=new int[n];  
		System.out.println("Enter the marks");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		int avg=0;
		for(int i=0;i<n;i++) {
			avg+=arr[i];
		}
		avg/=n;
		System.out.println("Average is "+avg);
	}

}
