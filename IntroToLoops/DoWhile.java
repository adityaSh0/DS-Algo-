package introduction;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		do {
			n=sc.nextInt();
			System.out.println("the number is "+n);
		}while(n>0);

	}

}
