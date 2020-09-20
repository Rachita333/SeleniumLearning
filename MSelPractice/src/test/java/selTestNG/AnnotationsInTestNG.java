package selTestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsInTestNG {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I am in before suite");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("I am in before Test");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("I am in before Class  Annotations");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am in before method");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I am in after suite");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("I am in after Test");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("I am in after Class for Annotations");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("I am in after method");
	}

	@Test
	public void testm() {
		System.out.println("In test M");
	}

	@Test(priority = 2)
	public void testa() {
		System.out.println("In test a");
	}

	@Test(priority = 1)
	public void testb() {
		System.out.println("In test b");
	}

	@Test
	public void tests() {
		System.out.println("In test s");
	}

	@Test
	public void testd() {
		System.out.println("In test d");
		Assert.fail();
	}

}
