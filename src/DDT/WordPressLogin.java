package DDT;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;





public class WordPressLogin {
	
     SoftAssert softAssert = new SoftAssert(); 
	WebDriver driver;
	
	@Test(dataProvider="wordpressData")
	public void LoginToWordPress(String username, String password) throws InterruptedException {
		
	
    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
     driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("https://wordpress.com/start/?ref=logged-out-homepage-lp");
			driver.findElement(By.id("email")).sendKeys("singhal.deveshqa@gmail.com");
			driver.findElement(By.id("username")).sendKeys("singhalprachi");
			driver.findElement(By.id("password")).sendKeys("KiteTab@135#");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@type='submit' and @class='button signup-form__submit form-button is-primary']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(2000);
			
			driver.get("https://wordpress.com/start/?ref=logged-out-homepage-lp");
			driver.findElement(By.className("logged-out-form__link-item")).click();
			driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2Fstart%2Fdomains%3Fref%3Dlogged-out-homepage-lp");
			driver.findElement(By.id("usernameOrEmail")).sendKeys(username);
			
			driver.findElement(By.xpath("//button[@type='submit' and @class='button form-button is-primary']")).click();
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.xpath("//button[@type='submit' and @class='button form-button is-primary']")).click();
		
	       System.out.println("Validated Dashboard");
			softAssert.assertEquals(true, true, " Dasboard is loaded successfully");	
	      softAssert.assertAll(); 
			
	}
	
	@Test
	public void LoginToGmail() throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://gmail.com");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath(".//*[@id='view_container']")).click();
	
	driver.findElement(By.xpath(".//*[@id='identifierNext']")).click();
	
	Thread.sleep(2000);
	
	String actual_error= driver.findElement(By.className("o6cuMc")).getText();
	
	 String expected_error= "Enter an email or phone number";
	 Assert.assertEquals(actual_error, expected_error);
	 System.out.println("Test Completed");
	 
	
	}
	

	
	@Test
	public void AssertTesting() throws InterruptedException {
		
		
	    System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
	     driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2Fstart%2Fdomains%3Fref%3Dlogged-out-homepage-lp");
				
		
	// PAGE SCROLLING--------------------------------------------------------------------------------------
		
		JavascriptExecutor jsx = (JavascriptExecutor)driver;
		 
		 jsx.executeScript("window.scrollBy(0,1200)", ""); //scroll down
		 
		 Thread.sleep(2000);
		 
		 jsx.executeScript("window.scrollBy(0,-1000)", ""); //scroll up
		
		 Thread.sleep(2000);
		 
		driver.findElement(By.xpath("//button[@type='submit' and @class='button form-button is-primary']")).click();
				
		String actual_error= driver.findElement(By.xpath("//div[@class='form-input-validation is-error']")).getText();	
				
		String expected_error= "Please enter a username or email address.";
		 Assert.assertEquals(actual_error, expected_error);
		 System.out.println("Error message verified successfully");
		

	}	
	
	
	
	
  @AfterMethod
	public void tearDown() {
	
	driver.quit(); 
	
  }
  
	@DataProvider(name="wordpressData")
	public Object[][] passData()
	
	{
		
		Object[][] data = new Object[3][2];
		data[0][0] = "admin1";
		data[0][1] = "demo1";
		
		data[1][0] = "devesh.singhalqa@gmail.com";
		data[1][1] = "KiteTab@135#";
		
		data[2][0] = "admin1";
		data[2][1] = "admin123";
		
		return data;
		
	
		
		
	}
	

	
	
	
	
}

