package loops;

import java.util.Scanner;

public class NestedForLoop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int j=1;j<=5;j++) {
			for(int i=1;i<=10;i++) {
				System.out.print(i+" ");
				}
			System.out.println();
		}
	}
}
