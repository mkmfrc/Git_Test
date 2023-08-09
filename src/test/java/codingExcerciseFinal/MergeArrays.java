package codingExcerciseFinal;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeArrays {
	// Question 2: How to merge two arrays?
	// @Test
	public static void getMergeTwoArrays() {

			// 1. First I am the arrays separately as per requirement

		String[] value1 = { "F", "A", "H", "I", "M" };
		String[] value2 = { "C", "H", "O", "W", "D", "H", "U", "R", "Y" };

			// 2. I have to declare the ArrayList and pass the arguments of first Array
			// variable
			// and take the control of array value in array list object

		ArrayList<String> list = new ArrayList<String>(Arrays.asList(value1));

			// 3. with the help of ArrayList object I have to call the addAll method and
			// pass the second array variable
		list.addAll(Arrays.asList(value2));

			// 4. with the help of ArrayList object I call the toArray method to convert it
			// into Array
			// and storing into ObjectClass which is the SuperClass in java and creating
			// another variable
			// with the help of new object value I get the desired result on console

		Object[] mergeValue = list.toArray(); 

		System.out.println(Arrays.toString(mergeValue));
	}

}
