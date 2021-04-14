package testcases;

import org.testng.annotations.Test;

import base.TestBase;

public class CreateAccountPageTestCases extends TestBase {

	@Test(groups= {"CreateAccount", "SmokeTest", "Regression"})
	public void CreateAccountTest_01() throws InterruptedException {
		
		homepageObj.getSignIn().click();
		Thread.sleep(5000);
		signInPageObj.setCreateEmailID("santosh@test.com");
		
		signInPageObj.getcreateAccountButton().click();
		
		Thread.sleep(5000);
		createAccountPageObj.setFirstname("Santosh");
		createAccountPageObj.setLastname("Kumar");
		createAccountPageObj.setPassword("123456");
		createAccountPageObj.getnewsletter().click();
		
		createAccountPageObj.setCustomerFirstname("Santosh");
		createAccountPageObj.setCustomerLastname("kumar");
		createAccountPageObj.setCompanyname("ABC");
		createAccountPageObj.setAddress1("miyapur");
		createAccountPageObj.setAddress2("hydernagar");
		createAccountPageObj.setCity("hyd");
		createAccountPageObj.setPostcode("500049");
		
		createAccountPageObj.SetDate("2  ");
		createAccountPageObj.SetMonth("January ");
		createAccountPageObj.SetYear("2019  ");
		
		
	}
	
	@Test(groups= {"CreateAccount", "Regression"})
	public void CreateAccountTest_02() throws InterruptedException {
		homepageObj.getSignIn().click();
		Thread.sleep(5000);
		signInPageObj.setCreateEmailID("pavan@test.com");
		
		signInPageObj.getcreateAccountButton().click();
		
		Thread.sleep(5000);
		createAccountPageObj.setFirstname("pavan");
		createAccountPageObj.setLastname("Kumar");
		createAccountPageObj.setPassword("123456");
		createAccountPageObj.getnewsletter().click();
		
		createAccountPageObj.setCustomerFirstname("pavan");
		createAccountPageObj.setCustomerLastname("kumar");
		createAccountPageObj.setCompanyname("ABC");
		createAccountPageObj.setAddress1("miyapur");
		createAccountPageObj.setAddress2("hydernagar");
		createAccountPageObj.setCity("hyd");
		createAccountPageObj.setPostcode("500049");
	}
	
}
