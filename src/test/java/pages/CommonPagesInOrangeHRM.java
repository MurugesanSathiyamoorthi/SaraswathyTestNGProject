package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CommonPagesInOrangeHRM {
	
	private WebDriver driver;
	
	public CommonPagesInOrangeHRM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement link_Search;
	
	@FindBy(xpath="//span[text()='Admin']")
	WebElement link_Admin;
	
	@FindBy(xpath="//span[text()='PIM']")
	WebElement link_PIM;
	
	@FindBy(xpath="//span[text()='Leave']")
	WebElement link_Leave;
	
	@FindBy(xpath="//span[text()='Time']")
	WebElement link_Time;
	
	@FindBy(xpath="//span[text()='Recruitment']")
	WebElement link_Recruitment;

	@FindBy(xpath="//span[text()='My Info']")
	WebElement link_MyInfo;
	
	@FindBy(xpath="//span[text()='Performance']")
	WebElement link_Performance;
	
	@FindBy(xpath="//span[text()='Dashboard']")
	WebElement link_Dashboard;
	
	@FindBy(xpath="//span[text()='Directory']")
	WebElement link_Directory;
	
	@FindBy(xpath="//span[text()='Maintenance']")
	WebElement link_Maintenance;
	
	@FindBy(xpath="//span[text()='Buzz']")
	WebElement link_Buzz;
	
	@FindBy(xpath="//p[@class='oxd-userdropdown-name']")
	WebElement link_NameDropdown;
	
	@FindBy(xpath="//a[text()='About']")
	WebElement link_About;
	
	@FindBy(xpath="//a[text()='Support']")
	WebElement link_Support;
	
	@FindBy(xpath="//a[text()='Change Password']")
	WebElement link_ChangePassword;
	
	@FindBy(xpath="//a[text()='Logout']")
	WebElement link_Logout;
	
	@FindBy(xpath="//i[@class='oxd-icon bi-chevron-left']")
	WebElement class_maximize;
	
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement link_LandingPageTitle;
	
	@FindBy(xpath="//h6[text()='Administrator Access']")
	WebElement link_AdministratorAccess;
	
	
	
	public void validateLandingPage() {
		Assert.assertEquals(link_LandingPageTitle.getText(), "Dashboard");
	}
	
	public void ValidateAdmintab() {
		link_Admin.click();
		Assert.assertEquals(link_Admin.getText(), "Admin\r\n"+ "User Management");
	}
	
	public void ValidatePIMtab() {
		link_PIM.click();
		Assert.assertEquals(link_PIM.getText(), "PIM");
	}
	
	public void goToAnyPageInOrangeHRM(String pageName) {
		switch(pageName) {
		case "Admin":
			link_Admin.click();
			break;
		case "PIM":
			link_PIM.click();
			break;
		case "Buzz":
			link_Buzz.click();
			break;
		case "Email Configuration":
//			click Admin link
//			click configuration
//			click Email configuration
		break;
		}
	}
	
	@FindBy(xpath = "//span[@class = 'oxd-topbar-header-breadcrumb']/h6")
	WebElement text_PageTitle;
	
	
	
	public void validateAPageInOrangeHRM(String pageName) {
		switch(pageName) {
		case "Admin":
			Assert.assertEquals(text_PageTitle.getText(), pageName);
			break;
		case "PIM":
			Assert.assertEquals(text_PageTitle.getText(), pageName);
			break;
		case "Email Configuration":
			break;
		case "Buzz":
			Assert.assertEquals(text_PageTitle.getText(), pageName);
		}
	}
	
	
	public void ValidateLeavetab() {
		link_Leave.click();
		Assert.assertEquals(link_Leave.getText(), "Leave");
	}
	
	public void ValidateTimetab() {
		link_Time.click();
		Assert.assertEquals(link_Leave.getText(), "Time\r\n"+ "Timesheets");
	}
	
	
	public void ValidateRecruitmenttab() {
		link_Recruitment.click();
		Assert.assertEquals(link_Recruitment.getText(), "Recruitment");
	}
	
	
	public void ValidateMyInfotab() {
		link_MyInfo.click();
		Assert.assertEquals(link_MyInfo.getText(), "PIM");
	}
	
	
	public void ValidatePerformancetab() {
		link_Performance.click();
		Assert.assertEquals(link_Performance.getText(), "Performance\r\n"+ "Manage Reviews");
	}
	
	
	public void ValidateDashboardtab() {
		link_Dashboard.click();
		Assert.assertEquals(link_Dashboard.getText(), "Dashboard");
	}
	
	
	public void ValidateDirectorytab() {
		link_Directory.click();
		Assert.assertEquals(link_Directory.getText(), "Directory");
	}
	
	public void ValidateMaintenancetab() {
		link_Maintenance.click();
		Assert.assertEquals(link_Maintenance.getText(), link_AdministratorAccess.getText());
	}
	
	public void ValidateBuzztab() {
		link_Buzz.click();
		Assert.assertEquals(link_Buzz.getText(), "Buzz");
	}
	
	
	public static void main(String[] args) {
		
		

	}

}
