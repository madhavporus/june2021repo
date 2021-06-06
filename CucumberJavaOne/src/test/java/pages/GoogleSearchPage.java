package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

	WebDriver driver;
	
	@FindBy(how = How.XPATH, using="//input[@name='q']")
	WebElement searchInputBox;
	
	
	public GoogleSearchPage(WebDriver idriver) {
		this.driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void searchGoogle(String str) {
		searchInputBox.sendKeys(str);
		searchInputBox.sendKeys(Keys.RETURN);
					
	}
	
	public String searchPageTitle() {
		return driver.getTitle();
	}
	
	
}
