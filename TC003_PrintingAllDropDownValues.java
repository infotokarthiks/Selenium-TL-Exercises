package Day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC003_PrintingAllDropDownValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		// Selecting Dropdown values from Industry
		WebElement d1 = driver.findElement(By.name("industryEnumId"));
		Select industry = new Select(d1);
		List<WebElement> dropdown_list = industry.getOptions();
		for(int i=0; i< dropdown_list.size(); i++)
		{
			String dropdown_value = dropdown_list.get(i).getText();
			System.out.println("The Values in Industry Dropdown are: "+ dropdown_value);
		}

		// Selecting Dropdown values from Ownership
		Select d2 = new Select(driver.findElement(By.name("ownershipEnumId")));
		List<WebElement> odrop = d2.getOptions();
		for(int j=0; j < odrop.size(); j++)
		{
			String odv = odrop.get(j).getText();
			System.out.println("The Values in Ownership are: "+ odv);
		}
		
		// Selecting Dropdown values from Source
		Select sourcedrop = new Select(driver.findElement(By.name("dataSourceId")));
		List<WebElement> source_list = sourcedrop.getOptions();
		for(int j=0; j < source_list.size(); j++)
		{
			String source_Values = source_list.get(j).getText();
			System.out.println("The Values in Source are: "+ source_Values);
		}
		
		// Selecting Dropdown values from initialTeam
		Select intial = new Select(driver.findElement(By.name("initialTeamPartyId")));
		List<WebElement> initial_list = intial.getOptions();
		for(int j=0; j < initial_list.size(); j++)
		{
			String initial_Values = source_list.get(j).getText();
			System.out.println("The Values in InitialTeam are: "+ initial_Values);
		}
		
		}
	}
