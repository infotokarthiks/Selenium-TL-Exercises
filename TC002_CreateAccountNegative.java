package Day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC002_CreateAccountNegative {

	public static void main(String[] args) {
		
		//Browser Setup and launching
		System.setProperty("webdriver.gecko.driver","D:\\Selenium Related Files\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();		
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
		
		// Navigating to Accounts tab and click Create Account
		driver.findElement(By.id("button")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		
		//Select
		WebElement industryDrop = driver.findElement(By.name("industryEnumId"));
		industryDrop.sendKeys("Aerospace");
		
		Select ownership = new Select(driver.findElement(By.name("ownershipEnumId")));
		ownership.selectByIndex(1);
		
		Select source = new Select(driver.findElement(By.name("dataSourceId")));
		source.selectByVisibleText("Cold Call");
		
//		List<WebElement> source = driver.findElements(By.name("dataSourceId"));
//		System.out.println("Number of items in this dropdown: "+ source.size());
		
		Select initialteam = new Select(driver.findElement(By.name("initialTeamPartyId")));
		initialteam.selectByValue("DemoSalesTeam1");
		
		// Clicking Submit button
		driver.findElement(By.className("smallSubmit")).click();
		
		//Extracting value
		String errormsg = driver.findElement(By.xpath("//ul[@class='errorList']/li")).getText();
		System.out.println("The Accout name is: " +errormsg);
//		driver.quit();
	}

}
