package luma.nyc.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a {

	public static void main(String[] args) {
		
	        // Set the path to the chromedriver executable
			WebDriverManager.chromedriver().setup();

	        // Create ChromeOptions object
	        ChromeOptions options = new ChromeOptions();

	        // Add the "--incognito" argument to the options
	        options.addArguments("--incognito");

	        // Create a new instance of ChromeDriver with the options
	        WebDriver driver = new ChromeDriver(options);

	        // Perform actions on the browser
	        driver.get("https://www.example.com");

	        // Close the browser
	        
	    }
	

	}


