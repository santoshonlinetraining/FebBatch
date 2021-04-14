package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class HomePageTest extends TestBase {
	
	@Test(groups= {"Regression", "Homepage"})
	void contactUsPage_01() throws InterruptedException {
		String contactUsPageText = "CUSTOMER SERVICE - CONTACT US";
		
		homepageObj.getContactUs().click();
		Thread.sleep(5000);
		String textFromWeb = contactUsPageObj.getContactUs().getText();
		
		Assert.assertTrue(contactUsPageText.equals(textFromWeb));
		
		Assert.assertEquals(contactUsPageText, textFromWeb);
	}
	
	
	@Test(groups= {"Regression", "Homepage", "SmokeTest"})
	void verifySignPage_01() {
		
		String signInPageText = "AUTHENT";
		homepageObj.getSignIn().click();
		String webText = signInPageObj.getSignInPageText().getText();
		
		Assert.assertTrue(signInPageText.equals(webText));
		
		
		
	}
	
}
