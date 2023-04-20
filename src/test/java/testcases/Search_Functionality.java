package testcases;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;

public class Search_Functionality extends Base{

	/*public Search_Functionality() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}*/
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=InitializationofBrowser("chrome");
			
	}

	@AfterMethod
	public void closeUp()
	{
		driver.quit();
	}
	@Test(priority=1)
	public void Verify_searching_with_an_existing_Product_Name()
	{
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("HP");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("HP LP3065")).isDisplayed();
		
	}
	@Test(priority=2)
	public void Verify_searching_with_a_non_existing_Product_Name()
	{
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("sugar");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]")).isDisplayed();
	}
	@Test(priority=3)
	public void Verify_without_searching_any_Product_Name()
	{
		driver.findElement(By.xpath("//input[@name='search']"));
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]")).isDisplayed();
	}

}
