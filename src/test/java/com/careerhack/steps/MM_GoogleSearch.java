package com.careerhack.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.careerhack.common.MMGoogleBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MM_GoogleSearch extends MMGoogleBase {

	

	// past here the result of marhcmorning_googlesearch.feature -- cucumber
	
	@Given("I am on google homepage")
	public void i_am_on_google_homepage() {

		launchBrowser ();

	}
	    

	@When("I enter the search {string}")
	public void i_enter_the_search(String string) {
		
	// step 1 identify the web elements
	// 8 locators to identify an element =  (Id, name, Class name, HTML tag, LinkText, partial linkTest, CSS selector, xpath)
		
	WebElement searchBox = driver.findElement(By.name("q"));
		
		
	// step 2 perform an operation 
		searchBox.sendKeys(string);
		
	}
	    

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
	    WebElement searchButton = driver.findElement(By.name("btnK"));
	    searchButton.click();
		
	}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
		
		WebElement result = driver.findElement(By.id("result-stats"));
		
		String nResult = result.getText();
		System.out.println("*****************************************");
		System.out.println(nResult);
		System.out.println("*****************************************");
		closeBrowser();
		
		
		
		
	}
	
	    

	}
	 
	
	
	

