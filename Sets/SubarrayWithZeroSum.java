package Sets;
import java.util.*;
import java.util.Set;

public class SubarrayWithZeroSum {

	public static void main(String[] args) {
		int[] a= {2,1,3,-4,-2};
		boolean found=false;
		int k=5;
//		for(int i=0;i<a.length;i++) {
//			int sum=0;												TIME LIMIT EXCEEDED
//			for(int j=i;j<a.length;j++){
//				sum+=a[j];
//				if(sum==0) {
//					isfound=true;
//					break;
//				}
//			}
//			if(isfound)
//			break;
//		}
//		System.out.println(isfound);
		
		Set<Integer> set=new HashSet<>();
		for(int element: a) {
			int sum=0;
			set.add(sum);
			sum+=element;
			if(set.contains(sum-k)) {
				found=true;
				break;
			}
		}
		System.out.println("found : "+found);

	}

}
