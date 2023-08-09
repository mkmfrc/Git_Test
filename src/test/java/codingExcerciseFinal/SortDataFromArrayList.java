package codingExcerciseFinal;

import java.util.Arrays;
import java.util.List;

public class SortDataFromArrayList {

	// Question 10: How to sort the data from String?
	// Sub Question : How can you check existence of a value in Array?
	// @Test
	public void getSortedData() {

		List<String> list = Arrays.asList("Mahin", "Kaniz", "Rakib", "Emran", "Fatema", "Dolly");

		if (list.contains("Emran")) {
			// System.out.println("Emran is present");
		} else {
			// System.out.println("Fakibaz");
		}

		for (String sortedValue : list) {
			System.out.println("After data sorting : " + sortedValue);
		}
	}
}
