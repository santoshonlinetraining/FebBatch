package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPage {

	WebDriver driver = null;

	public CreateAccountPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='customer_firstname']")
	private WebElement customer_firstname;

	public void setCustomerFirstname(String Val) {
		customer_firstname.sendKeys(Val);
	}

	public WebElement getCustomerFirstname() {
		return customer_firstname;
	}

	@FindBy(xpath = "//input[@id='customer_lastname']")
	private WebElement customer_lastname;

	public void setCustomerLastname(String Val) {
		customer_lastname.sendKeys(Val);
	}

	public WebElement getCustomerLastname() {

		return customer_lastname;
	}

	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;

	public void setEmail(String Val) {
		email.sendKeys(Val);
	}

	public WebElement getEmail(String Val) {

		return email;

	}

	@FindBy(xpath = "//input[@id='passwd']")

	private WebElement Password;

	public void setPassword(String Val) {
		Password.sendKeys(Val);
	}

	public WebElement getPassword() {

		return Password;
	}

	@FindBy(xpath = "//input[@id='newsletter']")
	private WebElement newsletter;

	public WebElement getnewsletter() {
		return newsletter;
	}

	@FindBy(xpath = "//input[@id='optin']")
	private WebElement optin;

	public WebElement getoptin() {
		return optin;
	}

	@FindBy(xpath = "//input[@id='firstname']")
	private WebElement firstname;

	public void setFirstname(String Val) {
		firstname.sendKeys(Val);
	}

	public WebElement getFirstname(String Val) {

		return firstname;
	}

	@FindBy(xpath = "//input[@id='lastname']")
	private WebElement lastname;

	public void setLastname(String Val) {
		lastname.sendKeys(Val);
	}

	public WebElement getLastname() {
		return lastname;
	}

	@FindBy(xpath = "//input[@id='company']")
	private WebElement company;

	public void setCompanyname(String Val) {
		company.sendKeys(Val);
	}

	public WebElement getCompanyname() {
		return company;
	}

	@FindBy(xpath = "//input[@id='address1']")
	private WebElement address1;

	public void setAddress1(String Val) {
		address1.sendKeys(Val);
	}

	public WebElement getAddress1() {
		return address1;
	}

	@FindBy(xpath = "//input[@id='address2']")
	private WebElement address2;

	public void setAddress2(String Val) {
		address2.sendKeys(Val);
	}

	public WebElement getAddress2() {
		return address2;
	}

	@FindBy(xpath = "//input[@id='city']")

	private WebElement city;

	public void setCity(String Val) {
		city.sendKeys(Val);
	}

	public WebElement getCity() {
		return city;
	}

	@FindBy(xpath = "//input[@id='postcode']")

	private WebElement postcode;

	public void setPostcode(String Val) {
		postcode.sendKeys(Val);
	}

	public WebElement getPostcode() {
		return postcode;
	}

	@FindBy(xpath = "//textarea[@id='other']")

	private WebElement other;

	public void setOther(String Val) {
		other.sendKeys(Val);
	}

	public WebElement getOther() {
		return other;
	}

	@FindBy(xpath = "//input[@id='phone']")

	private WebElement phone;

	public void setPhone(String Val) {
		phone.sendKeys(Val);
	}

	public WebElement getPhone() {
		return phone;
	}

	@FindBy(xpath = "//input[@id='phone_mobile']")

	private WebElement phone_mobile;

	public void setPhone_mobile(String Val) {
		phone_mobile.sendKeys(Val);

	}

	public WebElement getPhone_mobile() {
		return phone_mobile;
	}

	@FindBy(xpath = "//input[@id='alias']")

	private WebElement alias;

	public void setAlias(String Val) {
		alias.sendKeys(Val);
	}

	public WebElement getAlias() {
		return alias;

	}

	@FindBy(xpath = "//button[@id='submitAccount']")

	private WebElement submitAccount;

	public WebElement getsubmitAccount() {
		return submitAccount;
	}
	
	@FindBy(xpath="//select[@id='days']")
	private WebElement date;
	public void SetDate(String val) {
		date.sendKeys(val);
	}
	
	public WebElement getDate() {
		return date;
	}
	
	@FindBy(xpath="//select[@id='months']")
	private WebElement month;
	public void SetMonth(String val) {
		month.sendKeys(val);
	}
	
	public WebElement getMonth() {
		return month;
	}
	
	@FindBy(xpath="//select[@id='years']")
	private WebElement year;
	public void SetYear(String val) {
		year.sendKeys(val);
	}
	
	public WebElement getYear() {
		return year;
	}
	
	

}
