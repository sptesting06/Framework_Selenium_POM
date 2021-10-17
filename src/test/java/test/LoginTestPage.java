package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTestPage {
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToLogin () {
	driver = BrowserFactory.init();
		
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class); 
	loginPage.loginELement("demo@techfios.com");
	loginPage.passwordElement("abc123");
	loginPage.signInElement();
	
	DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
	dashboardpage.dashboardchk();
	
	BrowserFactory.tearDown();
	
	}
	
	
	
}

