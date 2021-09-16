package Array;

public class StocksBuyandSell {

	public static void main(String[] args) {
//		int a[]= {5,2,6,1,4};
//		int maxprofit=0;
//		int minsofar=a[0];
//		for(int i=0;i<a.length;i++) {
//			minsofar=Math.min(minsofar, a[i]);
//			int profit=a[i]-minsofar;
//			maxprofit=Math.max(maxprofit, profit);
//		}
		int a[]= {5,2,6,1,4,7,3,6};
		int maxprofit=0;
		for(int i=1;i<a.length;i++) {
			if(a[i]>a[i-1]) {
				maxprofit+=a[i]-a[i-1];
			}
		}
		
		System.out.println(maxprofit);
	}

}
