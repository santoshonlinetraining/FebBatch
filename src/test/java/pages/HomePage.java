package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver = null;
	
	public HomePage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='search_query_top']") 
	private WebElement search;
	
	public void setSearch(String val) {
		search.sendKeys(val);
	}
	
	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(xpath="(//a[contains(text(),'Contact us')])[1]")
	private WebElement contactUs;
	
	public WebElement getContactUs() {
		return contactUs;
	}
	
	@FindBy(xpath="(//a[contains(text(),'Sign in')])[1]")
	private WebElement signIn;
	
	public WebElement getSignIn() {
		return signIn;
	}
	
	@FindBy(xpath="//button[@name='submit_search']")
	private WebElement searchButton;
	
	public WebElement getSearchButton() {
		return searchButton;
	}
}
