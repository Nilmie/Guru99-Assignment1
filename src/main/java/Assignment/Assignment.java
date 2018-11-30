package Assignment;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.Select;

public class Assignment 
{

	@Test
	
	public void testSearch()
	{
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/v4/");
		
		//Login
		driver.findElement(By.name("uid")).sendKeys("mngr155951");
		driver.findElement(By.name("password")).sendKeys("rUgYpEz");
		driver.findElement(By.name("btnLogin")).click();
		
		//Click on the New Customer 
		driver.findElement(By.linkText("New Customer")).click();
	
		//Enter the details for the new customer
		driver.findElement(By.name("name")).sendKeys("Nilmie");
		//WebElement male = driver.findElement(By.name("rad1"));
		//WebElement female = driver.findElement(By.name("rad1"));
		//female.click();

		driver.findElement(By.xpath("//input[@name='rad1'][2]")).click();
		driver.findElement(By.name("dob")).sendKeys("01/21/1988");
		driver.findElement(By.name("addr")).sendKeys("Pannipitiya");
		driver.findElement(By.name("city")).sendKeys("Maharagama");
		driver.findElement(By.name("state")).sendKeys("Western");
		driver.findElement(By.name("pinno")).sendKeys("123456");
		driver.findElement(By.name("telephoneno")).sendKeys("0772273515");
		driver.findElement(By.name("emailid")).sendKeys("nilmie2@gmail.com");
		driver.findElement(By.name("password")).sendKeys("1234");
		
		driver.findElement(By.name("sub")).click();

		
		
		//driver.close();
		//driver.quit();
	}
}
