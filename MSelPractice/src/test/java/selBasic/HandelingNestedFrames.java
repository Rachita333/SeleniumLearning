package selBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelingNestedFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://chercher.tech/practice/frames");
		
		String textValue = driver.findElement(By.xpath("//label/span")).getText();
		System.out.println(textValue);
		// switch to frame1
		driver.switchTo().frame("frame1");
		// set the value of the textbar to the value stored
		WebElement txtBox = driver.findElement(By.xpath("//input[@type='text']"));
		txtBox.sendKeys(textValue);
		
		driver.switchTo().frame("frame3");
		
		WebElement chkBox = driver.findElement(By.id("a"));
		chkBox.click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		WebElement dropdown = driver.findElement(By.id("animals"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(1);
				
		
		

	}

}
