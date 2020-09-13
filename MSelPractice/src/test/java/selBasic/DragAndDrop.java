package selBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		// click on terms link

		WebElement eleToDrag = driver.findElement(By.id("draggable"));
		WebElement eleToDrop = driver.findElement(By.id("droppable"));
		
		//to control ur keyboard and mouse related activities actions clas is uesd
		//below example is for deag and drop
		//contetclick- right click
		//movetoele- hover
		Actions act = new Actions(driver);
		act.dragAndDrop(eleToDrag, eleToDrop).build().perform();
		act.release();
		
		
		

	}

}
