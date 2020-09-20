package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	public WebDriver driver;
	
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath="//input[@type='submit']")
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy(xpath="//a[@href='/logout']")
	@CacheLookup
	WebElement btnlogout;
	
	public void setusername(String uname) {
		txtEmail.clear();
		txtEmail.sendKeys(uname);
	}
	
	public void SetPassword(String pwd) {
		txtpassword.clear();
		txtpassword.sendKeys(pwd);
	}
	
	public void clicklogin() {
		btnlogin.click();
	}
	
    public void clicklogout() {
    	btnlogout.click();
    }
    
}
