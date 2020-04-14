package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class createAccount {

	public static void main(String[] args) {
		
		//Browser Setup and launching
//    	 System.setProperty("webdriver.gecko.driver","D:\\Selenium Related Files\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//		 WebDriver driver = new FirefoxDriver();		
    	System.setProperty("webdriver.chrome.driver","D:\\Selenium Related Files\\chromedriver 79\\chromedriver_win32\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		String baseUrl = "http:\\leaftaps.com/opentaps/control/main";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;	
		
		//Logging in the site
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("Demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		// Navigating to Accounts tab
		driver.findElement(By.id("button")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		
		// Clicking Create Account and Entering Details
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Karthik");
		driver.findElement(By.id("primaryPhoneNumber")).sendKeys("00990099");
		driver.findElement(By.className("smallSubmit")).click();
		
		//Extracting value
		String accountname = driver.findElement(By.xpath("//*[@class='fourColumnForm']/..//tbody/tr[1]/td[2]/span[contains(text(),Kar)]")).getText();
		System.out.println("The Accout name is: " +accountname);
		driver.quit();

	}

}
