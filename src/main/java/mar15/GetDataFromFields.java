package mar15;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetDataFromFields {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\FebBatch\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://www.automationpractice.com");

		driver.findElement(By.partialLinkText("Sign in")).click();

		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("santosh@test.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		
		Thread.sleep(2000);
		
		String emailAddress = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
		System.out.println("Email address is " + emailAddress);
		
		System.out.println(driver.findElement(By.xpath("//input[@id='email']")).getAttribute("type"));
		
		driver.findElement(By.xpath("//input[@id='alias']")).clear();
		
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("Miyapur");
	}

}
