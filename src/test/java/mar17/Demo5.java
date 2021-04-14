package mar17;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Demo5 {
	 @Test
	  public void test1() {
		  System.out.println("i am from test1");
	  }
	  
	  @Test
	  public void test2() {
		  System.out.println("i am from test2");
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("i am from Before Method");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("i am from After Method");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("i am from before Class");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("i am from after class");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("I am from before Test");
	  }
	
	  @AfterTest
	  public void afterTest() {
		  System.out.println("I am from After Test");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("I am from Before Suite");
	  }
	
	  @AfterSuite
	  public void afterSuite() {
		  	System.out.println("i am from After Suite");
	  }

}
