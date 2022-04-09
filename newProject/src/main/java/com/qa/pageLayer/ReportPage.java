package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class ReportPage extends TestBase{
	
	@FindBy(xpath="//tbody/tr[1]/td[9]/a[1]/img[1]")
	private WebElement logout;
	
	/*@FindBy(xpath="//span[contains(text(),'Create Report')]")
	private WebElement user;
	@FindBy(xpath="//img[@id='closeLightbox']")
	private WebElement close;
	*/
	
	public ReportPage() {
		PageFactory.initElements(driver, this);
	}
	/*public void clickOnReport() {
		report.click();
	}
	public void clickOnUserTab() {
		user.click();
	}
	public void clickOnClose() {
		close.click();
	}*/
	
}
