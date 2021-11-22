package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinanceTemplateMasterPage {
	WebDriver driver;
	public FinanceTemplateMasterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
@FindBy(id="lblPageCaption")
 private WebElement LabelPageCaption;

public WebElement LabelPageCaption() {
	return LabelPageCaption;
}

}
