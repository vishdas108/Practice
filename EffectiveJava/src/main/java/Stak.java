package main.java;

import java.util.Arrays;
import java.util.Stack;

public class Stak {

	public static void main(String[] args) {
		
		  int a = Integer.MAX_VALUE , b = Integer.MAX_VALUE;
		  int sum = a + b;
		  System.out.println(sum);
		System.exit(0);
		  
		
		int []A = {1,1,1,1,2,2,3,4,5,5,6,7,7,6,4};
		
		Arrays.sort(A);
		
		Stack<Integer> st = new Stack<>();
		st.push(A[0]);
		
		int count =0;
		
		for (int i = 1; i < A.length ; i++) {
		
			if ( !st.isEmpty() && st.peek() == A[i]){
				count++;
				st.pop();
			}else {
				st.push(A[i]);
			}
			
		}
		
		System.out.println("count : " + count);
		
		
	}
}
