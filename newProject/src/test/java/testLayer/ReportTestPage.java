package testLayer;

import org.testng.annotations.Test;

import testBase.TestBase;

public class ReportTestPage extends TestBase {

	@Test
	public void setReport() {
		l.setUserName();
		l.setPassword();
		l.verifyLogin();
		r.clickOnLogout();

	}


}
