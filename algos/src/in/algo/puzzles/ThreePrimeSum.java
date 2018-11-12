/**
 * 
 */
package in.algo.puzzles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Nishant
 *
 */
public class ThreePrimeSum {

	/**
	 * 
	 */
	public ThreePrimeSum() {

	}

	/**
	 * @param MAX
	 * @return
	 */
	static Integer[] genPrimesTillMax(int MAX) {
		int i, j;
		int[] primes = new int[MAX];
		for (i = 0; i < MAX; i++)
			primes[i] = 1;
		int sqrt = (int) Math.sqrt(MAX);
		for (i = 2; i <= sqrt; i++) {
			if (primes[i] != 0)
				for (j = i; j * i < MAX; j++)
					primes[i * j] = 0;
		}
		List<Integer> list = new ArrayList<>();
		for (int k = 0; k < primes.length; k++) {
			if (primes[k] != 0 && k > 1)
				list.add(k);
		}
		return list.toArray(new Integer[list.size()]);
	}

	static boolean find2Numbers(Integer[] A, int arr_size, int sum) {
		int r;
		for (int i = 0; i < arr_size - 1; i++) {
			r = arr_size - 1;
			while (i < r) {
				if (A[i] + A[r] == sum) {
					System.out.print("Sum of two num is " + A[i] + " ," + A[r]);
					return true;
				} else
					r--;
			}

		}
		return false;
	}

	// returns true if there is triplet with sum equal
	// to 'sum' present in A[]. Also, prints the triplet
	static boolean find3Numbers(Integer[] A, int arr_size, int sum) {
		int l, r;
		/*
		 * Now fix the first element one by one and find the other two elements
		 */
		for (int i = 0; i < arr_size - 2; i++) {
			// To find the other two elements, start two index variables
			// from two corners of the array and move them toward each
			// other
			l = i + 1; // index of the first element in the remaining elements
			r = arr_size - 1; // index of the last element
			while (l < r) {
				if (A[i] + A[l] + A[r] == sum) {
					System.out.print("Triplet is " + A[i] + " ," + A[l] + " ," + A[r]);
					return true;
				} else if (A[i] + A[l] + A[r] < sum)
					l++;

				else // A[i] + A[l] + A[r] > sum
					r--;
			}
		}

		// If we reach here, then no triplet was found
		return false;
	}

	public static void main(String[] args) {
		int input = 15;
		Integer[] genPrimesTillMax = genPrimesTillMax(input);
		System.out.println(Arrays.toString(genPrimesTillMax));
		if (!find2Numbers(genPrimesTillMax, genPrimesTillMax.length, input)) {
			find3Numbers(genPrimesTillMax, genPrimesTillMax.length, input);
		}
	}

}
