package DynamicProgramming;

import java.util.Scanner;

public class CoinChangePermutation {

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
			for(int i=0;i<amt+1;i++){
			    for(int j=0;j<n;j++){
			        if(a[j]<=i){
			            dp[i]+=dp[i-a[j]];
			        }
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
