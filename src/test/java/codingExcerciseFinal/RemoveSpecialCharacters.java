package codingExcerciseFinal;

import org.testng.annotations.Test;

public class RemoveSpecialCharacters {

	// Q. Remove Special characters from string and remaining outcome should be
	// reversed.
	@Test
	public void getRemoveSpecialChar() {

		// 1. I am declaring a String Variable using the given value
		String str = "I/o:8%$#7d$098g&()_+h%l@";

		// 2. With the help of variable i called the replaceAll()
		// and pass two arguments to remove the special character
		// then storing into the declared String variable
		str = str.replaceAll("[^A-Za-z]", "");
		System.out.println(str);

		// 3. Now I am breaking the String using toCharArray() method and storing into
		// char[] object
		char[] newStr = str.toCharArray();

		// 4. Using the decrementing loop i can get the desired reversed value.
		for (int i = newStr.length - 1; i >= 0; i--) {
			System.out.print(newStr[i]);
		}

	}
}
