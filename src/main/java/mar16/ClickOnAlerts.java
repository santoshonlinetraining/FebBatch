package mar16;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickOnAlerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\FebBatch\\drivers\\chrome\\chromedriver.exe");
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("https://javascript.info/alert-prompt-confirm");
		
		driver.findElement(By.xpath("(//a[@class='toolbar__button toolbar__button_run'])[1]")).click();
		
		Thread.sleep(10000);
		
		System.out.println("Alert text is " + driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
	}

}
