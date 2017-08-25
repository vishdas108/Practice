package main.java;

/**
 * 
 * @author visr0617
 *
 */
public class Matrix {

	int row;
	int column;
	double[][] data;

	public static void main(String[] args) {
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
}
