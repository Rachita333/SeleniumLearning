package selBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("file:///D:/SeleniumTraining/htmlpages/basic_html_form.html");
		driver.manage().window().maximize();
		// click on terms link

		Thread.sleep(2000);
		WebElement fileUpload = driver.findElement(By.name("filename"));
		fileUpload.sendKeys("C:\\Users\\rrtundurwar\\Desktop\\Breakfix\\practise.PNG");
		
	}

}
