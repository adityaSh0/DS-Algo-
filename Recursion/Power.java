package Recursion;

public class Power {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(pow (3,1000));
		
		System.out.println(pow (3,1000));
	
	}
	static int pow(int a,int b) {
		
		if(b==0) {
			return 1;
		}
		return a * pow(a,b-1);
	}
	
	static int FastPow(int a,int b) {
		;
		if(b==0) {
			return 1;
		}
		if(b%2==0) {
			return FastPow(a*a,b/2);
		}
		return a* FastPow(a,b-1);
	}

}
