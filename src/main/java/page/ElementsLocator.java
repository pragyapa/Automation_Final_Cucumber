package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ElementsLocator extends TestBase{
	WebDriver driver;

	public ElementsLocator() {
		this.driver = driver;
	}
	
//	Element Locator
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")
	WebElement SetSkyBlueBackground;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")
	WebElement SetWhiteBackground;
	
//	Methods to interact with the elements
	public void SkyBlueBackground() {
		SetSkyBlueBackground.click();
	}
	
	public void WhiteBackground() {
		SetWhiteBackground.click();
	}
	
	public String getPageTitle() {
		return driver.getTitle();
			}
	
}



