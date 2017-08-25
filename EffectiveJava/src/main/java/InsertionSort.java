/**
 * 
 */
package main.java;

import java.rmi.server.SocketSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;
import java.util.TreeMap;

/**
 * @author visr0617
 *
 */
public class InsertionSort {

	public static void main(String... args) {

		//

		int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE;

		//

		// largestRectangle();

		largestRectangle();
		System.exit(0);

		Is();
		selectionSort();

		longestSequence();

		addNbitBinaryIntegers();

		insertionNonIncreasing();

		sumOfTopThreeCount();

		countThePairsWithoutSorting();

		System.out.println(Integer.MAX_VALUE);
	}

	public static void selectionSort() {

		int A[] = { 1, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		for (int i = 0; i < A.length; i++) {
			System.out.println("i : " + i);
			for (int j = (i + 1); j <= A.length - 1; j++) {
				System.out.println("j : " + j);
				if (A[j] >= A[i]) {
					int temp = A[i];

					A[i] = A[j];
					A[j] = temp;
				}

			}

		}
		System.out.println(Arrays.toString(A));
	}

	public static void Is() {

		int A[] = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

		for (int i = 0; i < A.length; i++) {
			// System.out.println("i: " + i);
			int ith = A[i];
			for (int j = i; j >= 0; j--) {
				if (ith <= A[j]) {
					System.out.println();
					int temp = A[i];
					A[i] = A[j];

					A[j] = temp;
					// System.out.println("j : " + j);

				}

				;
				System.out.println("ith :: " + ith);
				break;
			}

		}
		System.out.println(Arrays.toString(A));

	}

	public static void mergeTwoArrays() {
		int A[] = { 1, 2, 3, 4, 5 };
		int B[] = { 6, 7, 8, 9, 10, 11, 12 };

		Stack<Integer> stk1 = new Stack<>();
		for (int i = 0; i < A.length; i++) {
			stk1.push(A[i]);

		}

		Stack<Integer> stk2 = new Stack<>();
		for (int i = 0; i < B.length; i++) {
			stk2.push(B[i]);
		}

		int C[] = new int[A.length + B.length];

		int l = 0;
		int m = 0;

		for (int i = 0; i < C.length; i++) {

		}

	}

	public static void countSumWithPairs() {

		int A[] = { 1, 2, 3, 4, 4, 5, 6, 7, 9, 10, 12 };

		int value = 9;

	}

	public static void largestRectangle() {
		int[] A = { 8979, 4570, 6436, 5083, 7780, 3269, 5400, 7579, 2324, 2116 };
		
		Map<Integer,Integer> indexMap = new TreeMap<>();
		
		for (int i = 0; i < A.length; i++) {
			indexMap.put(A[i], i);
			
		}
		
		
	
		System.out.println(Arrays.toString(A));
	
		
		int tempMax =0;
		for (Entry<Integer,Integer>  entry : indexMap.entrySet() ) {
			
			int index = entry.getValue();
			int value = entry.getKey();
	
		//	System.out.println("value :: " + value);
		//	System.out.println("index :: " + C[i]);
			int count =0;
			for (int j = index; j < A.length; j++) {
		//		System.out.println(" to right :: " +j);
				if(A[j]>=value)
					count++;
				else 
					break;
				System.out.println("A[j] "+A[j]);
			//	System.out.println("count :: in Right " + count);
			}
		
			
			for (int j = index-1; j >= 0; j--) {
			//	System.out.println("to left :: " + j);
				
			//	System.out.println("A[i] "+A[i]);
				if(A[j]>=value)
					count++;
				else 
					break;
				System.out.println("A[j] "+A[j]);
				//	System.out.println("count :: in Left " + count);
			}
		
			
			
			
			if(value*count> tempMax)
			tempMax= value*count;
			
			System.out.println("value = "+ value + " count = " + count+ " value " +value*count +"---->>>>" + tempMax) ;
		}
		
		System.out.println("tempMax :: "+ tempMax);
	}

	public static void longestSequence2() {

		int A[] = { 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 10, 10, 10, 10, 10, 10 };
		int length = 1, index = 0, value = 0, tempLength = 1, exitIndex = 0, iteration = 1;
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i + 1; j < A.length; j++) {
				exitIndex = j;
				iteration++;
				if (A[i] == A[j]) {
					tempLength++;
				} else {
					if (length < tempLength) {
						length = tempLength;
						index = i;
						value = A[i];
					}
					tempLength = 1;
					i = j - 1;
					break;
				}
			}
			if (exitIndex == A.length - 1) {
				if (A[i] == A[exitIndex] && length < tempLength) {
					length = tempLength;
					index = i;
					value = A[i];
				}
				break;
			}
		}
		System.out.println("Value " + value + " length " + length + " index " + index);
		System.out.println(" iterations  " + iteration + " For array " + A.length);
	}

	public static void longestSequence() {
		int A[] = { 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 10, 10, 10, 10, 10, 10 };

		int startIndex = 0;
		int endIndex = 0;
		int count = 0;
		int number = A[0];
		int localNumber = A[0];
		int latestStart = 0;
		int latestEnd = 0;
		int localCount = 1;

		for (int i = 1; i < A.length; i++) {

			int key = A[i];
			System.out.println("key :: " + key);
			if (key != localNumber || i == A.length - 1) {
				if (i == A.length - 1) {
					localCount++;
					latestEnd = i;
				}
				System.out.println("key!=number or last number:: ");
				if (localCount > count) {

					count = localCount;
					startIndex = latestStart;
					endIndex = latestEnd;
					number = localNumber;
					System.out.println("localCount is greater than count.. localCount :: " + localCount
							+ " startIndex :: " + latestStart + " end Index:: " + latestEnd);
				}
				latestStart = i;
				localCount = 1;
				localNumber = A[i];
				System.out.println("localCount got reset...");

			} else if (key == localNumber) {
				latestEnd = i;

				localCount++;

				System.out.println("for latestNumber sequence " + localNumber + " count is :: " + localCount
						+ "startIndex " + latestStart + " endIndex  " + latestEnd);
			}
			System.out.println(" number -->" + number + "startIndex--> " + startIndex + " endIndex-->  " + endIndex);
		}

	}

	public static void addNbitBinaryIntegers() {

		int num1 = 56;
		int num2 = 68;
		int[] ary1 = new int[25];
		int[] ary2 = new int[25];
		char cry1[] = Integer.toBinaryString(num1).toCharArray();
		char cry2[] = Integer.toBinaryString(num2).toCharArray();
		// System.out.println(Arrays.toString(cry1));
		// System.out.println(Arrays.toString(cry2));
		for (int i = 0; i < cry1.length; i++) {
			// System.out.println(cry1[i]);

			ary1[i] = Character.digit(cry1[i], 2);

		}
		System.out.println("\n");
		for (int i = 0; i < cry2.length; i++) {
			// System.out.println(cry2[i]);
			ary2[i] = Character.digit(cry2[i], 2);

		}

		int reminder = 0;
		int result[] = new int[25];
		for (int i = ary1.length - 1; i >= 0; i--) {
			result[i] = (reminder + ary1[i] + ary2[i]) % 2;

		}

		System.out.println(Integer.toBinaryString(num1 + num2));

		System.out.println(Arrays.toString(result));
		System.out.println(Arrays.toString(ary1));
		System.out.println(Arrays.toString(ary2));
	}

	public static void linearSearch() {

		int[] A = { 5, 2, 4, 6, 1, 3 };

		int value = 4;

		for (int i = 0; i < A.length; i++) {

			if (A[i] == value)
				System.out.println("contains value: " + value);
		}
	}

	public static void insertionSort() {

		int[] A = { 5, 2, 4, 6, 1, 3 };

		for (int j = 1; j < A.length; j++) {

			// System.out.println("j "+ j);
			int key = A[j];
			// System.out.println("key : "+ key);
			int i = j - 1;
			// System.out.println("i :"+i);

			while (i >= 0 && A[i] > key) {
				System.out.println("left Element : " + A[i]);
				A[i + 1] = A[i];
				i = i - 1;

			}
			A[i + 1] = key;

		}
		System.out.println(Arrays.toString(A));
	}

	public static void insertionNonIncreasing() {
		int[] A = { 2, 3, 4, 54, 3, 6, 5, 7, 6, 4, 5, 6, 4 };

		for (int i = 1; i < A.length; i++) {

			int key = A[i];
			int j = i - 1;
			while (j >= 0 && key > A[j]) {
				A[j + 1] = A[j];
				j = j - 1;

			}
			A[j + 1] = key;

		}
		System.out.println(Arrays.toString(A));
	}

	public static void withoutVariable(int[] A) {

		for (int j = 1; j < A.length; j++) {

			while (j - 1 >= 0 && A[j - 1] > A[j]) {

				// int temp = A[j];

				j = j - 1;

			}

		}

		System.out.println(Arrays.toString(A));
	}

	public static void countThePairs() {
		int[] A = { 1, 1, 1, 1, 2, 2, 3, 4, 5, 5, 6, 7, 7 };
		Arrays.sort(A);
		int n = A[0];
		int count = 0;
		int length = 0;

		for (int i = 0; i < A.length; i++) {
			// System.out.println("i "+ A[i]);
			if (n == A[i]) {
				length++;
				// System.out.println("A[i ] " +A[i] +" " + length);

				if (A.length == (i + 1))
					count = count + length / 2;

			} else {
				count = count + length / 2;
				length = 1;
				n = A[i];
			}

		}
		System.out.println("count :" + count);
	}

	public static void countThePairsWithoutSorting() {

		int[] A = { 10, 10, 30, 20, 20, 10, 10, 30, 50, 10, 20, 10 };

		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < A.length; i++) {

			if (A[i] < min)
				min = A[i];
			if (A[i] > max)
				max = A[i];

		}

		int[] index = new int[max - min + 1];

		int count = 0;

		for (int i = 0; i < A.length; i++) {

			int j = A[i] - min;
			index[j] = index[j] + 1;

			int localPair = index[j] / 2;
			count = count + localPair;
			index[j] = index[j] - localPair * 2;

		}
		System.out.println("count : " + count);
	}

	public static void sumOfTopThreeCount() {

		Queue<Integer> sort = new PriorityQueue(15, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				if (o1 == o2)
					return 0;
				else if (o1 > o2)
					return -1;
				else if (o1 < o2)
					return 1;

				return 0;
			}

		});

		Random random = new Random();

		List<Integer> topThree = new LinkedList();
		for (int i = 0; i < 10; i++) {
			sort.add(random.nextInt(25645));

			for (int j = 0; j < 3; j++) {
				Integer top = sort.poll();
				if (top != null)
					topThree.add(top);

			}
			System.out.println("topThree " + topThree);
			sort.addAll(topThree);
			topThree.clear();
		}

	}

	public static void equalStacks() {

		int[] A1 = { 3, 2, 1, 1, 1 };
		int[] A2 = { 4, 3, 2 };
		int[] A3 = { 1, 1, 4, 1 };

		Stack<Integer> stk1 = new Stack<>();
		stk1.add(3);
		stk1.add(2);
		stk1.add(1);
		stk1.add(1);
		stk1.add(1);
		Stack<Integer> stk2 = new Stack<>();
		stk1.add(4);
		stk1.add(3);
		stk1.add(2);
		Stack<Integer> stk3 = new Stack<>();
		stk3.add(1);
		stk3.add(1);
		stk3.add(4);
		stk3.add(1);

	}

}
