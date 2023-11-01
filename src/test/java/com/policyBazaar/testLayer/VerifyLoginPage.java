package com.policyBazaar.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.policyBazaar.pageLayer.LoginPage;
import com.policyBazaar.pageLayer.MyAccountPage;
import com.policyBazaar.testbase.TestBase;

public class VerifyLoginPage extends TestBase{
	
	@Test
	public void verifyLogin() throws InterruptedException {
		String expected_username = "Pallavi Chaudhari";
		
		login.clickOnSignInWithPasswordButton();
		login.enterMobileNumber("9405888174");
		login.clickOnSignInWithPasswordButton();
		login.enterPassword("pallu12345");
		login.clickOnSigninProfileButton();
		login.clickOnMyAccountButton();
		login.clickOnMyProfileButton();
		Thread.sleep(3000);
		
		String actual_username = myacc.getProfileName();
		Assert.assertEquals(actual_username, expected_username);
		
		Thread.sleep(3000);
		
		
	}

}
