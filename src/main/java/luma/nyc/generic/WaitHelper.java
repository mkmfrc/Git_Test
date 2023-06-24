package luma.nyc.generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import luma.nyc.basepage.SuperClass;

public class WaitHelper extends SuperClass{
	
	public static void waitForElements(WebElement we) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(we))	;
	}
	
	

}
