package mar13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\FebBatch\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.automationpractice.com");
		driver.findElement(By.partialLinkText("Sign in")).click();

		WebElement email;
		
		email = driver.findElement(By.xpath("//input[@id='email_create']"));
		
		email.sendKeys("santosh@test.com");
		
		
	}

}
