package stepdefinition;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageobjects.SubscriptionPage;
import cucumber.api.java.en.Then;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubscriptionSteps {
	WebDriver driver;
	SubscriptionPage anna;
	@Before
	public void Start_Test()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Driver\\chromedriver.exe");
		this.driver = new ChromeDriver();
		this.anna = new SubscriptionPage(this.driver);
	}
	@Given("^The user open the page with subscription function$")
    public void theUserOpenThePageWithSubscriptionFunction() {
        anna.openWebPage();
    }

    @When("^the user provide the email already subscribed before such as \"([^\"]*)\"$")
    public void theUserProvideTheEmailAlreadySubscribedBeforeSuchAsSomething(String email) {
        anna.subcribesWith(email);
    }

    @Then("^The user should see the notification \"([^\"]*)\"$")
    public void theUserShouldSeeTheNotificationSomething(String message) {
        anna.should_see_the_popup_message(message);
    }
    
    @After
    public void Finish_Test()
    {
    	this.driver.quit();
    }
}