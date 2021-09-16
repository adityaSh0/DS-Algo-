package Sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int temp;
		int a[]= {5,4,3,2,11,7,9,1,8,6,10,0};
		for(int i=0;i<a.length-1;i++) {
			boolean sorted = true;
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j] > a[j+1]) {
					temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					sorted =false;
				}		
			}	
			if(sorted) 
				break;
		}
		for(int item: a) {
		System.out.print(item+" ");
		}
	}

}
