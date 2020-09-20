package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	public WebDriver driver;
	
	public  AddCustomerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	By lnkcustomer_menu = By.xpath("//a[@href='#']//span[contains(text(),'Customers')]");
	By lnkCustomer_menulist=By.xpath("//a[@class='menu-item-link'and @href='/Admin/Customer/List']");
	
	By btnAddnew =By.xpath("//a[@class='btn bg-blue']");
	
	By txtEmail = By.id("Email");
	By txtpassword = By.id("Password");
	
	By txtFirstName = By.id("FirstName");
	By LAstNAme = By.id("LastName");
	
	By rdMaleGender=By.id("Gender_Male");
	By rdFemaleGender = By.id("Gender_feMale");
	
	By txtDoB = By.id("DateOfBirth");
	By CmpnyName = By.id("Company");
	By txtAdminComment = By.id("AdminComment");
	By btnsave = By.name("save");
	
    By TaxExempt = By.id("IsTaxExempt");
    
    By newletter = By.xpath("//input[@role='listbox'and @class='k-input k-readonly']");
    By txtActive =By.id("Active");
    
    
    //Actions methods
    
    public String getpagetitle() {
    	return driver.getTitle();
    }
    
    public void ClickCustomerMinu() {
    	driver.findElement(lnkcustomer_menu).click();
    	}
    public void ClickCustomerMinuItems() {
    	driver.findElement(lnkCustomer_menulist).click();    
    }
    public void clickOnAddNew() {
    	driver.findElement(btnAddnew).click();
    }
    public void SetEmail(String email) {
    	driver.findElement(txtEmail).sendKeys(email);
    }
	public void SetPassword(String pwd) {
		driver.findElement(txtpassword).sendKeys(pwd);
	}
	
	public void active() {
		driver.findElement(txtActive).click();
	}
	//public void setGender(String gender)
	//{
		//if(gender.equals("mail")) {
			//driver.findElement(rdMaleGender).click();
	//	}else {
		//	driver.findElement(rdFemaleGender).click();
	//	}
//	}
	
	public void setFirstName(String fname) {
		driver.findElement(txtFirstName).sendKeys(fname);
		
	}
	public void setLastNAme(String lname) {
		driver.findElement(LAstNAme).sendKeys(lname);
	}
	
	public void SetDob(String dob) {
		driver.findElement(txtDoB).sendKeys(dob);
	}
	public void SetcompanyName(String comname) {
		driver.findElement(CmpnyName).sendKeys(comname);
	}
	public void savebtn() {
		driver.findElement(btnsave).click();
	}
}















