package codingExcerciseFinal;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class OccuringString {

	// Q: Occurring value? // C =1 // O = 2
	@Test
	public void getOccuringString() {

				// Declaring the String variable as per desired value
		String str = "United State of America";

				// Using HashMap from Collection framework to create Object 
					// and passing the Character, Integer as Key & Value pair
		HashMap<Character, Integer> map = new HashMap<>();

				// Using the advance Loop we are breaking the String into Characters using toChatArray() 
					//and storing into new Character Object
		for (Character count : str.toCharArray()) {
			
			// now using IF/Else condition I am taking the control of Key & Value pair
			// with the help of containsKey() and put() methods 
			//then i get the desired outcome
			if (map.containsKey(count)) {
				map.put(count, map.get(count) + 1);
			} else {
				map.put(count, 1);
			}
		}
		System.out.println("Number of Character : " + map);
	}
}

/*
 * // Q: Occurring value? // C =1 // O = 2
 * 
 * @Test public void getOccuringString() { String value = "CommunitySupport"; //
 * Declaring the String variable char[] newValue = value.toCharArray(); //
 * Breaking the String into characters and storing into Char[]
 * 
 * // Declaring HasMap object HashMap<Character, Integer> mapObj = new
 * HashMap<>();
 * 
 * // Using advance loop and for (char c : newValue) { if
 * (mapObj.containsKey(c)) {
 * 
 * mapObj.put(c, mapObj.get(c) + 1); } else { mapObj.put(c, 1); } } for (Entry
 * newObj : mapObj.entrySet()) { System.out.println(newObj.getKey() + " " +
 * newObj.getValue()); } }
 */

