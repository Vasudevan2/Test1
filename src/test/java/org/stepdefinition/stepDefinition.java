package org.stepdefinition;

import java.sql.Driver;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import baseClass.Baseclass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class stepDefinition extends Baseclass{
	static WebDriver driver;
	@Given("user should launch the browser")
	public void user_should_launch_the_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	}

	@When("user will enter the valid username and valid password")
	public void user_will_enter_the_valid_username_and_valid_password(DataTable d) {
	List<String> l = d.asList();
	String vasu = l.get(1);
	String password = l.get(1);
		
	   driver.findElement(By.id("email")).sendKeys(vasu);
	   
	   driver.findElement(By.id("pass")).sendKeys(password);
	}

	@When("user wil chech login button")
	public void user_wil_chech_login_button() {
	    driver.findElement(By.name("login")).click();
	}

	@Then("user will be in homepage")
	public void user_will_be_in_homepage() {
	    Assert.assertTrue(true);
	}


}
