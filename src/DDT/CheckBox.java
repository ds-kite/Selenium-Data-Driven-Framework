package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CheckBox {

		
WebDriver driver;
	
	@Test
	public void SelectCheckBox() throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    driver = new ChromeDriver();
    
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.demoqa.com/automation-practice-form");
	 driver.manage().window().maximize();
	 
	 
	 /**
	 * Validate isSelected and click
	 */
	 
	 // PAGE SCROLLING--------------------------------------------------------------------------------------
		
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		 
		 jsx.executeScript("window.scrollBy(0,1200)", ""); //scroll down
		 
		 Thread.sleep(2000);
		 
		 jsx.executeScript("window.scrollBy(0,-1000)", ""); //scroll up
		
		 Thread.sleep(2000);
		
	 
	 WebElement checkBoxSelected = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
	 boolean isSelected = checkBoxSelected.isSelected();
	 
	 // performing click operation if element is not selected 
	 if(isSelected == false)
	 {
	 checkBoxSelected.click();
	 Thread.sleep(2000);
	 
	 
	 WebElement checkBoxDisplayed = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
	 boolean isDisplayed = checkBoxDisplayed.isDisplayed();
	 driver.quit();
	
	 }
	 
	 }
	 
	}