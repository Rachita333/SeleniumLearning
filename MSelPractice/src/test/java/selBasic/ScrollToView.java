package selBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollToView {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://html.com/input-type-file/");
		driver.manage().window().maximize();

		Thread.sleep(2000);

		WebElement uploadFile = driver.findElement(By.id("fileupload"));
		//goButton.click();
		scrollToElementView(uploadFile);
		Thread.sleep(5000);
		uploadFile.sendKeys("D:\\SeleniumTraining\\Screenshot\\Screenshots.jpeg");
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();

	}
	
	public static void scrollToElementView(WebElement element)
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
	}

}
