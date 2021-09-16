package String;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		boolean isPalin=true;
		int i=0;
		int j=a.length()-1;
		while(i<j) {
			if(a.charAt(i)!=a.charAt(j)) 
				isPalin=false;
			
			
				j--;
				i++;
			
		}
		if(isPalin) {
			System.out.println("yes");
		}
		else
			System.out.println("no");
		
		

	}

}

