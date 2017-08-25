package main.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Maps;
import com.google.common.collect.Multiset;

public class Count {

	public static void main(String[] args) {
		
		int []A = {1,1,1,1,2,2,3,4,5,5,6,7,7,-6,-9};

		Stack<Integer> st= new Stack();	
		
		// smallest element in an Array.
		
		int start = A[0];
		
		for (int i = 0; i < A.length; i++) {
			if(A[i]<start)
				start = A[i];
			
		}
		
		System.out.println(start);
	}
}
