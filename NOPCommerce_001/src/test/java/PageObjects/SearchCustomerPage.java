package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Utilities.WaitHelper;

public class SearchCustomerPage {
	
   public WebDriver driver;
   
   WaitHelper waithelper;
   
   public SearchCustomerPage(WebDriver driver) {
	   this.driver=driver;
	   PageFactory.initElements(driver, this);
	//  waithelper = new WaitHelper(driver);
	   
 }
	
	
	@FindBy(how=How.ID,using="SearchEmail")
	@CacheLookup
    WebElement EmailSearch;
	
	@FindBy(how=How.ID,using="search-customers")
	@CacheLookup
	WebElement serchbtn2;
	
	
	@FindBy(how=How.ID,using="SearchFirstName")
	@CacheLookup
	WebElement Firstname;
	
//	@FindBy(how=How.ID,using="SearchCompany")
//	@CacheLookup
//	WebElement searchacompany;
//	
	@FindBy(how=How.ID,using="SearchLastName")
	@CacheLookup
	WebElement lastname;
//	
//	@FindBy(how=How.ID,using="SearchIpAddress")
//	@CacheLookup
//	WebElement ipaddress;
	
	
		
	
	public void setEmail(String email) throws Exception {
		Thread.sleep(3000);
		EmailSearch.clear();
		EmailSearch.sendKeys(email);
	}
	public void searchcostomer() {
		serchbtn2.click();
	}
	
//	public void setfirstname(String name) {
//		Firstname.clear();
//		Firstname.sendKeys(name);
//	}
////	
////	public void setCompany(String cmpny) {
////		searchacompany.clear();
////		searchacompany.sendKeys(cmpny);
////		
////	}
////	public void setIp(String ip) {
////		ipaddress.clear();
////		ipaddress.sendKeys(ip);
////		
////	}
//	public void lname(String lname1) {
//		lastname.clear();
//		lastname.sendKeys("lname1");
//	}
//	
	//public void serach
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
