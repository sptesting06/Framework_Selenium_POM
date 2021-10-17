package page;

import java.io.File;


import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	private static final String FileUtils = null;


	public void selectFromDropdown(WebElement element, String visibleText) {
		Select sel1 = new Select(element);
		sel1.selectByVisibleText(visibleText);
		
	}
	
	public int randomnumber(int rnumber) {
		Random ran = new Random();
		int ran1 = ran.nextInt(rnumber);
		return ran1;
		
	}
	
	public void wait(WebDriver driver,int waitTimeSeconds, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, waitTimeSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));	
	}


		
		
	
	
	
	
	
}

