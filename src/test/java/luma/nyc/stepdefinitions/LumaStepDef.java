package luma.nyc.stepdefinitions;

import io.cucumber.java.en.*;
import luma.nyc.basepage.SuperClass;
import luma.nyc.elementspage.LumaPageFactory;
import luma.nyc.generic.CommonUtil;
import luma.nyc.generic.WaitHelper;

public class LumaStepDef extends SuperClass {

	LumaPageFactory pf;

	@Given("User already logged in the application and verify the user information on the landing page")
	public void user_already_logged_in_the_application_and_verify_the_user_information_on_the_landing_page() {

		pf = new LumaPageFactory();

		WaitHelper.waitForElements(pf.getVerifyUserInfo());
		CommonUtil.getAssertion(pf.getVerifyUserInfo().getText(), prop.getProperty("WelcomeText"));
	}

	@When("User should be able to select jacket from men module")
	public void user_should_be_able_to_select_jacket_from_men_module() {
		pf = new LumaPageFactory();
		
		WaitHelper.waitForElements(pf.getSelectMen());
		CommonUtil.hoverOver(pf.getSelectMen());

		WaitHelper.waitForElements(pf.getSelectTops());
		CommonUtil.hoverOver(pf.getSelectTops());

		WaitHelper.waitForElements(pf.getClickJacket());
		CommonUtil.actionClick(pf.getClickJacket());

	}

	@When("Verify the jacket name on the {string} list")
	public void verify_the_jacket_name_on_the_list(String string) {
		pf = new LumaPageFactory();
		
		WaitHelper.waitForElements(pf.getJacketsName());
		CommonUtil.getAssertion(pf.getJacketsName().getText(), "Montana Wind Jacket");
		
		CommonUtil.actionClick(pf.getJacketsName()); //Clicking on jacket name
	}

	@When("User should be able to select the {string} and {string} and {string} then click on the add to cart")
	public void user_should_be_able_to_select_the_and_and_then_click_on_the_add_to_cart(String string, String string2,
			String string3) {
		pf = new LumaPageFactory();
		
		pf.getJacket();
	}

	@When("User should be able to click on the cart")
	public void user_should_be_able_to_click_on_the_cart() {
		pf = new LumaPageFactory();
		
		WaitHelper.waitForElements(pf.clickShoppingCart());
		CommonUtil.jsClick(pf.clickShoppingCart());
	}

	@When("User should be able to click on the checkout")
	public void user_should_be_able_to_click_on_the_checkout() {
		pf = new LumaPageFactory();
		
		WaitHelper.waitForElements(pf.clickCheckOut());
		CommonUtil.jsClick(pf.clickCheckOut());  		
	}

	@When("User should be able to enter the shipping details and click on the Next")
	public void user_should_be_able_to_enter_the_shipping_details_and_click_on_the_next() {
		pf = new LumaPageFactory();
		
		pf.enterCustomerDetails();
		
		
	}

	@When("User should be able to verify the shipping address and place the order")
	public void user_should_be_able_to_verify_the_shipping_address_and_place_the_order() {

	}

	@Then("User should be able to verify the order number and get text on the screen {string}")
	public void user_should_be_able_to_verify_the_order_number_and_get_text_on_the_screen(String string) {

	}
}
