package DynamicProgramming;

import java.util.Scanner;

public class Fibonnaci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			int res=fib(n,new int[n+1]);
			System.out.println(res);
	
				
	}
	public static int fib(int n,int []dp) {
		if(n==0 || n==1) {
			return n;
		}
		if(dp[n]!=0) {
			return dp[n];
		}
		int f1=fib(n-1,dp);
		int f2=fib(n-2,dp);
		int f=f1+f2;
		
		dp[n]=f;
		return f;
		
	}

}
