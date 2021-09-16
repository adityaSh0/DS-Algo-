package DynamicProgramming;

import java.util.Scanner;

public class Climbing_Stairs {
	
//	public static int count(int n,int dp[]) {
//		if(n==0) {
//			return 1;
//		}
//		else if(n<0) {
//			return 0;
//		}
//		else if(dp[n]>0) {
//			return dp[n];
//		}
//		int c1=count(n-1,dp);
//		int c2=count(n-2,dp);
//		int c3=count(n-3,dp);
//		int c=c1+c2+c3;
//		
//		dp[n]=c;
//		return c;
//	}
	static int countTabs(int n,int dp[]) {
	dp[0]=1;
	for(int i=1;i<=n;i++) {
		if(i==1) {
			dp[i]=dp[i-1];
		}
		else if(i==2) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		else {
			dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
		}
	}
	return dp[n];
	
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int cp=countTabs(n,new int[n+1]);
		System.out.println(cp);
	}

}
