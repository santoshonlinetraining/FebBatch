package testcases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.TestBase;

public class SignInWithTestNGParameters extends TestBase {
  
  @Test
  @Parameters({"username","password"})
  public void login(String uname, String pword) {
	  
	homepageObj.getSignIn().click();
	
	signInPageObj.setEmailID(uname);
	signInPageObj.setPassword(pword);
	signInPageObj.getSubmitButton().click();
	  
  }
}
