/**
 * 
 */
package in.algo.sort.version.nis;

import in.algo.sort.inf.Sort;

import java.util.Arrays;

/**
 * @author nishant.awasthi1
 *
 */
public class InsertionSort implements Sort {

	/**
	 * 
	 */
	public InsertionSort() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see in.algo.sort.inf.Sort#sort()
	 */
	@Override
	public void sort() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see in.algo.sort.inf.Sort#getRuningTime()
	 */
	@Override
	public void getRuningTime() {
		// TODO Auto-generated method stub

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] ar = {9, 8, 6 ,7, 3, 5, 4, 1, 2};
		insertionSortPart2(ar);

	}

	
	/*public static void insertIntoSorted(int[] ar) {
		// Fill up this function
		for (int i = 0; i < ar.length; i++)
			for (int j = i; j > 0; j--) {
				if (ar[j] < ar[j - 1]) {
					exchange(ar, j, j - 1);
				}
			}
		printArray(ar);
	}*/
	
	// For hacker rank practice
	 public static void insertionSortPart2(int[] ar)
	    {       
		 for (int i = 0; i < ar.length; i++){
				for (int j = i; j > 0; j--) {
					if (ar[j] < ar[j - 1]) {
						exchange(ar, j, j - 1);
					}else{
						break;
					}
				}
				if(i!=0)
				 printArray(ar);	
		 }
	    }  
	    

	private static void exchange(int[] ar, int j, int i) {
		int temp = ar[j];
		ar[j] = ar[i];
		ar[i] = temp;
	}

	private static void printArray(int[] ar) {
		for (int i = 0; i < ar.length; i++)
			System.out.print(ar[i]+" ");
		System.out.println();
	}

}
