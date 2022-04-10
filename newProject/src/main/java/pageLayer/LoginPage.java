package pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class LoginPage extends TestBase {

	@FindBy(xpath="//input[@id='username']")
	private WebElement username;


	@FindBy(xpath="//input[@class='textField pwdfield']")
	private WebElement password;


	@FindBy(xpath="//div[text()='Login ']")
	private WebElement login;

	@FindBy(xpath="//a[contains(text(), 'Logout')]")
	private WebElement logout;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}
	public void setUserName() {
		username.sendKeys("admin");
	}
	public void setPassword() {
		password.sendKeys("manager");
	}
	public void verifyLogin() {
		login.click();
	}

	public void verifylogout() {
		logout.click();
	}
}
