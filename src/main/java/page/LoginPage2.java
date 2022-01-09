package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage2 {
	WebDriver driver;
	
	public LoginPage2(WebDriver driver) {
		this.driver = driver;
	}
	
	//WebElements
	
	@FindBy(how = How.XPATH, using = "//input[@id='username']") WebElement Login;
	@FindBy(how = How.XPATH,using = "//input[@id='password']") WebElement Password;
	@FindBy(how = How.XPATH, using="//button[contains(text(),'Sign in')]") WebElement SignIn;
	
	//Web Methods
	public void loginELement(String loginName) {
		Login.sendKeys(loginName);
		
	}
	public void passwordElement(String password) {
		Password.sendKeys(password);
	}
	
	public void signInElement() {
		SignIn.click();
		
	}
	
	
	
}

