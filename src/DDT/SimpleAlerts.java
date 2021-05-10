package DDT;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SimpleAlerts {
	
WebDriver driver ;
	
	@Test
	public void AlertOnScreen() throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    driver = new ChromeDriver();
    
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	driver.get("https://demoqa.com/alerts");
	
	 //This step will result in an alert on screen
	    driver.findElement(By.id("alertButton")).click();
	    Thread.sleep(2000);
	    Alert simpleAlert = driver.switchTo().alert();
	    simpleAlert.accept();
	    driver.quit();
	    
	  }
	}

	
