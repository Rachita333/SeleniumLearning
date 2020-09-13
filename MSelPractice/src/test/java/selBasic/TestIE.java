package selBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestIE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//System.setProperty("webdriver.chrome.driver", "D:\\SeleniumTraining\\drivers\\chromedriver.exe");
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		//driver.navigate().to("https://www.facebook.com/");

	}

}
