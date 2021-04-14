package mar17;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Demo2 {
  @Test
  public void test1() {
	  System.out.println("i am from test1");
  }
 
  @BeforeClass
  public void beforeClass() {
	  System.out.println("i am from before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("i am from after Class");
  }

  @Test
  public void test2() {
	  System.out.println("i am from test2");
  }
}
