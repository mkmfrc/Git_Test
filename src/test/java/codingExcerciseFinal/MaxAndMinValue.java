package codingExcerciseFinal;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxAndMinValue {
	// Question 9: How to find the maximum and minimum value?
	// @Test
	public void findMaxAndMinValue() {

		List<Integer> value = Arrays.asList(100, 420, 786, 911, 4444, 300, 420);
		int maxValue = Collections.max(value);
		System.out.println(maxValue);

		int minValue = Collections.min(value);
		System.out.println(minValue);
	}
}
