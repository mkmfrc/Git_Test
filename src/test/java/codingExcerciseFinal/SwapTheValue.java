package codingExcerciseFinal;

import org.testng.annotations.Test;

public class SwapTheValue {

	@Test
	void swapValue() {

		// i need to declare two separate variable x and y and pass my value there
		int x = 20;
		int y = 30;

		x = x + y; // first i am going to add x and y value and storing into x variable

		y = x - y; // now i am going to subtract x to y and storing it into y variable

		x = x - y; // at the end again i am going to subtract x to y again and store the value into
					// x
					// thats how i swap the value
	}

}
