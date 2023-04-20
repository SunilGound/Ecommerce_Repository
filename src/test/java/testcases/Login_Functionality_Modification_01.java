package testcases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Base;
public class Login_Functionality_Modification_01 extends Base
{

	/*public Login_Functionality_Modification_01() throws IOException 
	{
		super();
	}*/
	WebDriver driver;


	@BeforeMethod
	public void setup() 
	{

		driver=InitializationofBrowser("edge");
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();	
	}

	@AfterMethod
	public void closeUp()
	{
		driver.quit();
	}

	@Test(priority=1,dataProvider="validCredentials")
	void Verify_logging_into_the_Application_using_valid_credentials(String email,String password)
	{

		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		System.out.println(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		//driver.quit();
	}
	@DataProvider(name="validCredentials")
	public Object[] [] supplyTestdata() 
	{
		Object[][] data  =new Object[][] {{"amotooricap9@gmail.com","12345"},
			                              {"amotooricap3@gmail.com","12345"},
			                               {"sunilrg91@gmail.com","12345"}};
		return data;
	}
	@Test(priority=2)
	void Verify_logging_into_the_Application_using_invalid_credentials()
	{

		driver.findElement(By.id("input-email")).sendKeys("sunilrg91@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("8698668376");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed();
		//String expectedWarningMessage = " Warning: No match for E-Mail Address and/or Password.";
		//Assert.assertTrue(actualwarningmessage.contains(expectedWarningMessage),"Expecterd warning message not displayed");
		//driver.quit();
	}

	@Test(priority=3)
	public void Verify_logging_into_the_Application_using_invalidd_email_address_and_valid_Password()
	{

		driver.findElement(By.id("input-email")).sendKeys("sunilrg91@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]/text()")).isDisplayed();
		//String expectedWarningMessage = " Warning: No match for E-Mail Address and/or Password.";
		//Assert.assertTrue(actualwarningmessage.contains(expectedWarningMessage),"Expecterd warning message not displayed");
		//driver.quit();

	}
	@Test(priority=4)
	public void Verify_logging_into_the_Application_using_validd_email_address_and_Invalid_Password()
	{


		driver.findElement(By.id("input-email")).sendKeys("amotooricap9@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']")).isDisplayed();
		//String expectedWarningMessage = " Warning: No match for E-Mail Address and/or Password.";
		//Assert.assertTrue(actualwarningmessage.contains(expectedWarningMessage),"Expecterd warning message not displayed");
		//driver.quit();

	}
	@Test(priority=5)
	public void Verify_logging_into_the_Application_Without_anyC_redentials()
	{


		driver.findElement(By.id("input-email")).sendKeys("");
		driver.findElement(By.id("input-password")).sendKeys("");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//driver.findElement(By.xpath("//*[@id=\"account-login\"]/div[1]/text()")).isDisplayed();
		//String expectedWarningMessage = " Warning: No match for E-Mail Address and/or Password.";
		//Assert.assertTrue(actualwarningmessage.contains(expectedWarningMessage),"Expecterd warning message not displayed");
		//driver.quit();
	}


}



