package mar9;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\FebBatch\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.automationpractice.com");
		
		driver.findElement(By.partialLinkText("Sign in")).click();
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("santosh@test.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();
		
		driver.findElement(By.xpath("//a[text()='Contact us']")).click();
		
		
		
		
				
	}
}
