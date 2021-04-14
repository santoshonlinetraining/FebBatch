package mar17;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Demo6 {
	WebDriver driver;
	
  @Test
  public void test() {
	  	Actions act = new Actions(driver);
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Women']"));
		
		act.moveToElement(link).build().perform();
		
		driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[1]")).click();
  }

  @BeforeClass
  public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\FebBatch\\drivers\\chrome\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://www.automationpractice.com");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }
  
  @Test
  public void test2() {
	  
	  driver.findElement(By.xpath("(//a[contains(text(),'Faded Short Sleeve T-shirts')])[1]")).click();
	  String getDressName = driver.findElement(By.xpath("(//h1[contains(text(),'Faded Short Sleeve T-shirts')])[1]")).getText();
	  
	  System.out.println("Text of dress is " + getDressName);
  }

}
