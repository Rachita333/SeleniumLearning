package selBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningWaits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Implicit wait and explicit wait
		//thread.sleep--java
		//fluent wait sel- it is not recommended to use
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///D:/SeleniumTraining/htmlpages/basic_redirect.html");
		
		//implicit wait------
		/*driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
	
	
		
		WebElement eleToclick = driver.findElement(By.id("delaygotobasic"));
		eleToclick.click();
		
		
		
		//Thread.sleep(10000);
		WebElement eleToVerify = driver.findElement(By.id("para1"));
		eleToVerify.isDisplayed();*/
		
		//explicit wait
		

		WebElement eleToclick = driver.findElement(By.id("delaygotobasic"));
		eleToclick.click();
		
		
		WebDriverWait wt = new WebDriverWait(driver, 60);
		wt.until(ExpectedConditions.presenceOfElementLocated(By.id("para1")));
		
		
		WebElement eleToVerify = driver.findElement(By.id("para1"));
		eleToVerify.isDisplayed();
		
		driver.close();
		
		
		
		

	}

}
