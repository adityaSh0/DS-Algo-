package loops;

import java.util.Scanner;

public class Continue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=100;i++) {
			if(i>=20 && i<=80) {
				continue;
			}
			System.out.println(i);
		}
		

	}

}
