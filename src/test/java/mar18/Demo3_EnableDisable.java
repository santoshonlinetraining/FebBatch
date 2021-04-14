package mar18;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class Demo3_EnableDisable {
	WebDriver driver;
	
  @Test(priority=1, enabled=true)
  public void test() {
	  	Actions act = new Actions(driver);
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Women']"));
		
		act.moveToElement(link).build().perform();
		
		driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[1]")).click();
  }

  @BeforeMethod
  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\FebBatch\\drivers\\chrome\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://www.automationpractice.com");
  }

  @AfterMethod
  public void afterClass() {
	  driver.close();
  }
  
  @Test(priority=2, enabled=false)
  public void test2() {
	  
	  driver.findElement(By.xpath("(//a[contains(text(),'Faded Short Sleeve T-shirts')])[1]")).click();
	  String getDressName = driver.findElement(By.xpath("(//h1[contains(text(),'Faded Short Sleeve T-shirts')])[1]")).getText();
	  
	  System.out.println("Text of dress is " + getDressName);
  }
  
  @Test(priority=3, enabled=true)
  public void clickOnContactUs() {
	  
	  driver.findElement(By.xpath("(//a[contains(text(),'Contact us')])[1]")).click();
	  String pagename = driver.findElement(By.xpath("(//h1[contains(text(),'Customer service - Contact us')])[1]")).getText();
	  
	  System.out.println("Text of page is " + pagename);
  }

}
