package page;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage {
	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
		
	}
	//WebElement for Dashboard
	@FindBy(how = How.XPATH, using ="//h2[contains(text(),' Dashboard ')]") WebElement Dashboard;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Welcome Techfios')]") WebElement AddCustomerPageAssert;
	

	//Method for assert
	public void dashboardchk() {
		Assert.assertEquals(Dashboard.getText()," Dashboard ","dash not found");
		
	}
	
	public void AddCustomerPageChk() {
		Assert.assertEquals(AddCustomerPageAssert.getText(),"Welcome Techfios","Welcome Page Not found");
	
	}
	
	
	

}

