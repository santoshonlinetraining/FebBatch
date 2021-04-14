package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import excel.ExcelReader;
import mar15.EdgeBrowser;
import pages.ContactUsPage;
import pages.CreateAccountPage;
import pages.HomePage;
import pages.SignInPage;
import pages.WelcomeHomePage;
import project_listeners.WebEvents;

public class TestBase {

	WebDriver driver;
	
	protected HomePage homepageObj;
	protected SignInPage signInPageObj;
	protected CreateAccountPage createAccountPageObj;
	protected ContactUsPage contactUsPageObj;
	protected WelcomeHomePage welcomeHomePageObj;
	
	public Properties prop;
	public FileInputStream fis;
	
	public ExcelReader datatable = null;
	
	public static ExtentReports extent; //to create the report
	public static ExtentTest logger; // to log the messages

	
	@BeforeMethod(groups= {"Regression", "SmokeTest", "Login", "CreateAccount", "Homepage"})
	public void beforeMethod() throws IOException {
		
		datatable = new ExcelReader(System.getProperty("user.dir")+"\\src\\main\\resources\\inputdata.xlsx");
		
		prop = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\config.properties");
		prop.load(fis);
		
		if(prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Santosh\\Class\\TestingClass\\FebBatch\\drivers\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if(prop.getProperty("browser").equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Santosh\\Class\\TestingClass\\FebBatch\\drivers\\edgedriver_win64_89\\msedgedriver.exe");
			driver = new EdgeDriver();
		} 
		else if(prop.getProperty("browser").equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Santosh\\Class\\TestingClass\\FebBatch\\drivers\\geckodriver-v0.29.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}		
		else {
			System.out.println("provided browser not exist");
			System.exit(0);
		}
		
		WebEvents ecapture = new WebEvents();
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
		eventDriver.register(ecapture);
		
		eventDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		eventDriver.navigate().to("http://www.automationpractice.com");
		
		
		homepageObj = new HomePage(eventDriver);
		signInPageObj = new SignInPage(eventDriver);
		createAccountPageObj = new CreateAccountPage(eventDriver);
		contactUsPageObj = new ContactUsPage(eventDriver);
		welcomeHomePageObj = new WelcomeHomePage(eventDriver);
		
		
		
	}
	
	@AfterMethod(groups= {"Regression", "SmokeTest", "Login", "CreateAccount", "Homepage"})
	public void closeBrowser() {
		//driver.quit();
		extent.endTest(logger);
		extent.flush();
	}
	
	
	@BeforeTest(groups= {"Regression", "SmokeTest", "Login", "CreateAccount", "Homepage"})
	public void testbefore() {
		extent = new ExtentReports(System.getProperty("user.dir")+"\\report.html", true);
		extent.loadConfig(new File(System.getProperty("user.dir")+"\\target\\Config\\extent-config.xml"));
	}
	
	@AfterTest(groups= {"Regression", "SmokeTest", "Login", "CreateAccount", "Homepage"})
	public void testafter() {
		extent.close();
	}

}
