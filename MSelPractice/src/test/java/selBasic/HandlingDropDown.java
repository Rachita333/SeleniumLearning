package selBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// If you dont want to use driver exe in System.setProperty then use
		// WebDriverManager
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// To launch Application URL
		driver.navigate().to("https://www.facebook.com/");
		// To maximize window in browser
		driver.manage().window().maximize();
		// Clicking on create Account Button that is Signup button
		WebElement createAccBtn = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createAccBtn.click();
		Thread.sleep(3000);
		// SignUp for First Name
		WebElement createName = driver.findElement(By.id("u_1_b"));
		createName.sendKeys("Rachi"); // sendkeys function is used for entering and sending the data which u want in that field

		// SignUp for Surname
		WebElement CreateSurname = driver.findElement(By.name("lastname"));
		CreateSurname.sendKeys("Tundur");
		
		//Entering Email address or Mobile no
		WebElement mblNo = driver.findElement(By.name("reg_email__"));
		mblNo.sendKeys("rachitundu@gmail.com");
		
		//Re-enter email address field
		WebElement emailconfirm = driver.findElement(By.name("reg_email_confirmation__"));
		emailconfirm.sendKeys("rachitundu@gmail.com");
		
		//Enter Password
		WebElement Paswrd = driver.findElement(By.id("password_step_input"));
		Paswrd.sendKeys("R@chi123");
		// Select Class in Selenium is used to handle DropDown
		// Select class has 3 functions which is used for handling drop down
		// Those Functions are Select By Value, Select by Index, Select by
		// Visible Text
		Thread.sleep(3000); // waiting for 3 sec to pause our execution
		// Selecting dropdown by Index
		WebElement DobDayDropdown = driver.findElement(By.id("day"));
		Select sel = new Select(DobDayDropdown);
		sel.selectByIndex(0);

		WebElement DobMonthDropdown = driver.findElement(By.id("month"));
		Select sel1 = new Select(DobMonthDropdown);
		// sel1.selectByIndex(9);
		// sel1.selectByVisibleText("Nov");
		sel1.selectByValue("10");

		WebElement DobYear = driver.findElement(By.name("birthday_year"));
		Select sel2 = new Select(DobYear);
		sel2.selectByValue("2005");

	}

}
