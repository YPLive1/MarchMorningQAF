package advanceElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleHovers {

	public static void main(String[] args) {

		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers");

		WebElement img2 = driver.findElement(By.xpath("(//img[@alt='User Avatar'])[2]"));

		// how we do mouse movement?? we use action class ( anything of mouse move or
		// keyboard control)

		Actions act = new Actions(driver);
		
		
	    act.moveToElement(img2).build().perform();
	   
		
	}

}
