package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConfirmationAlerts {

		
WebDriver driver ;
	
	@Test
	public void ConfirmationAlertOnScreen() throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    driver = new ChromeDriver();
    
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	driver.get("https://demoqa.com/alerts");

	// This step will result in an alert on screen
	  WebElement element = driver.findElement(By.id("confirmButton"));
	  ((JavascriptExecutor) driver).executeScript("arguments[0].click()", element);
	  Alert confirmationAlert = driver.switchTo().alert();
	  String alertText = confirmationAlert.getText();
	  Thread.sleep(3000);
	  System.out.println("Alert text is " + alertText);
	  confirmationAlert.dismiss();
	  driver.close();
	  
	  
	 }
	}