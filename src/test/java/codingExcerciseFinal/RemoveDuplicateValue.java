package codingExcerciseFinal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateValue {

	// Question 8: How to remove duplicate value from ArrayList?
	// @Test
	public void getRemoveDuplicateValue() {

		List<Integer> removeDup = Arrays.asList(100, 420, 786, 911, 4444, 300, 420);

		List<Integer> newDup = removeDup.stream().distinct().collect(Collectors.toList());
		System.out.println("Duplicate Value is : " + newDup);
	}
}
