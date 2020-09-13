package javaBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver dr;
		String browser = "Chrome5";

		switch (browser) {
		case "Chrome":
			System.out.println("Starting chrome");
			WebDriverManager.chromedriver().setup();
			 dr = new ChromeDriver();
			break;

		case "Firefox":
			System.out.println("Starting FF");
			WebDriverManager.firefoxdriver().setup();
			 dr = new FirefoxDriver();
			break;

		case "IE":
			System.out.println("Starting IE");
			WebDriverManager.iedriver().setup();
			 dr = new InternetExplorerDriver();
			break;


		default:
			System.out.println("Provide proper browser");

		}

	}

	}


