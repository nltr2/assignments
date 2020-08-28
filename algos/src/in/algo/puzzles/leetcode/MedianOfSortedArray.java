/**
 * 
 */
package in.algo.puzzles.leetcode;

/**
 * @author Nishant
 *
 */
public class MedianOfSortedArray {

	/**
	 * 
	 */
	public MedianOfSortedArray() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MedianOfSortedArray ma=new MedianOfSortedArray();
		int a[]={2};
		int b[]={1,3};
		ma.findMedianSortedArrays(a,b);

	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int l1=nums1.length;
		int l2=nums2.length;
		int totalLength= l1+l2;
		if(nums1.length<=nums2.length){
			
			return getMedian(nums1,nums2);
		}else{
			return getMedian(nums2,nums1);
		}
		
	}

	private double getMedian(int[] a, int[] b) {
		int n=a.length;
		int m=b.length;
		int i=n/2;
		//taking one extra in left array so in odd case median will be max of left subarrays ie max(a[i-1],b[j-1])
		int j=(m+n+1)/2-i;
		while(0<=i && i<=n){
			if(a[i-1]<= b[j] && b[j-1] <= a[i] && (i+j)==(m+n-i-j)){
				break;
			}
		//	else if(a[i-1]<){}
		}
		
		return 0;
	}

	
}
