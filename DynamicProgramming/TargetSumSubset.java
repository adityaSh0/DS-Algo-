package DynamicProgramming;

import java.util.Scanner;

public class TargetSumSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		boolean dp[][]=new boolean[n+1][x+1];
		for(int i=0;i<n+1;i++) {
			for(int j=0;j<x+1;j++) {
				if(i==0 && j==0) {
					dp[i][j]=true;
				}
				else if(i==0) {
					dp[i][j]=false;
				}
				else if(j==0) {
					dp[i][j]=true;
				}
				else {
					if(dp[i-1][j]==true) {
						dp[i][j]=true;
					}
					else {
						int val=ar[i-1];
						if(j>=val) {
							if(dp[i-1][j-val]==true) {
								dp[i][j]=true;
							}
						}
					}
					
				}
			}
			
		}
		System.out.println(dp[n][x]);

	}

}
