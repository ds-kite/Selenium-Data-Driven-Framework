package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown {

		
WebDriver driver;
	
	@Test
	public void SelectValueFromDropDown() throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    driver = new ChromeDriver();
    
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://demoqa.com/select-menu");
	 driver.manage().window().maximize();
	 
	 driver.findElement(By.xpath("//*[@id='oldSelectMenu']")).click();
	 
	// Create object of the Select class
	Select se = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));
	 
	// Select the option by index
	se.selectByIndex(8);
	
	driver.findElement(By.xpath("//*[@id='oldSelectMenu']")).click();
	
	driver.quit();
	}
}