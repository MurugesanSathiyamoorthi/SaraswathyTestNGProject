package testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import generic.Base;
import pages.CommonPagesInOrangeHRM;
import pages.OrangeLoginPage;

public class BuzzTestCases extends Base {
	
	OrangeLoginPage loginPage;
	CommonPagesInOrangeHRM commonPage;
	
	
		
		
	
	@Parameters({"userName"})
	@Test
	public void ValidateUserCanWriteAPostAndDeleteTheSame(String userName) throws Exception {
		ExtentTest test= extent.createTest("Validate user").assignAuthor("Saras")
				.assignCategory("Functional test case").assignDevice("Windows");
		test.info("Validate user");
		loginPage = new OrangeLoginPage(getDriver());
		loginPage.loginOrangeHRM(userName,"admin123");
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
