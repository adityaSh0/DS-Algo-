package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int a[]= {3,1,-2,7,0};
		int n=a.length;
		int temp;
		for(int i=0;i<n-1;i++) {
			int minIndex=i;
			for(int j=i;j<n;j++) {
				if(a[minIndex] > a[j]) {
					minIndex=j;
				}	
			}
			temp=a[i];
			a[i]=a[minIndex]; 
			a[minIndex]=temp;
		}
		for(int item:a) {
			System.out.print(item+" ");
		}
	}

}
