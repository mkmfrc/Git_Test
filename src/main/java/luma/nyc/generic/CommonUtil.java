package luma.nyc.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.Augmenter;
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

	public static void highLighterMethod(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', 'background: green; border: 2px solid red;');", element);
	}

	public static String captureScreen() { //This will create new file while taking screenshot
		String path;
		try {
			driver = new Augmenter().augment(driver);
			File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			path = "./Screenshots/" + source.getName();
			FileUtils.copyFile(source, new File(path));
		} catch (IOException e) {
			path = "Failed to capture screenshot: " + e.getMessage();
		}
		return path;
	}
	
	public static void captureScreenshot(WebDriver driver, String screenshotName) throws IOException {
		//This will replace the file while taking screenshot
			TakesScreenshot ts = (TakesScreenshot) driver; //Creating an intense of TakesScreenshot
			File source = ts.getScreenshotAs(OutputType.FILE); //OutputType is a selenium class
			FileHandler.copy(source, new File("./Screenshots/" + screenshotName + ".png"));
		} 
}
