package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinanceSetupMenu {

	WebDriver driver;

	public FinanceSetupMenu(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	//Ledger Section Start
	@FindBy(css = "tr[class='treegrid-1 treegrid-expanded'] span[class='treegrid-expander glyphicon glyphicon-chevron-right']")
	private WebElement LedgerOptionOpening;
	@FindBy(id = "grdAdvSearchdtlrow1col1")
	private WebElement TemplateMaster;
	@FindBy(id = "grdAdvSearchdtlrow2col1")
	private WebElement ChartOfAccountMaster;
	@FindBy(id = "grdAdvSearchdtlrow3col1")
	private WebElement GroupMaster;
	@FindBy(id = "grdAdvSearchdtlrow4col1")
	private WebElement AccountHeadMaster;
	@FindBy(id = "grdAdvSearchdtlrow5col1")
	private WebElement SubLedgerGroupCategory;
	@FindBy(id = "grdAdvSearchdtlrow6col1")
	private WebElement SubLedgerGroupSubState;
	@FindBy(id = "grdAdvSearchdtlrow1col1")
	private WebElement SameAsFreeSubLedgerTagging;
	@FindBy(id = "grdAdvSearchdtlrow1col1")
	private WebElement LedgerControlAccountTransfer;
	@FindBy(id = "grdAdvSearchdtlrow1col1")
	private WebElement HoldingSubsidiaryCompanyMaster;

	public WebElement LedgerOpening() {
		return LedgerOptionOpening;
	}
	public WebElement TemplateMaster() {
		return TemplateMaster;
	}
	public WebElement ChartOfAccountMaster() {
		return ChartOfAccountMaster;
	}
	public WebElement GroupMaster() {
		return GroupMaster;
	}
	public WebElement AccountHeadMaster() {
		return AccountHeadMaster;
	}
	public WebElement SubLedgerGroupCategory() {
		return SubLedgerGroupCategory;
	}
	public WebElement SubLedgerGroupSubState() {
		return SubLedgerGroupSubState;
	}
	public WebElement SameAsFreeSubLedgerTagging() {
		return SameAsFreeSubLedgerTagging;
	}
	public WebElement LedgerControlAccountTransfer() {
		return LedgerControlAccountTransfer;
	}
	public WebElement HoldingSubsidiaryCompanyMaster() {
		return HoldingSubsidiaryCompanyMaster;
	}
	//Ledger Section End
	
}
