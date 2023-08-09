package codingExcerciseFinal;

import org.testng.annotations.Test;

public class Palindrome {

	@Test
	public void getPalindrome2() {

			// 1. First I am declaring a String variable with the value "Madam".
		String value = "Madam";

			// 2. Declaring another String variable as empty
			// where I will store the reverse value while doing the reverse loop
		String revString = "";

			// 3. Using the for decrementing loop I am reversing the string from last to
			// first characters
		for (int i = value.length() - 1; i >= 0; i--) {

			revString += value.charAt(i);
			// 4. within the loop I am calling charAt() method to break the declared String
			// into characters
			// and storing this reversed value into the revString variable
		}

			// Now using if condition i am checking if original String value matches with
			// reversed value,
			// that means, checking whether the string is a palindrome or not

		if (value.equalsIgnoreCase(revString)) {
			System.out.println(" Palindrome " + revString.toLowerCase());

		} else {
			System.out.println(" Not Palindrome " + revString.toLowerCase());
		} 	// If the condition matches if will execute otherwise, else will be executed.
	}

}
