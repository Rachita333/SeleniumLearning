package selXL;

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

public class RegistrationDataDrivenTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://newtours.demoaut.com/");

		// getting data from xl
		FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\TestData\\RegisterCust.xlsx");

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

			// Registration link
			WebElement registerLink = driver.findElement(By.linkText("REGISTER"));
			registerLink.click();

			// Contact Information
			WebElement txtBoxFristName = driver.findElement(By.name("firstName"));
			txtBoxFristName.sendKeys(firstName);
			WebElement txtBoxLastName = driver.findElement(By.name("lastName"));
			txtBoxLastName.sendKeys(lastName);
			WebElement txtBoxPhone = driver.findElement(By.name("phone"));
			txtBoxPhone.sendKeys(phone);
			WebElement txtBoxEmail = driver.findElement(By.id("userName"));
			txtBoxEmail.sendKeys(email);

			// Mailing Information
			WebElement txtBoxAddress = driver.findElement(By.name("address1"));
			txtBoxAddress.sendKeys(address);
			WebElement txtBoxCity = driver.findElement(By.name("city"));
			txtBoxCity.sendKeys(city);
			WebElement txtBoxState = driver.findElement(By.name("state"));
			txtBoxState.sendKeys(state);
			WebElement txtBoxPostCode = driver.findElement(By.name("postalCode"));
			txtBoxPostCode.sendKeys(pincode);
			WebElement dropDownCountry = driver.findElement(By.name("country"));
			Select selCountry = new Select(dropDownCountry);
			selCountry.selectByVisibleText(country);

			// User Information
			WebElement txtBoxUserName = driver.findElement(By.id("email"));
			txtBoxUserName.sendKeys(userName);
			WebElement txtBoxPassword = driver.findElement(By.name("password"));
			txtBoxPassword.sendKeys(password);
			WebElement txtBoxConfirmPassword = driver.findElement(By.name("confirmPassword"));
			txtBoxConfirmPassword.sendKeys(password);
			WebElement btnSubmit = driver.findElement(By.name("register"));
			btnSubmit.click();

			if (driver.getPageSource().contains(firstName)) {
				System.out.println("Registration completed for " + row + " record");
			}

			else {
				System.out.println("Registration failed for " + row + " record");
				Assert.fail();
			}
		}

		System.out.println("Data Driven test completed");

		driver.close();
		file.close();

	}

}
