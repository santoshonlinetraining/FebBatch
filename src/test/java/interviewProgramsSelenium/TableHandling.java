package interviewProgramsSelenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TableHandling {

	@Test
	void readTableContent() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\\\Santosh\\\\Class\\\\TestingClass\\\\drivers\\\\chromedriver\\\\chromedriver_win32\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//List<WebElement> getEle = driver.findElements(By.xpath("//div[@class='w3-white w3-padding notranslate w3-padding-16']//tr/td[2]"));
		List<WebElement> getEle = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		
		System.out.println(getEle.get(0).getText());
		System.out.println(getEle.get(1).getText());
		
		int size = getEle.size();
		
		for(int i=0; i<size; i++) {
			String name = getEle.get(i).getText();
			System.out.println("Contact name is => " + name);
		}
		
		
		
	}
	
}


