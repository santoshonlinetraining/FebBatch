package mar13;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args)  throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\FebBatch\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.automationpractice.com");
		
		driver.findElement(By.partialLinkText("Sign in")).click();

		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("santosh@test.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		
		/*driver.findElement(By.xpath("(//input[@name='id_gender'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Santosh");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("123456");
		
		driver.findElement(By.xpath("//select[@id='days']")).sendKeys("1  ");
		
		Select month = new Select(driver.findElement(By.xpath("//select[@id='months']")));
		month.selectByVisibleText("February ");
			Thread.sleep(5000);
		month.selectByValue("4");
			Thread.sleep(5000);
		month.selectByIndex(5);
			Thread.sleep(5000);
			
		Select year = new Select(driver.findElement(By.xpath("//select[@id='years']")));
		
		year.selectByIndex(5);
		
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		Thread.sleep(5000);*/
		
		
		boolean checkBoxRes = driver.findElement(By.xpath("//input[@id='newsletter']")).isSelected();
		System.out.println(checkBoxRes);
		
		if(checkBoxRes == false) {
			driver.findElement(By.xpath("//input[@id='newsletter']")).click();
		}
				
		checkBoxRes = driver.findElement(By.xpath("//input[@id='newsletter']")).isSelected();
		System.out.println(checkBoxRes);
		
		driver.close();
		
	}
}
