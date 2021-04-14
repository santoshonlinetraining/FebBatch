package mar17;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Demo3 {
  @Test
  public void test1() {
	  System.out.println("i am from test1");
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
  
  @Test
  public void test2() {
	  System.out.println("i am from test2");
  }

  @Test
  public void test3() {
	  System.out.println("i am from test3");
  }
}
