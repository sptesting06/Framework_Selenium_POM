package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class AddCustomerTestPage {
	WebDriver driver;
	
	@Test
	public void validUserShouldBeAbleToLogin () throws InterruptedException {
	driver = BrowserFactory.init();

	LoginPage loginpage = PageFactory.initElements(driver,LoginPage.class);
	loginpage.loginELement("demo@techfios.com");
	loginpage.passwordElement("abc123");
	loginpage.signInElement();
	
	AddCustomerPage addcustomerpage = PageFactory.initElements(driver, AddCustomerPage.class);
	
	addcustomerpage.customerElement();
	addcustomerpage.addCustomerElement();
	
	Thread.sleep(3000);
	addcustomerpage.fullname("Manish Mehta");
	addcustomerpage.companyDropdown("BITS");
	addcustomerpage.email("1g@bbo.com");
	addcustomerpage.phone("8899");
	addcustomerpage.address("44");
	addcustomerpage.city("Dallas");
	addcustomerpage.state("Texas");
	addcustomerpage.zipcode("99555");
	addcustomerpage.countryDropdown("United States");
	addcustomerpage.submit();
			
			
	DashboardPage dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
	dashboardpage.AddCustomerPageChk();
	
	
	//BrowserFactory.tearDown();
	
	}
	
	
	
}

