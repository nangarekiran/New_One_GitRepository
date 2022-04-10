package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class ReportPage extends TestBase{
	
	@FindBy(xpath="//a[contains(text(), 'Logout')]")
	private WebElement logout;
	
	
	
	public ReportPage() {
		PageFactory.initElements(driver, this);
	}
	public void clickOnLogout() {
		logout.click();
	}
}
