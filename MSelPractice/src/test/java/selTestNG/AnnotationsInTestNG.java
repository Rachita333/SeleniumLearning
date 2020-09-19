package selTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnnotationsInTestNG {
	
	
	@Test
	public void testm()
	{
		System.out.println("In test M");
	}
	
	@Test(priority=2)
	public void testa()
	{
		System.out.println("In test a");
	}
	
	
	@Test(priority=1)
	public void testb()
	{
		System.out.println("In test b");
	}
	
	

	@Test
	public void tests()
	{
		System.out.println("In test s");
	}
	

	@Test
	public void testd()
	{
		System.out.println("In test d");
		Assert.fail();
	}

}
