package testLayer;

import org.testng.annotations.Test;

import testBase.TestBase;

public class LoginTestPage extends TestBase {

	@Test
	public void verifyLoginPage() {
		l.setUserName();
		l.setPassword();
		l.verifyLogin();
		l.verifylogout();
	}

}
