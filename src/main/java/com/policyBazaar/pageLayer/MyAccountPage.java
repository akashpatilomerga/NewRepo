package com.policyBazaar.pageLayer;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.policyBazaar.testbase.TestBase;

public class MyAccountPage extends TestBase{
	
	@FindBy(className="textCapitalize sc-ckVGcZ kWpXlQ") private WebElement userName_field;
	
	@FindBy(xpath="//p[text()='Logout']") private WebElement logout_btn;
	
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getProfileName() {
		String statusName= userName_field.getText();
		return statusName;
	}
	
	public void clickOnLogoutButton() {
		logout_btn.click();
	}

}
