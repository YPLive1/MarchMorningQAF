package advanceElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCheckBoxes {

	public static void main(String[] args) {

		// main method is below to open the Chrome and go to the URL
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/checkboxes");

		// find the XPath from inspect of the WebPage, CTRL + f and type it in the
		// bottom search box
		// are using [1] , [2], its because there are two results

		WebElement chk1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		WebElement chk2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

		// is to click on the check box 
		chk1.click();

		// this will return the result if the CheckBox is selected or not
		boolean check = chk2.isSelected();
		if (check == true)
			System.out.println("chekcbox is already selected");

	}

}
