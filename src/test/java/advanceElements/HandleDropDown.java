package advanceElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		// below we are locating the drop down 
	WebElement	dropDown = driver.findElement(By.id("dropdown"));
	
	
	//how do you handle a DropDown we use select class
		
		Select sel = new Select (dropDown);
		
		
		// what are the different way to select a item by:
		
		// 1. SelectByIndex 
		sel.selectByIndex(2);
		Thread.sleep(2000); // never use thread.sleep method -- this method will slow down the different results so we can see it
		
		// 2. selectByValue
		sel.selectByValue("2"); // the 2 is a string so we have to put it in ""
		Thread.sleep(2000);

		// 3. selectByVisibleText
		sel.selectByVisibleText("Option 1");
		Thread.sleep(2000);

		
		
		
	}

}
