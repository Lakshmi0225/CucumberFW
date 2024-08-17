package stepdef;

import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import io.cucumber.java.en.*;

public class Googlestepdef {
	public WebDriver driver;
	public String actT;

	@Given("open the google application")
	public void open_the_google_application() {
	 driver=new ChromeDriver();
	 driver.get("https://www.google.com");
	 
	}

	@When("capture current title")
	public void capture_current_title() {
		String expT = "Google";
		actT = driver.getTitle();
	    
	}

	@Then("title should match")
	public void title_should_match() {
		Assert.assertTrue(actT.contains("Google"),"Title is not matched");
		   Reporter.log("Title is matched TC is passed",true);
		   driver.quit();
}
}
