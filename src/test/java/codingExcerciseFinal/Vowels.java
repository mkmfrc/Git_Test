package codingExcerciseFinal;

public class Vowels {

	// Question 11: How to find vowels from String?
	// @Test
	public void getFindVowels() {

	String vowel = "hI I am ripon video. welcome to smarttech";
	for (int i = 0; i < vowel.length(); i++) {
		if (vowel.charAt(i) == 'a' || vowel.charAt(i) == 'e' || vowel.charAt(i) == 'i' || vowel.charAt(i) == 'o'
			|| vowel.charAt(i) == 'u') {
			// System.out.println(vowel.charAt(i));
			System.out.println(vowel.charAt(i) + " Index Number : " + i);
			}
		}

	}

}
