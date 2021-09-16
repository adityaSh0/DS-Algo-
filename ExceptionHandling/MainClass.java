package ExceptionHandling;

public class MainClass {

	public static void main(String[] args) {
		try {
			int a,b,c;
//			a=10;
//			b=0;
//			
//			c=a/b;
//			System.out.println(c);
			int []ar= {1,2,3,4,5};
			System.out.println(ar[5]);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage() +"  This is the error " );
		}
		catch(ArrayIndexOutOfBoundsException f) {
			System.out.println(f.getMessage() +"  This is the error " );
		}
		finally {
			System.out.println("Sorry For the Inconvinience");
		}
		System.out.println("Very Important Code");

	}

}
