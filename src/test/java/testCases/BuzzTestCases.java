package testCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import generic.Base;
import pages.CommonPagesInOrangeHRM;
import pages.OrangeLoginPage;

public class BuzzTestCases extends Base {
	
	OrangeLoginPage loginPage;
	CommonPagesInOrangeHRM commonPage;
	
	@Parameters({"userName"})
	@Test
	public void ValidateUserCanWriteAPostAndDeleteTheSame(String userName) throws Exception {
		loginPage = new OrangeLoginPage(getDriver());
		loginPage.loginOrangeHRM(userName, "admin123");
		commonPage = new CommonPagesInOrangeHRM(getDriver());
		commonPage.goToAnyPageInOrangeHRM("Buzz");
		commonPage.validateAPageInOrangeHRM("Buzz");
	}
	
	@Test
	public void testingWithPropFile() throws Exception {
		loginPage = new OrangeLoginPage(getDriver());
		loginPage.loginOrangeHRM();
		commonPage = new CommonPagesInOrangeHRM(getDriver());
		commonPage.goToAnyPageInOrangeHRM("Buzz");
		commonPage.validateAPageInOrangeHRM("Buzz");
	}

}
