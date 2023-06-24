package luma.nyc.hooks;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import luma.nyc.basepage.SuperClass;
import luma.nyc.elementspage.LumaPageFactory;

public class LumaHooks extends SuperClass  {
	
	LumaPageFactory pf;
	
	@Before
	public void setUp() {
		initialization();
		
		pf= PageFactory.initElements(driver, LumaPageFactory.class);
		pf.getLogin();

	} 

	//@After
	public void tearDown() {
		driver.quit();
	}
}
