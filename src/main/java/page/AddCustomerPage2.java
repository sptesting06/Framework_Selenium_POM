package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddCustomerPage2 extends BasePage {
	
	WebDriver driver;
	
	public AddCustomerPage2(WebDriver driver) {
		this.driver = driver;
	}
	
		//WebElements

		@FindBy(how = How.XPATH, using="//span[contains(text(),'Customers')]") WebElement CustomerButton;
		@FindBy(how = How.XPATH, using="//a[contains(text(),'Add Customer')]") WebElement AddCustomer;

		@FindBy(how = How.XPATH, using="//input[@id='account']") WebElement FullName;
		@FindBy(how = How.XPATH, using="//select[@id='cid']") WebElement CompanyDropDown;
		@FindBy(how = How.XPATH, using="//input[@name='email']") WebElement Email;
		@FindBy(how = How.XPATH, using="//input[@id='phone']") WebElement Phone;
		@FindBy(how = How.XPATH, using="//input[@id='address']") WebElement Address;
		@FindBy(how = How.XPATH, using="//input[@id='city']") WebElement City;
		@FindBy(how = How.XPATH, using="//input[@id='state']") WebElement State;
		@FindBy(how = How.XPATH, using="//input[@id='zip']") WebElement Zipcode;
		@FindBy(how = How.XPATH, using="//select[@id='country']") WebElement Country;
		@FindBy(how = How.XPATH, using="//button[@id='submit']") WebElement Save;

		

		//Methods
	
		public void customerElement() {
			wait(driver,15,CustomerButton);
			CustomerButton.click();
			
		}
		public void addCustomerElement() {
			AddCustomer.click();
			
		}
		public void fullname(String fullname) {
			FullName.sendKeys(fullname+randomnumber(99));
			
		}
		public void companyDropdown(String company) {
			selectFromDropdown(CompanyDropDown, company);
			
		}
		public void email(String email) {
			Email.sendKeys(randomnumber(999)+email);
	}
		public void phone(String phone) {
			Phone.sendKeys(randomnumber(999)+phone);
	}
		public void address(String address) {
			Address.sendKeys(randomnumber(999)+address);
	}
		public void city(String city) {
			City.sendKeys(city);
	}
		public void state(String state) {
			State.sendKeys(state);
	}
		public void zipcode(String zipcode) {
			Zipcode.sendKeys(zipcode);
	}
		
		public void countryDropdown(String country) {
			selectFromDropdown(Country, country);
			
		}
		public void submit() {
			Save.click();
			
		}
		
}


