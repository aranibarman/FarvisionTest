package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageobjects.LoginPage;
import resources.Base;

public class LoginTests extends Base{
	public WebDriver driver;
	Logger log;
	@Test
	public void login() throws IOException, InterruptedException {
		
		log = LogManager.getLogger(LoginTests.class.getName());
		driver=LaunchBrowser();
		log.debug("Launch Browser");
		driver.get(prop.getProperty("url"));
		log.debug("Application Launched");
		LoginPage login=new LoginPage(driver);
		
		login.LoginUserName().sendKeys(prop.getProperty("username"));
		login.LoginPassword().sendKeys(prop.getProperty("password"));
		login.LoginButton().click();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}