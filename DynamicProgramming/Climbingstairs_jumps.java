package DynamicProgramming;

import java.util.Scanner;

public class Climbingstairs_jumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int dp[]=new int[n+1];
		dp[n]=1;
		for( int i=n-1;i>=0;i--) {
			for(int j=1;j<=ar[i] && i+j<dp.length;j++) {
				dp[i]+=dp[i+j];
			}
		}
		System.out.println(dp[0]);
	}

}
