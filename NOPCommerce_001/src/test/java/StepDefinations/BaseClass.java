package StepDefinations;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObjects.AddCustomerPage;
import PageObjects.SearchCustomerPage;
import PageObjects.loginPage;

public class BaseClass {
	
	WebDriver driver;
	loginPage lp;
	public AddCustomerPage addcust;
	public SearchCustomerPage searchcust;
	
	
	
	//generating random string for unique email id
	public static String randomestring() {
		String generatedString1 = RandomStringUtils.randomAlphabetic(5);
		return (generatedString1);
	}
	

}
