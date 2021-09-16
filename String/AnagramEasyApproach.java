package String;

import java.util.Scanner;

public class AnagramEasyApproach {

	public static void main(String[] args) {
//		String a="silent";
//		String b="listen@";
//		boolean isAnagram= true;
//		
//		int al[]=new int[256];
//		int bl[]=new int[256];
//		
//		for(char c: a.toCharArray()) {
//			int index=(int)c;
//			al[index]++;
//			
//		}
//		for(char d: b.toCharArray()) {
//			int index=(int)d;
//			bl[index]++;
//			
//		}
//		for(int i=0;i<256;i++) {
//			if(al[i]!=bl[i]) {
//				isAnagram= false;
//				break;
//			}
//		}
//		if(isAnagram) {
//			System.out.println("Anagram");
//		}
//		else {
//			System.out.println("Not Anagram");
//		}

		    Scanner sc=new Scanner(System.in);
		    String a=sc.nextLine();
		    String b=sc.nextLine();
		    String e=a.toLowerCase();
		    String f=b.toLowerCase();
		    boolean isAnagram= true;
		    
		    int al[]=new int[256];
		    
		    for(char c: e.toCharArray()) {
		      int index=(int)c;
		      al[index]++;
		      
		    }
		    for(char d: f.toCharArray()) {
		      int index=(int)d;
		      al[index]--;
		      
		    }
		    for(int i=0;i<256;i++) {
		      if(al[i]!=0) {
		        isAnagram= false;
		        break;
		      }
		    }
		    if(isAnagram) {
		      System.out.println("Anagrams");
		    }
		    else {
		      System.out.println("Not Anagrams");
		    }

	}

}
