package mar14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTheDataFromWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\FebBatch\\drivers\\chrome\\chromedriver.exe");
		
		
		
		String homePageTitle = "My Store";
		String contactUsPageText = "CUSTOMER SERVICE - CONTACT";
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().to("http://www.automationpractice.com");
		
		String phoneNumber = driver.findElement(By.xpath("//strong[text()='0123-456-789']")).getText();
		System.out.println("Phone number is " + phoneNumber);
		
		
		String getAutomationText = driver.findElement(By.xpath("//div[@id='editorial_block_center']/h1")).getText();
		System.out.println("Automation text on Home Page " + getAutomationText);
		
		driver.findElement(By.linkText("Contact us")).click();
		
		String contactUsPageTextFromWebSite = driver.findElement(By.xpath("//h1[@class='page-heading bottom-indent']")).getText();
		
		
		if(contactUsPageText.equals(contactUsPageTextFromWebSite)) {
			System.out.println("User is on the Contact Us Page : PASS");
		} else {
			System.out.println("User is NOT at Contact Us Page : FAIL");
		}
		
		
	}

}
