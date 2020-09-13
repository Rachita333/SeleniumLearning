package javaBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String browser = "ff";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			WebDriver dr = new ChromeDriver();
		}
	
		 if(browser.equalsIgnoreCase("ff"))
		{
			WebDriverManager.firefoxdriver().setup();
			WebDriver dr = new FirefoxDriver();
		}
		
		 if(browser.equalsIgnoreCase("IE"))
		{
			WebDriverManager.iedriver().setup();
			WebDriver dr = new InternetExplorerDriver();
		}
		
		

	}

}
