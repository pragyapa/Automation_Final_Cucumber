package steps;



import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.ElementsLocator;
import page.TestBase;

public class TestSteps extends TestBase{
	ElementsLocator ElementsLocatorObj;
	
	@Before
	public void beforeRun() {
		initDriver();
		ElementsLocatorObj = PageFactory.initElements(driver, ElementsLocator.class);
	}
	
	@Given ("^User is on the Techfios test page$")
	public void User_is_on_the_Techfios_test_page() throws InterruptedException {
		driver.get("https://techfios.com/test/101/");
		Thread.sleep(2000);
	}
	
	
	@When ("^I click on the set blue background button$")
	public void I_click_on_the_set_blue_background_button(){
		ElementsLocatorObj.SkyBlueBackground();
	}
	
	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() {
		ElementsLocatorObj.SkyBlueBackground();
	}
	
	@When ("^I click on the set white background button$")
	public void I_click_on_the_set_white_background_button() {
		ElementsLocatorObj.WhiteBackground();
	}
	
	@Then ("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
		ElementsLocatorObj.WhiteBackground();
	}


	
	
//@After
//public void tearDown() {
//	driver.close();
//	driver.quit();
//}
}

	




