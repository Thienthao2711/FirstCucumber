package pageobjects;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SubscriptionPage {
	By txtSubscribe = By.cssSelector(".subscription input[type=\"email\"]");
	By alertPopup = By.cssSelector("div.alert");
	By alertContent = By.cssSelector("div.alert .body-message");
	
	WebDriver driver;
	public SubscriptionPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void openWebPage()
	{
		this.driver.get("http://testmaster.vn/");
		this.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public void subcribesWith(String email)
	{
		this.driver.findElement(txtSubscribe).sendKeys(email);
		this.driver.findElement(txtSubscribe).sendKeys(Keys.ENTER);
	}
	
	public void should_see_the_popup_message(String message)
	{
		WebDriverWait waiter = new WebDriverWait(this.driver, 10);
		WebElement popup = waiter.until(ExpectedConditions.presenceOfElementLocated(alertPopup));
		String content = popup.findElement(alertContent).getAttribute("innerText");
		assertEquals(message, content);
	}
}
