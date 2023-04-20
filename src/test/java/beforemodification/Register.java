package beforemodification;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Register 
{
	WebDriver driver;
	@ BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
	}
	@ AfterTest
	public void closeup()
	{
		driver.quit();
	}
	@ Test
	public void VerifyRegisteringanAccountbyprovidingonlytheMandatoryfields()
	{
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Sunil");
		driver.findElement(By.id("input-lastname")).sendKeys("Gound");
		driver.findElement(By.id("input-email")).sendKeys("sunilrg91@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("8698668376");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.id("input-confirm")).sendKeys("12345");
		driver.findElement(By.xpath("//a[@class='agree']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	    String actualheadingDisply = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
	    Assert.assertEquals( actualheadingDisply, "Register Account","Your account has not created");
	    

	}

}
