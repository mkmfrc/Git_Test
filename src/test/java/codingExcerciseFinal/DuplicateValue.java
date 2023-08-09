package codingExcerciseFinal;

public class DuplicateValue {

	// Question 7: How to find the duplicate value from Array without any predefined
	// method or functions?
	// @Test
	public void getFindDuplicateValue() {

			// 1. I am declaring an Array object which contains duplicate value
		int[] num = { 100, 420, 786, 911, 4444, 300, 420 };

			// 2. Using nested loop and using java condition I compare the value
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.println("Duplicate Value : " + num[i]);
				}
			}
		}
	}
}
