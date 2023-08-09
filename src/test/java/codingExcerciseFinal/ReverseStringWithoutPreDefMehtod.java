package codingExcerciseFinal;

public class ReverseStringWithoutPreDefMehtod {

	// Question 4: How to reverse String without predefined method or functions?
	// @Test
	public void getRevStringWithoutPreDefMehtod() {

			// 1. I am declaring a String variable
		String name = "RAKIB";

			// To breakdown the characters separately I call the toCharArrays method
			// Then I stored this into a separate Char Array object
		char[] rev = name.toCharArray();

			// By decrement the loop I can get the desired value
		for (int i = rev.length - 1; i >= 0; i--) {
			System.out.println(rev[i]);
		}
	}
	
	/*
	//OtherWay to reverse the string using predefined method
	//Declaring StringBuilder i am creating an object and passing the string varibale
	StringBuilder obj = new StringBuilder(str);
	
	//Using objectName i am calling reverse() method to reverse the string and get the desired value
	System.out.println(obj.reverse());
	*/
}


