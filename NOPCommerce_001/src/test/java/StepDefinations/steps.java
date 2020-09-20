package StepDefinations;



import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import StepDefinations.BaseClass;
import PageObjects.AddCustomerPage;
import PageObjects.SearchCustomerPage;
import PageObjects.loginPage;
import io.cucumber.java.en.*;



public class steps extends BaseClass {

	
	@Given("User launch chrome browser")
	public void user_launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\CucumberProjects\\01\\NOPCommerce_001\\Drivers\\chromedriver.exe");
//		driver=new ChromeDriver();
//		lp=new loginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.manage().window().maximize();
		driver.get(url);


	}

	@And("User enter Email as {string} and Password as {string}")
	public void user_enter_email_as_and_password_as(String email, String password) {

		lp.setusername(email);
		lp.SetPassword(password);


	}

	@And("Click on login")
	public void click_on_login() {
		lp.clicklogin();
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String title) {


	}

	@When("User click on Log out link")
	public void user_click_on_log_out_link() throws Exception {
		lp.clicklogout();
		Thread.sleep(3000);

	}

	@Then("PAge title should be {string}")
	public void p_age_title_should_be(String string) {

		System.out.println("page is valid");


	}

	@Then("close browser")
	public void close_browser() {

		driver.close();


	}
	//Customer feature step definations.........................................................

	@Then("user can view Dashboad")
	public void user_can_view_dashboad() {
		addcust = new AddCustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", addcust.getpagetitle());

	}

	@When("user click on customer Menu")
	public void user_click_on_customer_menu() throws Exception {
		Thread.sleep(3000);
		addcust.ClickCustomerMinu();

	}

	@When("click on customer Menu item")
	public void click_on_customer_menu_item() throws Exception {
		Thread.sleep(3000);
		addcust.ClickCustomerMinuItems();

	}

	@When("click on Add new button")
	public void click_on_add_new_button() throws Exception {
		addcust.clickOnAddNew();
		Thread.sleep(3000);

	}

	@Then("user can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
		Assert.assertEquals("Add a new customer / nopCommerce administration",addcust.getpagetitle());
		String email = randomestring()+"@gmail.com";
		addcust.SetEmail(email);
		addcust.SetPassword("test1234");

		//addcust.setGender("male");
		addcust.setFirstName("pavan");
		addcust.setLastNAme("kumar");
		addcust.SetcompanyName("saraswat bank");
	}

	@Then("click on save button")
	public void click_on_save_button() throws Exception {
		addcust.savebtn();

		Thread.sleep(3000);

	}
	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String msg) {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().concat("The new customer has beem added sucessfully"), true);

	}
	//steps for searching customer for email id..............................

	@When("Enter user email")
	public void enter_user_email() throws Exception {
		searchcust = new SearchCustomerPage(driver);
		searchcust.setEmail("victoria_victoria@nopCommerce.com");
		Thread.sleep(3000);



	}

	@When("Click on seach button")
	public void click_on_seach_button() throws Exception {

		searchcust.searchcostomer();
		Thread.sleep(2000);
	}

	@Then("User should found Email in the search table")
	public void user_should_found_email_in_the_search_table() {

		System.out.println("customer found");

	}
	
	//steps for customer searching element by name........................................
//	
//	@When("Enter customer firstname")
//	public void enter_customer_firstname() throws Exception {
//	searchcust.setfirstname("Victoria");
//	Thread.sleep(3000);
//	}
//
//	@When("Enter customer lastname")
//	public void enter_customer_lastname() throws Exception {
//		
//	   
//	}
//	@Then("User should found1 Email in the search table")
//	public void user_should_found1_email_in_the_search_table() {
//		System.out.println("ya...got it");
//	   
//	}

	
	
	
	
	
	

}
