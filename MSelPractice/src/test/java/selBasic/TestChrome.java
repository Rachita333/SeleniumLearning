package selBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver",
		// "D:\\SeleniumTraining\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//WebElement emailTextBox = driver.findElement(By.id("email"));
		//emailTextBox.sendKeys("Test");
		

		WebElement emailTextBox = driver.findElement(By.cssSelector("input#email"));
		emailTextBox.sendKeys("Test");
		

		WebElement pwdTextBox = driver.findElement(By.name("pass"));
		pwdTextBox.sendKeys("Test123");
		
		//WebElement logInBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		//logInBtn.click();
		
		WebElement signUpBtn = driver.findElement(By.xpath("//button[text()='Sign Up']"));
		signUpBtn.click();
		
		
		
		

		// finding ele by linktext
		// linkterms = driver.findElement(By.linkText("Terms"));
		//linkterms.click();

		// find ele by partial link text.
		//WebElement link = driver.findElement(By.partialLinkText(("Forgotten Account?")));
		//link.click();

		// shhshs
		// sggs

		// WebElement lnk = driver.findElement(By.linkText("Forgotten
		// account"));
		// lnk.click();

		// WebElement lnk = driver.findElement(By.partialLinkText("Terms"));
		// lnk.click();

	}

}
