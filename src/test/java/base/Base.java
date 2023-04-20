package base;



import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Base {
	WebDriver driver;
	/*public Properties prop;
	public  Base() throws IOException
	{
		 prop = new Properties();
		//File propfile = new File(System.getProperty("user.dir"+"\\src\\main\\java\\config\\config.prperties"));
		FileInputStream fis = new FileInputStream("C:\\Users\\sunil\\eclipse-workspace\\O_s_Project\\src\\main\\java\\config\\config.properties");
		prop.load(fis);

		
	}*/

	
	public WebDriver InitializationofBrowser(String browserName)
	{
		//String browserName = "chrome";
		if(browserName.equals("chrome"))
		{
			driver = new ChromeDriver();
			
		}
		else if( browserName.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if (browserName.equals("edge"))
		{
			driver = new EdgeDriver();
		}
		//driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.get("http://tutorialsninja.com/demo/");
		
		return driver;
	}

}
