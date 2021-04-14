package mar14;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\FebBatch\\drivers\\chrome\\chromedriver.exe");
		
		String homePageTitle = "My Store";
		
		WebDriver driver;
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://www.automationpractice.com");
		
		String title = driver.getTitle();
		System.out.println("Current web page title is "+title);
		
		if(homePageTitle.equals(title)) {
			System.out.println("Title verified PASS");
		} else {
			System.out.println("Title is invalid FAIL");
		}
		
		String webPageURL = driver.getCurrentUrl();
		System.out.println("Current URL is " + webPageURL);
		
		String webPageSource = driver.getPageSource();
		System.out.println("Web Page Soure is " + webPageSource);
	}

}
