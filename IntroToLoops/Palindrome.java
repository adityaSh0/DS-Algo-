package introduction;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=n;
		int r=0;
		while(temp>0) {
			int digit=temp%10;
			r=(r*10)+digit;
			temp/=10;
		}
		if(r==n) {
			System.out.println("The number "+n+" is palindrome having reverse as "+r);
		}
		else {
			System.out.println("The number is not a palindrome number");
		}

	}

}
