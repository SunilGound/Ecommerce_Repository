package beforemodification;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_Functionality 
{
	@Test(priority=1)
	void Verify_logging_into_the_Application_using_valid_credentials()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys("amotooricap9@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		driver.quit();
	}
	@Test(priority=2)
	void Verify_logging_into_the_Application_using_invalid_credentials()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys("sunilrg91@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("8698668376");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed();
		//String expectedWarningMessage = " Warning: No match for E-Mail Address and/or Password.";
		//Assert.assertTrue(actualwarningmessage.contains(expectedWarningMessage),"Expecterd warning message not displayed");
		driver.quit();
	}
	
    @Test(priority=3)
	public void Verify_logging_into_the_Application_using_invalidd_email_address_and_valid_Password()
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys("sunilrg91@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed();
		//String expectedWarningMessage = " Warning: No match for E-Mail Address and/or Password.";
		//Assert.assertTrue(actualwarningmessage.contains(expectedWarningMessage),"Expecterd warning message not displayed");
		driver.quit();

	}
    @Test(priority=4)
   	public void Verify_logging_into_the_Application_using_validd_email_address_and_Invalid_Password()
   	{

   		WebDriver driver = new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
   		driver.get("http://tutorialsninja.com/demo/");
   		driver.findElement(By.xpath("//span[text()='My Account']")).click();
   		driver.findElement(By.xpath("//a[text()='Login']")).click();
   		driver.findElement(By.id("input-email")).sendKeys("amotooricap9@gmail.com");
   		driver.findElement(By.id("input-password")).sendKeys("12345678");
   		driver.findElement(By.xpath("//input[@value='Login']")).click();
   		driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed();
   		//String expectedWarningMessage = " Warning: No match for E-Mail Address and/or Password.";
   		//Assert.assertTrue(actualwarningmessage.contains(expectedWarningMessage),"Expecterd warning message not displayed");
   		driver.quit();

   	}
    @Test(priority=5)
   	public void Verify_logging_into_the_Application_Without_anyC_redentials()
   	{

   		WebDriver driver = new ChromeDriver();
   		driver.manage().window().maximize();
   		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
   		driver.get("http://tutorialsninja.com/demo/");
   		driver.findElement(By.xpath("//span[text()='My Account']")).click();
   		driver.findElement(By.xpath("//a[text()='Login']")).click();
   		driver.findElement(By.id("input-email")).sendKeys("");
   		driver.findElement(By.id("input-password")).sendKeys("");
   		driver.findElement(By.xpath("//input[@value='Login']")).click();
   		driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed();
   		//String expectedWarningMessage = " Warning: No match for E-Mail Address and/or Password.";
   		//Assert.assertTrue(actualwarningmessage.contains(expectedWarningMessage),"Expecterd warning message not displayed");
   		driver.quit();
   	}

    
}
