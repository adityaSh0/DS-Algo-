package Array;

public class KadensAlgo {
	public static int MaxSubArray(int arr[]) {
		int maxsum=0;
		int currsum=0;
		for(int i=0;i<arr.length;i++) {
			currsum+=arr[i];
			if(currsum>maxsum) {
				maxsum=currsum;
			}
			else if(currsum<0){
				currsum=0;
			}
		}
		return maxsum;
	}
	public static void main(String [] args) {
	int a []= {5,-4,-2,6,-1};
	System.out.println(MaxSubArray(a));
	}
}
