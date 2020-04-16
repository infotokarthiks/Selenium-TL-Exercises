package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathLeadsPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\Selenium Related Files\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();		
		String baseUrl = "http:\\leaftaps.com/opentaps/control/main";
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;	
		
		//Logging in the site
		WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("Demosalesmanager");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Leads')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("USA");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Donald");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Trump");
		
		driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']")).sendKeys("Conference");
		driver.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']")).sendKeys("Media");
		driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']")).sendKeys("LLC/LLP");
		driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']")).sendKeys("Catalog Generating Marketing Campaigns");
		driver.findElement(By.xpath("//select[@id='createLeadForm_currencyUomId']")).sendKeys("ARS - Argentina Peso");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		
		
		
		
		

	}

}
