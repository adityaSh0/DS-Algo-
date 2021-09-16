package introduction;
import java.lang.Math;

import java.util.Scanner;

public class WhileLoopIntro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		int nu=(int)(Math.log10(n) +1);
		while(temp>0) {
			int digit=temp%10;
			temp/=10;
			sum+=digit;
			System.out.println(digit+" "+temp+" "+sum);
		}
		System.out.println("the sum of the digits of the number "+n+" with "+nu+" digits is:"+sum);
	}

}
