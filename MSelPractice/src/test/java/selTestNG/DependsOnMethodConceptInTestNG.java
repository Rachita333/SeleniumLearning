package selTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodConceptInTestNG {

	@Test
	public void loadFacebookURL() {

		System.out.println("Facebook URL loaded.");
		 //Assert.fail();
	}

	/*
	 * registerOnFacebook depends on loadFacebookURL
	 */
	@Test(dependsOnMethods = { "loadFacebookURL" })
	public void registerOnFacebook() {
		System.out.println("Register on Facebook.");
	}

	/*
	 * postStatusOnFacebook depends on registerOnFacebook
	 */
	@Test(dependsOnMethods = { "registerOnFacebook" })
	public void postStatusOnFacebook() {
		System.out.println("Post an status on Facebook.");
	}

}
