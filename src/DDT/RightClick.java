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

public class RightClick {

		
WebDriver driver;
	
	@Test
	public void RightClickOperation() throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
    driver = new ChromeDriver();
    
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
	driver.get("https://demoqa.com/alerts");

	System.out.println("demoqa webpage displayed");
	 
    //Maximise browser window
    driver.manage().window().maximize();
 
    //Instantiate Action Class
    Actions actions = new Actions(driver);
 
    //Retrieve WebElement to perform right click
    WebElement btnElement = driver.findElement(By.id("rightClickBtn"));
 
    //Right Click the button to display Context Menu&nbsp;
    actions.contextClick(btnElement).perform();
    System.out.println("Right click Context Menu displayed");
 
  
    

}
}

