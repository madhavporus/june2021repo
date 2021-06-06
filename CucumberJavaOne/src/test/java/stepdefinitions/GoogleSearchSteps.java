package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;

public class GoogleSearchSteps {
	WebDriver driver=null;
	GoogleSearchPage gsp;
		

	@Given("User launches a browser")
	public void user_launches_a_browser() {
		String userdir = System.getProperty("user.dir");
		//System.out.println(">>> Path is>>"+userdir);
		//C:\Users\global\eclipse-workspace\CucumberJavaOne
		System.setProperty("webdriver.chrome.driver", userdir+"/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		gsp = new GoogleSearchPage(driver);
				
		System.out.println(">>> Given user opens browser");
	}

	@And("navigates to the {string}")
	public void navigates_to_the(String string) {
		driver.get(string);
		System.out.println(">>>User navigates to google.com");
	}

	@When("^user search for \"(.*)\"$")
	public void user_search_for_kalam(String searchWord) {
		System.out.println(">>> User word is>>"+searchWord);
		gsp.searchGoogle(searchWord);
		
	}

	@Then("^User must see the search result page with \"(.*)\"$")
	public void user_must_see_the_search_result_page_with_kalam_google_search(String exptitle) {
		System.out.println(">>THE TITLE IS>>"+gsp.searchPageTitle());
		Assert.assertEquals(exptitle, gsp.searchPageTitle());
		System.out.println(">>>Usaer must see the expected page title");
		driver.close();
	}

	
}
