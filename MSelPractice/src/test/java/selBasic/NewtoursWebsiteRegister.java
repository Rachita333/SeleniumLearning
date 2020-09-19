package selBasic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewtoursWebsiteRegister {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		// Setup chrome driver and navigate to site and maximize window
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/selenium/newtours/");
		driver.manage().window().maximize();
		
		// getting data from xl
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\RegisterCust.xlsx");

		// C:\Users\rrtundurwar\workspace\MSelPractice\TestData\RegisterCust.xlsx

		// creating workbook
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		// getting sheet
		XSSFSheet worksheet = workbook.getSheet("Sheet1");

		// getting nos of rows from sheet
		int totalRows = worksheet.getLastRowNum();
		
		System.out.println("No of rows in sheet is " + totalRows);

		for (int row = 1; row <= totalRows; row++) {
			XSSFRow currentRow = worksheet.getRow(row);
			String firstName = currentRow.getCell(0).getStringCellValue();
			String lastName = currentRow.getCell(1).getStringCellValue();
			String phone = currentRow.getCell(2).getStringCellValue();
			String email = currentRow.getCell(3).getStringCellValue();
			String address = currentRow.getCell(4).getStringCellValue();
			String city = currentRow.getCell(5).getStringCellValue();
			String state = currentRow.getCell(6).getStringCellValue();
			String pincode = currentRow.getCell(7).getStringCellValue();
			String country = currentRow.getCell(8).getStringCellValue();
			String userName = currentRow.getCell(9).getStringCellValue();
			String password = currentRow.getCell(10).getStringCellValue();
		

		// Click on Register link
		WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
		registerLink.click();

		// Registration form details
		// Contact Information
		WebElement Firstname = driver.findElement(By.name("firstName"));
		Firstname.sendKeys(firstName);

		WebElement Lastname = driver.findElement(By.name("lastName"));
		Lastname.sendKeys(lastName);

		WebElement PhoneNo = driver.findElement(By.name("phone"));
		PhoneNo.sendKeys(phone);

		WebElement EmailAddr = driver.findElement(By.id("userName"));
		EmailAddr.sendKeys(email);

		// Mailing information
		WebElement Addr = driver.findElement(By.name("address1"));
		Addr.sendKeys(address);

		WebElement CityName = driver.findElement(By.name("city"));
		CityName.sendKeys(city);

		WebElement State = driver.findElement(By.name("state"));
		State.sendKeys(state);

		WebElement Pincode = driver.findElement(By.name("postalCode"));
		Pincode.sendKeys(pincode);

		WebElement CountryDropdown = driver.findElement(By.name("country"));
		Select sel = new Select(CountryDropdown);
		sel.selectByVisibleText(country);

		// User Information
		WebElement UserName = driver.findElement(By.id("email"));
		UserName.sendKeys(userName);

		WebElement Passwrd = driver.findElement(By.name("password"));
		Passwrd.sendKeys(password);

		WebElement ConfrmPaswrd = driver.findElement(By.name("confirmPassword"));
		ConfrmPaswrd.sendKeys(password);
	
		Thread.sleep(3000);
		WebElement SubmitButtn = driver.findElement(By.name("submit"));
		SubmitButtn.click();
		
		if(driver.getPageSource().contains(userName))
		{
			System.out.println("Registration completed for " + row + " record");
		}
		
		else
		{
			System.out.println("Registration failed for " + row + " record");
			Assert.fail();
		}

	}
	}
}
