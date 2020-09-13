package selBasic;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandelingMultipleTabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/r.php?locale=en_GB&display=page");
		// click on terms link

		WebElement termsLink = driver.findElement(By.linkText("Terms"));
		termsLink.click();

		// getting handel of 1st window
		String firstWindowhandel = driver.getWindowHandle();
		System.out.println("First window handel is " + firstWindowhandel);

		for (String winHandel : driver.getWindowHandles()) {
			driver.switchTo().window(winHandel);
		}

		String secondWindowhandel = driver.getWindowHandle();
		System.out.println("Second window handel is " + secondWindowhandel);

		// checking whether signup btn present on 2nd page
		Thread.sleep(2000);
		WebElement signUpbtn = driver.findElement(By.xpath("//*[@id='blueBarDOMInspector']/div/div[2]/div/div/span/a"));
		signUpbtn.isDisplayed();
		System.out.println("Sign up button displayed " + signUpbtn.isDisplayed());

		// to get all links present on 2nd tab
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("no of links present on 2nd page are  " + allLinks.size());

		//to get count of duplicate links preset in list.
		int count = 0;
		for (WebElement links : allLinks) {

			String lnkText = links.getText();
			System.out.println(lnkText);

			if (lnkText.equals("Data Policy")) {
				count = count + 1;
			}

		}

		System.out.println(count);

		
		//i want to get unique links for the list
		//for this i have converted list into set because set will allow only unique element.
		HashSet<String> hst = new HashSet<String>();

		for (WebElement links : allLinks) {

			String uniqueLinkTxt = links.getText();

			hst.add(uniqueLinkTxt);

		}

		System.out.println("no of links present on 2nd page are  " + allLinks.size());

		System.out.println("no of links present on 2nd page which are unique  " + hst.size());

		
		//diff betwn cloas and quit
		//driver.close();//this will close the tab where sel is currently focusing
		//driver.quit();//it will close all window opend by sel in that particular sessin
		
		//switching to 1st window
		driver.switchTo().window(firstWindowhandel);
		

		WebElement fistName = driver.findElement(By.name("firstname"));
		fistName.sendKeys("Learning sele");
		Thread.sleep(3000);
		driver.close();
	}

	
	
	
	
}
