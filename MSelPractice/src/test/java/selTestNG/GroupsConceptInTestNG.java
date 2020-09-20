package selTestNG;

import org.testng.annotations.Test;

public class GroupsConceptInTestNG {

	@Test(groups = "Regression")
	public void testCaseOne() {
		System.out.println("Im in testCaseOne - And in Regression Group");
	}

	@Test(groups = "Regression")
	public void testCaseTwo() {
		System.out.println("Im in testCaseTwo - And in Regression Group");
	}

	@Test(groups = "Smoke Test")
	public void testCaseThree() {
		System.out.println("Im in testCaseThree - And in Smoke Test Group");
	}
	
	@Test(groups = "Smoke Test")
	public void testCasefive() {
		System.out.println("Im in testCaseThree - And in Smoke Test Group");
	}

	@Test(groups = "Regression")
	public void testCaseFour() {
		System.out.println("Im in testCaseFour - And in Regression Group");
	}
	
	@Test(groups = "FT")
	public void testCasesix() {
		System.out.println("Im in testCaseThree - And in FT Test Group");
	}
	
	
	@Test(groups = "FT")
	public void testCaseseven() {
		System.out.println("Im in testCaseThree - And in FT Test Group");
	}
	
	@Test(groups = "FT")
	public void testCaseeight() {
		System.out.println("Im in testCaseThree - And in FT Test Group");
	}

}
