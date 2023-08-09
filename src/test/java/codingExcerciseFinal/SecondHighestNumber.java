package codingExcerciseFinal;

import java.util.Arrays;

public class SecondHighestNumber {

	// Question 5: How to find the second highest number?
	// Sub Question: How to sort the value?
	// @Test
	public void getSecondHighestNum() {

		// 1. I am declaring an Array
		int[] num = { 100, 600, 850, 786, 911, 4444, 200, 311 };

		// 2. With the help of Array Object I am calling the Length
		// And storing into a int variable
		int size = num.length;

		// 3. By calling sort method I can sort the values to make them in order
		Arrays.sort(num);
		System.out.println("Sorted Array : " + Arrays.toString(num));
		// Till now its covers the answer of How to sort the value?.

		// With the help of variable I pass the argument length of value
		int secondHighest = num[size - 2];
		System.out.println("Second Highest Number : " + secondHighest);

	}

}
