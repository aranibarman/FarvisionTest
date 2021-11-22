package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
		WebDriver driver;
		public HomePage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(className ="fa fa-th-large")
		private WebElement Widget;
		
		@FindBy (id="lnkSetup")
		private WebElement Setup;
		
		@FindBy (id="firstName")
		private WebElement Username;
		
		@FindBy(className="caret")
		private WebElement caret;

		@FindBy(id="lnkModule")
		private WebElement ModuleSelector;
		
		public WebElement Widget() {
			return Widget;
		}

		public WebElement Setup() {

			return Setup;
		}

		public WebElement Username() {

			return Username;
		}

		public WebElement caret() {

			return caret;
		}

		public WebElement ModuleSelector() {

			return ModuleSelector;
		}

}
