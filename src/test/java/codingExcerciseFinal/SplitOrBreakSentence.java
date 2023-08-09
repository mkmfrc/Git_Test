package codingExcerciseFinal;

public class SplitOrBreakSentence {

	// Question 6: How to Split a Sentence or break the sentence?
	// @Test
	public void getSplitWord() {

			// 1. I have to declare the String Variable
		String name = "United State of America";

			// 2. Inside the loop we have call split method
			// and inside the parenthesis we have to pass the space based on requirements
		for (String newValue : name.split(" ")) {
			System.out.println(newValue);
		}
	}
}
