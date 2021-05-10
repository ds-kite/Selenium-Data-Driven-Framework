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

public class RadioButton {

		
WebDriver driver;
	
	@Test
	public void SelectRadioButton() throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    driver = new ChromeDriver();
    
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.demoqa.com/radio-button");
	 
	String appUrl = "https://www.DemoQA.com";
	 driver.get(appUrl);
	 
	 // Click on Registration link
	 driver.findElement(By.xpath(".//*[@id='app']")).click();
	 
	 
	 
	 driver.get("https://www.toolsqa.com/selenium-trainings");
	 
	 
	driver.get("https://www.demoqa.com");
		 
	 // Go back to Home Page
	 driver.navigate().back();  
	 
	 // Go forward to Registration page
	 driver.navigate().forward();
	 
	 // Go back to Home page
	 driver.navigate().to(appUrl);
	 
	 // Refresh browser
	 driver.navigate().refresh();
	
	 Thread.sleep(2000);
	 
	}
	
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 