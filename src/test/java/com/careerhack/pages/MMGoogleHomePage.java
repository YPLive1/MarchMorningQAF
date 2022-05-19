package com.careerhack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MMGoogleHomePage {
	
	WebDriver driver;
	
	public MMGoogleHomePage (WebDriver driver)
	{
			
		// we are saying driver from outside and inside are the same.
		this.driver=driver; 
		
		// this is how we create page object model class and this whole code will have be to pasted.
		PageFactory.initElements(driver, this);
		
	}
	

	// POM =  Page Object Model 
	// is a guideline that separates the step definition and the web elements
	// so that we can reuse the elements and actions on the elements
	// two way to implement page object model 
	// 1 = page factory  2 = with out page factory ( we are using pure java) ( we will not learn #2)
	
	
	
	// WebElement searchBox = driver.findElement(By.name("q")); 
	// the below line will replace the above line ^^
	@FindBy(name="q")
	WebElement searchBox;
	
	
	// searchBox.sendKeys(string);
	// entering a value / action 
	public void enterSearch(String string)
	{
		searchBox.sendKeys(string);
	// the above line can be reuseable
	}
	

	   //  WebElement searchButton = driver.findElement(By.name("btnK"));
	  @FindBy(name="btnK")
	  WebElement searchButton;
	  
	  // searchButton.submit();
	  public void clickSearch()
	  {
		  searchButton.click();
	  }
	
	
	
	
	
}
