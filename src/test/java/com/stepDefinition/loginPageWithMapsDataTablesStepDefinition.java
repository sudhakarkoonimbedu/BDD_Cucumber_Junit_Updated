package com.stepDefinition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class loginPageWithMapsDataTablesStepDefinition {
	
	WebDriver driver;
	public WebDriverWait wb;
	
	//private final static Log logger = LogFactory.getLog(loginPageStepDefinition.class);
	
	@Given("^User is on Login page$")
	public void user_is_on_Login_page() {
       System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
       
       ChromeOptions option = new ChromeOptions();
       
       option.addArguments("--start-maximized");
       
       driver = new ChromeDriver(option);
       
       wb = new WebDriverWait(driver,60);
       
       driver.get("https://dev-web/sso-web/login.jsf?");
       
		if(driver.findElements(By.xpath("//*[@id='details-button']")).size()>0)
		{
			driver.findElement(By.xpath("//*[@id='details-button']")).click();
			if(driver.findElements(By.xpath("//*[@id='proceed-link']")).size()>0)
			{
				driver.findElement(By.xpath("//*[@id='proceed-link']")).click();
			}
		}
	}

	@When("^User enters username and password$")
	public void enters_and(DataTable credentials) {
		
		for(Map<String,String> data:credentials.asMaps(String.class,String.class))
		{
			driver.findElement(By.id("loginForm:principal")).sendKeys(data.get("username"));
			driver.findElement(By.id("loginForm:credentials")).sendKeys(data.get("password"));
		}		
	}

	@When("^Click on Login button$")
	public void click_on_Login_button() {
		driver.findElement(By.xpath("//*[@id='loginForm:loginButton']/span")).click();
	}

	@Then("^Region selection page displays$")
	public void region_selection_page_displays() {       
	   wb.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Please Select The Environment']")));
	   String title = driver.getTitle();
       if(title.equalsIgnoreCase("RxNova Login"))
       {
    	   System.out.println("Region page displays");
       }
       else
       {
    	   System.out.println("Region page is not displaying..");
       }
	}

	@When("^click on region$")
	public void click_on_region(DataTable region){
	 
		for(Map<String,String> data:region.asMaps(String.class,String.class))
		{
	  
		  if(driver.findElements(By.linkText(data.get("region"))).size()>0)
		  {
			  driver.findElement(By.linkText(data.get("region"))).click();
		  }
		}
	}

	@Then("^Rxnova Landing page displays$")
	public void rxnova_Landing_page_displays() throws Throwable {
		  if(driver.findElements(By.linkText("Logout")).size()>0)
		  {
			  System.out.println("Rxnova Landing page displays");
		  }
		  else
		  {
			  System.out.println("Rxnova Landing page in not displaying");
		  }
	}


}
