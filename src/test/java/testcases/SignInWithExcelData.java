package testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.WelcomeHomePage;
import com.relevantcodes.extentreports.LogStatus;

public class SignInWithExcelData extends TestBase {
	public Logger log = LogManager.getLogger(LogTest.class.getName());
	
	@Test(groups= {"Login", "Homepage", "SmokeTest"})
	public void LoginTestcase_01() throws InterruptedException {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "test1 i am running");

		log.info("fetch the username and password from excelsheet");
		logger.log(LogStatus.INFO, "fetch the username and password from excelsheet");
		int rowCount = datatable.getRowCount("logincred");
		String username = datatable.getCellData("logincred", "username", 2);
		String password = datatable.getCellData("logincred", "password", 2);
		
		//beow are the username and password
		log.info("Row count of sheet " + rowCount);
		log.info("Username " + username);
		log.info("Password " + password);
		
		homepageObj.getSignIn().click();
		
		signInPageObj.setEmailID(username);
		signInPageObj.setPassword(password);
		
		Thread.sleep(5000);
		
		signInPageObj.getSubmitButton().click();
		
		try {
			if(welcomeHomePageObj.getMyAccountText().getText().equals("MY ACCOUNT")) {
				log.info("logged in successfully");
				logger.log(LogStatus.PASS, "Test Pass");
				Assert.assertTrue(true);
			}	
		}
		catch(Exception e) {
			log.error("Login to the application is failed with these id and passwords" + username +" "+ password);
			Assert.assertTrue(false);
			logger.log(LogStatus.FAIL, "Test Failed due to mismatch of id and passwords");
		}
		
		
  }
	
	@Test(groups= {"Login", "Homepage"})
	public void LoginTestcase_02() throws InterruptedException {
		String TestcaseId = new Object() {}.getClass().getEnclosingMethod().getName();
		logger = extent.startTest(TestcaseId, "test1 i am running");
		
		log.info("fetc the username and password from excelsheet");
		logger.log(LogStatus.INFO, "fetch the username and password from excelsheet");
		
		int rowCount = datatable.getRowCount("logincred");
		String username = datatable.getCellData("logincred", "username", 3);
		String password = datatable.getCellData("logincred", "password", 3);
		
		log.info("Row count of sheet " + rowCount);
		log.info("Username " + username);
		log.info("Password " + password);
		
		homepageObj.getSignIn().click();
		
		signInPageObj.setEmailID(username);
		signInPageObj.setPassword(password);
		
		Thread.sleep(5000);
		
		signInPageObj.getSubmitButton().click();
		
		try {
			if(welcomeHomePageObj.getMyAccountText().getText().equals("MY ACCOUNT")) {
				log.info("logged in successfully");
				Assert.assertTrue(true);
				logger.log(LogStatus.PASS, "Test Pass");
			}	
		}
		catch(Exception e) {
			log.error("Login to the application is failed with these id and passwords" + username +" "+ password);
			logger.log(LogStatus.FAIL, "Test Failed due to mismatch of id and passwords");
			Assert.assertTrue(false);
			
		}

  }
	
}
