package selBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewtoursWebsiteRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Setup chrome driver and navigate to site and maximize window
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/selenium/newtours/");
		driver.manage().window().maximize();

		// Click on Register link
		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		registerLink.click();

		// Registration form details
		// Contact Information
		WebElement Firstname = driver.findElement(By.name("firstName"));
		Firstname.sendKeys("Rachita");

		WebElement Lastname = driver.findElement(By.name("lastName"));
		Lastname.sendKeys("Tundurwar");

		WebElement PhoneNo = driver.findElement(By.name("phone"));
		PhoneNo.sendKeys("1234567891");

		WebElement EmailAddr = driver.findElement(By.id("userName"));
		EmailAddr.sendKeys("rachitatundurwar@gmail.com");

		// Mailing information
		WebElement Addr = driver.findElement(By.name("address1"));
		Addr.sendKeys("Balaji Ward");

		WebElement CityName = driver.findElement(By.name("city"));
		CityName.sendKeys("Nagpur");

		WebElement State = driver.findElement(By.name("state"));
		State.sendKeys("Maharashtra");

		WebElement Pincode = driver.findElement(By.name("postalCode"));
		Pincode.sendKeys("442704");

		WebElement CountryDropdown = driver.findElement(By.name("country"));
		Select sel = new Select(CountryDropdown);
		sel.selectByVisibleText("ANTARCTICA");

		// User Information
		WebElement UserName = driver.findElement(By.id("email"));
		UserName.sendKeys("Rachi");

		WebElement Passwrd = driver.findElement(By.name("password"));
		Passwrd.sendKeys("N@gpur123");

		WebElement ConfrmPaswrd = driver.findElement(By.name("confirmPassword"));
		ConfrmPaswrd.sendKeys("N@gpur123");

		WebElement SubmitButtn = driver.findElement(By.name("submit"));
		SubmitButtn.click();

	}

}
