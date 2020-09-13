package selBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelingAlerts {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///D:/SeleniumTraining/htmlpages/alerts.html");
		driver.manage().window().maximize();
		// click on terms link
		//for handeling alerts we have to switch on that alert and then we have to perform our actions

		/*
		WebElement firstAlert = driver.findElement(By.id("alertexamples"));
		firstAlert.click();
		
		String popUptext= driver.switchTo().alert().getText();
		
		System.out.println(popUptext);
	
			Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		*/
		
		/*
		WebElement secondAlert = driver.findElement(By.id("confirmexample"));
		secondAlert.click();
		Thread.sleep(3000);
		String popUptext= driver.switchTo().alert().getText();
		
		System.out.println(popUptext);
	
			Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		*/
		
		WebElement thirdAlert = driver.findElement(By.id("promptexample"));
		thirdAlert.click();
		Thread.sleep(3000);
		String popUptext= driver.switchTo().alert().getText();
		
		System.out.println(popUptext);
		
		driver.switchTo().alert().sendKeys("Training");
		
	
			Thread.sleep(2000);
		
		//driver.switchTo().alert().dismiss();
			driver.switchTo().alert().accept();

	}

}
