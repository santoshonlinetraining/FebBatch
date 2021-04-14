package mar17;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Demo1 {
  
  @Test
  public void test1() {
	  System.out.println("I am from test1");
  }
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am from before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am from after method");
  }
  
  @Test
  public void test2() {
	  System.out.println("i am from test2");
  }

}
