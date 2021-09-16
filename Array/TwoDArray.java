package Array;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("rows");
		int n=sc.nextInt();
		System.out.println("columns");
		int m=sc.nextInt();
		int a [] [] =new int[n][m];
		int b [] [] =new int[n][m];
		System.out.println("Elements of array a");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]= sc.nextInt();
			}
			
		}
		System.out.println("Elements of array b");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				b[i][j]= sc.nextInt();
			}
			
		}
		int c [] [] =new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				c [i][j]= a[i][j]+b[i][j];
			}
			
		}
		System.out.println("Sum of matrix is");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(c [i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
