package selBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IframeHandeling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://the-internet.herokuapp.com/tinymce");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		// click on terms link

		WebElement firstLine = driver.findElement(By.tagName("h3"));
		String txt = firstLine.getText();
		System.out.println(txt);

		// for switching to frame
		driver.switchTo().frame("mce_0_ifr");

		// Thread.sleep(2000);
		WebElement txtBoxArea = driver.findElement(By.tagName("p"));
		txtBoxArea.clear();
		txtBoxArea.sendKeys("Learning sel");

		driver.switchTo().defaultContent();
		WebElement selLionk = driver.findElement(By.partialLinkText("Elemental"));
		selLionk.click();
		Thread.sleep(2000);
		driver.quit();

	}

}
