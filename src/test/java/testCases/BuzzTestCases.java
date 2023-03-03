package testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import generic.Base;
import pages.CommonPagesInOrangeHRM;
import pages.OrangeLoginPage;

public class BuzzTestCases extends Base {

	OrangeLoginPage loginPage;
	CommonPagesInOrangeHRM commonPage;

	@Parameters({ "userName" })
	@Test
	public void ValidateUserCanWriteAPostAndDeleteTheSame(String userName) throws Exception {

		test = extent.createTest("Login Functional test");
		loginPage = new OrangeLoginPage(getDriver());
		test.log(Status.INFO, "Login OrangeHRM");
		test.log(Status.INFO, "Opening Browser");
		test.log(Status.INFO, "Enter user Credentials");
		loginPage.loginOrangeHRM(userName, "admin123");
		test.log(Status.FAIL, "Server Error");
		test.log(Status.PASS, "Logined IN Pass");
		commonPage = new CommonPagesInOrangeHRM(getDriver());
		commonPage.gotoAnyPagesInOrangeHRM("Buzz");
		commonPage.validateAnyPagesInOrangeHRM("Buzz");

	}

	@Test
	public void testingWithPropFile() throws Exception {
		loginPage = new OrangeLoginPage(getDriver());
		loginPage.loginOrangeHRM();
		commonPage = new CommonPagesInOrangeHRM(getDriver());
		commonPage.gotoAnyPagesInOrangeHRM("Buzz");
		commonPage.validateAnyPagesInOrangeHRM("Buzz");

	}

}
