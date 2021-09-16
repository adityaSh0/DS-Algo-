package String;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="aab";
		String b="listen";
		boolean visited []= new boolean[b.length()];
		boolean isAnagram= false;
			if(a.length()==b.length()) {
				for(int i=0;i<a.length();i++) {
					isAnagram= false;
					for(int j=0;j<b.length();j++) {
						if(a.charAt(i)==b.charAt(j) && !visited[j]) {
							visited[j]=true;
							isAnagram=true;
							break;
							
						}
					}
					if(!isAnagram) {
						break;
					}
				}
				if(isAnagram) {
					System.out.println("Anagram");
				}
				else {
					System.out.println("Not Anagram");
				}
			}

	}

}
