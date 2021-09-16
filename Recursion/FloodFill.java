package Recursion;

public class FloodFill {
	public static void main(String[] args) {
		int a[][]={{1,2,2,2,2,0,1,0},
		          {1,1,1,2,2,0,1,0},
		          {1,1,1,2,2,2,2,0},
		          {1,1,1,1,1,2,1,1},
		          {1,1,1,1,1,2,2,1}
		          };
		fill(a,0,0,3,1);
		printMatrix(a);
	}
	public static void printMatrix(int[][] a) {
		System.out.println();
		
	}
	static void fill(int a[][],int r,int c,int toFill,int prevFill) {
		int rows=a.length;
		int cols=a[0].length;
		if(r<0 || r>=rows || c>=cols || c<0) {
			return;
		}
		if(a[r][c]!=prevFill) {
			return;
		}
		a[r][c]=toFill;
		fill(a,r-1,c,prevFill,toFill);
		fill(a,r,c-1,prevFill,toFill);
		fill(a,r+1,c,prevFill,toFill);
		fill(a,r,c+1,prevFill,toFill);
	}
}
