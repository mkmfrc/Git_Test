package luma.nyc.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import luma.nyc.basepage.SuperClass;

public class CommonUtil extends SuperClass {

	public static Actions ac;
	
	public static void hoverOver(WebElement we) {
		ac = new Actions(driver);
		ac.moveToElement(we).build().perform();
	}
	//public static void methodHighlighter(WebElement we) {}
	
	public static void getAssertion(String actual, String expected) {
		Assert.assertEquals(actual, expected);
		System.out.println("Desired value" + actual);
	}

	public static void actionClick(WebElement ele) {
		ac = new Actions(driver);
		ac.click(ele).build().perform();
	}
	
	public static void jsClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", ele);
	}
	
}
