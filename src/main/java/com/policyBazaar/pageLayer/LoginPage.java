package com.policyBazaar.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.policyBazaar.testbase.TestBase;

public class LoginPage extends TestBase{
	//1. WebElement Declaration
	
	@FindBy(xpath="//a[text()='Sign in']") private WebElement signIn_btn;
	
	@FindBy(xpath="(//input[@type='number'])[1]") private WebElement mobNum_txt;
	
	@FindBy(xpath="(//span[contains(text(),'Sign in with Password')])[2]") private WebElement signWithPassword_btn;
	
	@FindBy(xpath="//input[@name='password']") private WebElement password_txt;
	
	@FindBy(xpath="//a[@id='login-in-with-password']") private WebElement signinProfile_btn;
	
	@FindBy(className="userprofile") private WebElement myAccount_btn;
	
	@FindBy(xpath="(//a[@class='ico-1'])[2]") private WebElement myProfile_btn;
	
	//2. WebElement Initialization with constructor
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	//3. WebElement Actions with methods
	public void clickOnSignButton() {
		signIn_btn.click();
	}
	
	public void enterMobileNumber(String mobNum) {
		mobNum_txt.clear();
		mobNum_txt.sendKeys();
	}
	
	public void clickOnSignInWithPasswordButton() {
		signWithPassword_btn.clear();
		signWithPassword_btn.click();
	}
	
	public void enterPassword(String password) {
		password_txt.sendKeys(password);
	}
	
	public void clickOnSigninProfileButton() {
		signinProfile_btn.click();
	}
	
	public void clickOnMyAccountButton() {
		myAccount_btn.click();
	}
	
	public void clickOnMyProfileButton() {
		myProfile_btn.click();
	}

}
