package selTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestMultiplefile {
	
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("in after calss MT");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("in bfroe calss MT");
	}
	
	@Test
	public void login()
	{
		System.out.println("In login");
	}
	
	@Test
	public void search()
	{
		System.out.println("In search");
	}
	
	@Test
	public void addKart()
	{
		System.out.println("In addkart");
	}
	

	@Test
	public void payment()
	{
		System.out.println("In payment");
	}

}
