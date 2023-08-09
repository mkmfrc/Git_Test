package codingExcerciseFinal;

import org.testng.annotations.Test;

public class BreakLoopAndContinue {

	//@Test
		void brake() {
		
		for(int i =0; i<10; i++) {	
									//using loop i am going to break the value  
			//then i am going to apply java if condition and passing the value where i want to break the loop 
									// and then applying break keyword 
			if(i==7) {
				break;
				
			}
			}}
		//@Test
		void continiue() {
			for(int i =0; i<10; i++) {
									//using loop i am going to break the value  
				//then i am applying java if condition and passing the value where i want to skip and continue the loop 
									// and then applying continue keyword
				if(i==7) {
					continue;
				}}}
}
