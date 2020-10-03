package selGrid;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGrid {
	
	String nodeURL;
	WebDriver driver;
	
	
	@Parameters({"portNo","appURL"})
	@BeforeMethod
	public void setUp(String portNo, String appURL) throws MalformedURLException
	{
		if(portNo.equalsIgnoreCase("4546"))
		{
			nodeURL = "http://192.168.1.104:4546/wd/hub";
			System.out.println("Executing on Chrome");
			//desired cap
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
			//chrome options
			ChromeOptions options = new ChromeOptions();
			options.merge(cap);
			driver = new RemoteWebDriver(new URL(nodeURL), options);
			driver.manage().window().maximize();
			driver.navigate().to(appURL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
		}
		
		else
		if(portNo.equalsIgnoreCase("4545"))
		{
			nodeURL = "http://192.168.1.104:4545/wd/hub";
			System.out.println("Executing on Firefox");
			//desired cap
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(nodeURL), cap);
			driver.manage().window().maximize();
			driver.navigate().to(appURL);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		
		else
		{
			System.out.println("NO node is registered on given port");
		}
		
	}
		
		@Test
		public void loginTest() throws InterruptedException
		{
			System.out.println(driver.getTitle());
			WebElement userName = driver.findElement(By.name("userName"));
			userName.sendKeys("Mercury");
			WebElement password =driver.findElement(By.name("password"));
			password.sendKeys("Mercury");
			
			WebElement signInBtn =driver.findElement(By.name("login"));
			signInBtn.click();
			
			if(driver.getPageSource().contains("Welcome back to Mercury Tours!"))
			{
				System.out.println("Test Pass");
			}
			
			Thread.sleep(3000);
		}
		
		@AfterMethod
		public void tearDown()
		{
			driver.quit();
		}
		

	
}
