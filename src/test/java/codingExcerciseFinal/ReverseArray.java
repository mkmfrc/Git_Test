package codingExcerciseFinal;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {

	// Question 3: How to reverse Array on number or String?
	// @Test
	public void getReverseArray() {

			// 1. Declare the array with the help of java Wrapper Class
			// because I have to use the Collections Utility Class
		Integer num[] = { 500, 420, 750, 1050 };
		System.out.println(" Original Array Value : " + Arrays.toString(num));

			// 2. By using Collections Utility Class we are calling reverse method
			// and within parenthesis using Arrays class I have to call asList
			// and pass the Array Variable within parenthesis

		Collections.reverse(Arrays.asList(num));
		System.out.println(" After Reverse Array Value : " + Arrays.toString(num));
	}
}
