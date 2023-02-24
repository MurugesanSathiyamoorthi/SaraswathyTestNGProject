package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminPage {
	
	@FindBy(xpath="//span[@class='oxd-topbar-body-nav-tab-item' and text()='User Management ']")
	WebElement dropdown_UserManagement;
	
	@FindBy(xpath="//span[@class='oxd-topbar-body-nav-tab-item' and text()='Job ']")
	WebElement dropdown_Job;
	
	@FindBy(xpath="//span[@class='oxd-topbar-body-nav-tab-item' and text()='Organization ']")
	WebElement dropdown_Organization;
	
	@FindBy(xpath="//span[@class='oxd-topbar-body-nav-tab-item' and text()='Qualifications  ']")
	WebElement dropdown_Qualifications;
	
	@FindBy(xpath="//span[@class='oxd-topbar-body-nav-tab-item' and text()='Configuration  ']")
	WebElement dropdown_Configuration;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='Users']")
	WebElement dropdownlink_User;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='Job Titles']")
	WebElement dropdownlink_JobTitles;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='Pay Grades']")
	WebElement dropdownlink_PayGrades;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='Employment Status']")
	WebElement dropdownlink_EmploymentStatus;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='Job Categories']")
	WebElement dropdownlink_JobCategories;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='Work Shifts']")
	WebElement dropdownlink_WorkShifts;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='General Information']")
	WebElement dropdownlink_GeneralInformation;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='Locations']")
	WebElement dropdownlink_Locations;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='Structure']")
	WebElement dropdownlink_Structure;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='Skills']")
	WebElement dropdownlink_Skills;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='Education']")
	WebElement dropdownlink_Education;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='Licenses']")
	WebElement dropdownlink_Licenses;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='Languages']")
	WebElement dropdownlink_Languages;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='Memberships']")
	WebElement dropdownlink_Memberships;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='Email Configuration']")
	WebElement dropdownlink_EmailConfiguration;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='Email Subscriptions']")
	WebElement dropdownlink_EmailSubscriptions;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='Localization']")
	WebElement dropdownlink_Localization;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='Language Packages']")
	WebElement dropdownlink_LanguagePackages;
	
	@FindBy(xpath="//a[@class='oxd-topbar-body-nav-tab-link' and text()='Modules']")
	WebElement dropdownlink_Modules;
	
	
	
	
	
	
	
	public void dropDownTileinUserManagementPage(String dropDownTitle) {
		switch(dropDownTitle) {
		case"User": dropdown_UserManagement.click();
		break;
		case"Job": dropdown_Job.click();
		break;
		case"Organization": dropdown_Organization.click();
		break;
		case"Qualifications": dropdown_Qualifications.click();
		break;
		case"Configurations": dropdown_Configuration.click();
		break;
		}
	}

	public static void main(String[] args) {
	

	}

}
