package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageLayer.LoginPage;

public class TestBase {
	public static WebDriver driver;
	public static LoginPage l;
	@BeforeMethod
	public void beforeMethod() {
		String br="chrome";
		if(br.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
		}
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://localhost/login.do");
		l=new LoginPage();

	}
	@AfterMethod
	public void aftermethod() {
		driver.quit();
	}

}
