package DynamicProgramming;

import java.util.Scanner;

public class CoinChangeCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int amt=sc.nextInt();
		int dp[]=new int[amt+1];
		dp[0]=1;
		for(int i=0;i<n;i++){
		    for(int j=a[i];j<amt+1;j++){
		        dp[j]+=dp[j-a[i]];
		    }
		}
		System.out.println(dp[amt]);

	}

}
//4
//2
//3
//5
//6
//7