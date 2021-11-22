package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="txtusername")
	private WebElement LoginUserName;
	@FindBy(id="txtpassword")
	private WebElement LoginPassword;
	@FindBy(className = "fa fa-eye")
	private WebElement ShowPassword;
	@FindBy(id="btnlogin")
	private WebElement LoginButton;
	
	@FindBy(linkText = "Forgot your password?")
	WebElement ForgotPassword;
	public WebElement LoginUserName() {
		return LoginUserName;
	}
	public WebElement LoginPassword() {
		return LoginPassword;
	}
	public WebElement ShowPassword() {
		return ShowPassword;
	}
	public WebElement LoginButton() {
		return LoginButton;	
	}
	public WebElement ForgotPassword() {
		return ForgotPassword;
	}
	

}
