package org.stepdefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class StepDefinitions {
	WebDriver driver;

	@Given("User is on Facebook Login Page")
	public void user_is_on_facebook_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@When("User Enters Login Credntials")
	public void user_enters_login_credntials() {
		driver.findElement(By.id("email")).sendKeys("12345");
		driver.findElement(By.id("pass")).sendKeys("pass");
	}

	// Getting input from Feature File
	@When("User Enters Login Credntials {string} and {string}")
	public void user_enters_login_credntials_and(String string, String string2) {
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);
	}
	//1D-Datatble without header
	@When("User Enters Login Credntials from 1D-DataTable")
	public void user_enters_login_credntials_from_1d_data_table
	(io.cucumber.datatable.DataTable dataTable) {   
		List<String> asList = dataTable.asList();
		String userName = asList.get(0);
		String password = asList.get(1);
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(password);		
	}		
	@When("User Enters Login Credntials from 1D-DataTable with header")
	public void user_enters_login_credntials_from_1d_data_table_with_header
	(io.cucumber.datatable.DataTable dataTable) {	   
		Map<String, String> asMap = dataTable.asMap();
		String userName = asMap.get("userName1");
		String password = asMap.get("password2");
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(password);	
	}
	
	@When("User Enters Login Credntials from 2D-DataTable without header")
	public void user_enters_login_credntials_from_2d_data_table_without_header
	(io.cucumber.datatable.DataTable dataTable) {
	    //List<String> asList = dataTable.asList();
	    List<List<String>> asLists = dataTable.asLists();
	    List<String> listTwo = asLists.get(1);
	    String userName = listTwo.get(0);
	    String password = listTwo.get(1);
	    String browser = listTwo.get(2);
	    driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(password);	
	    
	}

	@When("User Enters Login Credntials from 2D-DataTable with header")
	public void user_enters_login_credntials_from_2d_data_table_with_header
	(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> asMaps = dataTable.asMaps();
		Map<String, String> mapThree = asMaps.get(2);
		String userName = mapThree.get("userName");
		String password = mapThree.get("password");
		String browser = mapThree.get("browser");
		driver.findElement(By.id("email")).sendKeys(userName);
		driver.findElement(By.id("pass")).sendKeys(password);	
	   
	}

	//Using Examples
	@When("User Enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		driver.findElement(By.id("email")).sendKeys(string);
		driver.findElement(By.id("pass")).sendKeys(string2);	
	}


	@Given("Browser is Launched")
	public void browser_is_launched() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@Then("User loads Facebook url")
	public void user_loads_facebook_url() {
		driver.get("https://www.facebook.com/");
	}

	@Given("user enters UserName and Password")
	public void user_enters_user_name_and_password() {
		driver.findElement(By.id("email")).sendKeys("sdsff");
		driver.findElement(By.id("pass")).sendKeys("1345");	
	}

	

	@Given("user clicks forgot password")
	public void user_clicks_forgot_password() {
	    driver.findElement(By.linkText("Forgotten password?")).click();
	}

	@When("User Enters valid data")
	public void user_enters_valid_data() {
	    
	}

	@Then("Check User successfully resets the Paswword")
	public void check_user_successfully_resets_the_paswword() {
	    
	}

	
	
	

	
	@When("User Clicks Login Button")
	public void user_clicks_login_button() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
	}
	@Then("Validate and take Screenshot")
	public void validate_and_take_screenshot() {

	}
	
	@Given("Scenario One Given")
	public void scenario_one_given() {
	    System.out.println("Scenario One Given");
	}
	@When("Scenario One When")
	public void scenario_one_when() {
		System.out.println("Scenario One Given");
	}

	@Given("Scenario Two Given")
	public void scenario_two_given() {
	    System.out.println("Scenario Two Given");
	}
	@When("Scenario Two When")
	public void scenario_two_when() {
		System.out.println("Scenario Two Given");
	}

	@Given("Setting Background")
	public void setting_background() {
	  System.out.println("Background");
	}

}









