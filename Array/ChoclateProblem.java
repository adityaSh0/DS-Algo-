package Array;


public class ChoclateProblem {
		static void kitkat(int a[],int N) {
		int b[]=new int[N];
		for(int i=0;i<N;i++) {
			b[i]=1;
		}
		for(int i=1;i<N;i++) {
			if(a[i]>a[i-1]) {
				b[i]=b[i-1]+1;
			}
			else
				b[i]=1;
		}
		for(int i=N-2;i>=0;i--) {
			if(a[i]>a[i+1]) {
				b[i]=Math.max(b[i+1]+1,b[i]);
			}
			else
				Math.max(b[i],1);
		}
		int sum=0;
		for(int i=0;i<N;i++) {
			sum+=b[i];
		}
		System.out.println(sum);
	}
		public static void main(String[] args)
	    {
	 
	        int a [] = { 23, 14, 15, 14, 56, 29, 14 };
	        int N = a.length;
	        kitkat(a, N);
		

	}

}
