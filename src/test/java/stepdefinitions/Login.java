package stepdefinitions;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import resources.Base;

public class Login extends Base {

	WebDriver driver;
	LoginPage login;
	HomePage home;

	@Given("^Open any Browser$")
	public void open_any_browser() throws IOException {
		driver = LaunchBrowser();
	}
	@And("^Navigate to Login page$")
	public void navigate_to_login_page() {
		driver.get(prop.getProperty("url"));
	}
	@When("^User enters username as \"([^\"]*)\" and password as \"([^\"]*)\" into the fields$")
	public void user_enters_username_as_something_and_password_as_something_into_the_fields(String username,
			String password) {
		login = new LoginPage(driver);
		login.LoginUserName().sendKeys(prop.getProperty("username"));
		login.LoginPassword().sendKeys(prop.getProperty("password"));
	}
	@And("^User clicks on Login button$")
	public void user_clicks_on_login_button() throws InterruptedException {
		login.LoginButton().click();
		Thread.sleep(3000);
	}
	@Then("^Verify user is able to successfully login$")
	public void verify_user_is_able_to_successfully_login() throws InterruptedException {
		home=new HomePage(driver);
		Assert.assertTrue(home.Setup().isDisplayed());
		Thread.sleep(3000);;
	}
	@After
	public void closeBrowser() {
		driver.close();
	}

}
