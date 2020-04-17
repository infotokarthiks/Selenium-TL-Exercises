package Day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpathExercise2 {

	public static void main(String[] args) {
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
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'10001')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
		
		WebElement cn = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		cn.clear();
		cn.sendKeys("FB");		
		WebElement fn = driver.findElement(By.xpath("//input[@id='updateLeadForm_firstName']"));
		fn.clear();
		fn.sendKeys("Mark");		
		WebElement ln = driver.findElement(By.xpath("//input[@id='updateLeadForm_lastName']"));
		ln.clear();
		ln.sendKeys("Zuk");		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
