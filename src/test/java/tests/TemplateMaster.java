package tests;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.FinanceSetupMenu;
import pageobjects.FinanceTemplateMasterPage;
import pageobjects.HomePage;
import pageobjects.LoginPage;
import resources.Base;

public class TemplateMaster extends Base {
	public WebDriver driver;
	public Logger log;
	
	@Test
	public void CreateTemplateMaster() throws IOException, InterruptedException { 
	
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
	HomePage home=new HomePage(driver);
	Assert.assertTrue(home.Setup().isDisplayed());
	home.Setup().click();
	FinanceSetupMenu finsetup=new FinanceSetupMenu(driver);
	finsetup.LedgerOpening().click();
	finsetup.TemplateMaster().click();
	FinanceTemplateMasterPage template=new FinanceTemplateMasterPage(driver);
	Thread.sleep(1000);
	Assert.assertTrue(login.LoginPassword().isDisplayed());
	String TemplateCreation=template.LabelPageCaption().getText();
	log.debug(TemplateCreation);
	
	}
	

}
